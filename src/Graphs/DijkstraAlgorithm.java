package Graphs;
import java.util.*;

public class DijkstraAlgorithm {
    int V;
    List<List<int[]>> graph = new ArrayList<>();
    DijkstraAlgorithm(int V) { this.V = V; }

    public void addEdge(int u, int v, int w) {
        graph.get(u).add(new int[]{v, w});
        graph.get(v).add(new int[]{u, w});
    }

    public void displayGraph() {
        for(int u=0; u < graph.size(); u++) {
            System.out.print(u + " : ");
            for(int v=0; v < graph.get(u).size(); v++) {
                System.out.print("{ " + graph.get(u).get(v)[0] + " , " + graph.get(u).get(v)[1] + " } ");
            }
            System.out.println();
        }
    }

    public void dijkstraAlgorithm(List<List<int[]>> graph, int start) {
//        int count =0;
        int[] cost = new int[V];
        Arrays.fill(cost, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        cost[start] = 0;
        pq.add(new int[] {start, 0});
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0]; int w = curr[1];
            for(int i=0; i < graph.get(u).size(); i++) {
                int[] next = graph.get(u).get(i);
                int v = next[0]; int d = next[1];
                if(cost[u] + d < cost[v]) {
                    cost[v] = cost[u] + d;
                    pq.add(new int[] {v, cost[v]});
                }
                //System.out.println(curr[0] + " " + cost[v]);
//                if(curr[0]==cost[v]){
//                    count++;
//                }

            }
        }
        int min = cost[V-1];
//        System.out.println(count);
        for(int i=0; i < V; i++) System.out.print(cost[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        DijkstraAlgorithm obj = new DijkstraAlgorithm(7);
        for(int i=0; i < obj.V; i++)
            obj.graph.add(new ArrayList<>(i));

        obj.addEdge(0, 4, 5);
        obj.addEdge(0, 6, 7);
        obj.addEdge(0, 1, 2);
        obj.addEdge(1, 2, 3);
        obj.addEdge(1, 3, 3);
        obj.addEdge(4, 6, 2);
        obj.addEdge(2, 5, 1);
        obj.addEdge(3, 6, 3);
        obj.addEdge(3, 5, 1);
        obj.addEdge(5, 6, 1);
        // System.out.println(obj.graph);
        // obj.displayGraph();
        obj.dijkstraAlgorithm(obj.graph, 0);
    }
}