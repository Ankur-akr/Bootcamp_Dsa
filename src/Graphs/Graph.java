package Graphs;

public class Graph {
    int V;                       //no. of vertices
    int [][] graph;              //2D matrix
    Graph(int V){
        this.V = V;
        this.graph = new int[V][V];
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
    }
}
