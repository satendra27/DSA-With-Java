import java.util.*;
public class Graph7 {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src = s;
            this.wt = w;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 3, 10));

        graph[1].add(new Edge(1, 0, 4));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,2));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,6));

        graph[3].add(new Edge(3,0,10));
        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,6));
        graph[3].add(new Edge(3,4,3));

        graph[4].add(new Edge(4,3,3));

    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int n,int c){
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost; //ascending
        }
       
    }
    public static void primsAlgo(ArrayList<Edge> graph[],int V){
            PriorityQueue<Pair> pq = new PriorityQueue<>(); // non mst

            boolean vis[] = new boolean[V]; //mst

            pq.add(new Pair(0,0));
            int mstCost = 0;
            while(!pq.isEmpty()){
                Pair curr = pq.remove();
                if(!vis[curr.node]){
                    vis[curr.node] = true;
                    mstCost += curr.cost;

                    for(int i=0;i<graph[curr.node].size();i++){
                        Edge e = graph[curr.node].get(i);
                        if(!vis[e.dest]){
                            pq.add(new Pair(e.dest,e.wt));
                        }
                    }
                }
                
            }
            System.out.println("Min cost of mst = "+mstCost);
    }
    
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primsAlgo(graph, V);
    }
}
