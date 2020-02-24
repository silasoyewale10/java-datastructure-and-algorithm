package datastructures.graph;

public class Edge {
    Vertex connectionNode;
    int weight;
    public Edge(Vertex connectionNode, int weight){
        this.connectionNode = connectionNode;
        this.weight = weight;
    }
}
