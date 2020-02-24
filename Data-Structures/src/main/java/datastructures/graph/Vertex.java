package datastructures.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String name;
    List<Edge> edgesThisVertexIsConnectedTo;

    public Vertex(String name) {
        this.name = name;
        this.edgesThisVertexIsConnectedTo = new ArrayList<>();
    }
}
