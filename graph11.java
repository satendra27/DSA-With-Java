// Cycle check in directed graph
import java.util.*;
public class graph11 {
    static class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.dest = d;
            this.src = s;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[],int V){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        // graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,0)); 
    }

    public static boolean isCycleDirected(ArrayList<Edge>graph[],int curr,boolean vis[],boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!vis[e.dest]){
                if(isCycleDirected(graph, e.dest, vis, rec)){
                    return true;
                }
                
            }
        }
        rec[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int V=3;
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        createGraph(graph,V);
        System.out.println(isCycleDirected(graph, 0, vis, rec));
        
    }
}
