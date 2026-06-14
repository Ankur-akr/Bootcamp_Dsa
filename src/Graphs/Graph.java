package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    int V;                       //no. of vertices
    int [][] graph;              //2D matrix
    Graph(int V){
        this.V = V;
        this.graph = new int[V][V];
    }
    public void dfs(int start){
        boolean[] visited = new boolean[V];
        Arrays.fill(visited,false);
        dfsUtil(start, visited);

    }
    public void dfsUtil(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start+" ");
        for (int v = 0; v < V; v++) {
            if(graph[start][v]==1 && !visited[v]){
                dfsUtil(v,visited);
            }
        }
    }
    public void bfs(int start){
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        bfsUtil(start,vis);
    }
    public void bfsUtil(int start , boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        vis[start] = true;
        q.offer(start);
        while (!q.isEmpty()){
            start = q.poll();
            System.out.print(start+ " ");
            for (int v = 0; v < V; v++) {
                if(graph[start][v]==1 && !vis[v]){
                    vis[v] =true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.graph = new int[][]{
                {0,1,1,0,0},
                {1,0,0,1,0},
                {1,0,0,0,1},
                {0,1,0,0,1},
                {0,0,1,1,0},
        };
        g.dfs(0);
        System.out.println();
        g.bfs(0);
    }
}
