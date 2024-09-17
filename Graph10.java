import java.util.*;

class Graph10 {
    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge compareEdge) {
            return this.wt - compareEdge.wt;
        }
    }

    static class Subset {
        int parent, rank;
    }

    static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    static void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank) {
            subsets[xroot].parent = yroot;
        } else if (subsets[xroot].rank > subsets[yroot].rank) {
            subsets[yroot].parent = xroot;
        } else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    public static void kruskal(ArrayList<Edge> edges, int V) {
        Collections.sort(edges);
        

        Subset[] subsets = new Subset[V];
        for (int i = 0; i < V; ++i) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }

        int mstCost = 0;
        ArrayList<Edge> result = new ArrayList<>();

        for (Edge edge : edges) {
            int x = find(subsets, edge.src);
            int y = find(subsets, edge.dest);

            if (x != y) {
                result.add(edge);
                mstCost += edge.wt;
                union(subsets, x, y);
            }
        }

        System.out.println("The minimum cost is: " + mstCost);
        for (Edge edge : result) {
            System.out.println(edge.src + " -- " + edge.dest + " == " + edge.wt);
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 4));
        edges.add(new Edge(0, 3, 10));
        edges.add(new Edge(1, 0, 4));
        edges.add(new Edge(1,2,1));
        edges.add(new Edge(1,3,2));
        edges.add(new Edge(2,1,1));
        edges.add(new Edge(2,3,6));
        edges.add(new Edge(3,0,10));
        edges.add(new Edge(3,1,2));
        edges.add(new Edge(3,2,6));
        edges.add(new Edge(3,4,3));
        edges.add(new Edge(4,3,3));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskal(edges, V);
    }
}

