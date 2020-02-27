package datastructures.graph;

import java.lang.reflect.Array;
import java.util.*;

public class Graph {
    HashSet<Vertex> allVertexes ;
    HashSet<Vertex>todayVertexes;

    public Graph(){ // creates pointers
        allVertexes = new HashSet<>();
        todayVertexes = new HashSet<>();
    }
    public Vertex addVertex(String nameOfVertex){
        Vertex nn = new Vertex(nameOfVertex);
        nn.name = nameOfVertex;
        allVertexes.add(nn);
        return nn;
    }

    public Vertex addVertexVertex(Vertex vertex){
        Vertex nn = new Vertex(vertex.name);
        nn.name = vertex.name;
        todayVertexes.add(nn);
        return nn;
    }

    public void addEdge(Vertex startVertex, Vertex endVertex, int weight){
        Edge pointToEnd = new Edge(endVertex, weight);
        startVertex.edgesThisVertexIsConnectedTo.add(pointToEnd);

        Edge pointBackToStart = new Edge(startVertex, weight);
        endVertex.edgesThisVertexIsConnectedTo.add(pointBackToStart);
    }
    public ArrayList getNodes(){
        ArrayList vertex = new ArrayList();
        for(Vertex v : allVertexes){
            vertex.add(v.name);
        }
        return vertex;
    }
    public ArrayList<Vertex> getNeighbours(Vertex iWantAllMyNeighbours){
        ArrayList<Vertex> vertexesThatAreMyNeighbors = new ArrayList();
        for(Edge edge: iWantAllMyNeighbours.edgesThisVertexIsConnectedTo){
            if(iWantAllMyNeighbours.edgesThisVertexIsConnectedTo.contains(edge)){
                vertexesThatAreMyNeighbors.add(edge.connectionNode);
//                vertexesThatAreMyNeighbors.add(edge.weight);
            }
        }
            return vertexesThatAreMyNeighbors;
    }

    public int size(){
        int vertexCount = 0;
        for( Vertex x : allVertexes){
            vertexCount+=1;
        }
        return vertexCount;
    }

    public String toString(Vertex v){
        return v.name;
    }
    public boolean isConnected(Vertex x, Vertex y){
        return x.edgesThisVertexIsConnectedTo.contains(y.edgesThisVertexIsConnectedTo);
    }
    public List<String> breadthFirst(Vertex v){

     Set<Vertex> alreadySeen = new HashSet<>();
     Queue<Vertex> queue = new LinkedList<>();
     List<String> output = new LinkedList<>();

        queue.add(v);  //added to quque
        alreadySeen.add(v);  //added to set

        while(!queue.isEmpty()){
            Vertex currentVertex = queue.remove();
            for(Edge edge: currentVertex.edgesThisVertexIsConnectedTo){
                if(!alreadySeen.contains(edge.connectionNode)){
                    alreadySeen.add(edge.connectionNode);
                    queue.add(edge.connectionNode);

                }
            }
            output.add(currentVertex.name);
        }
        return output;
    }
    public String getEdge(Graph gg, Vertex [] arr) throws ArrayIndexOutOfBoundsException{
        int sumOfCharges = 0;
        if(arr.length > 1){
            for(int i = 0; i < arr.length-1; i++){
                if(getNeighbours(arr[i]).contains(arr[i+1])){
                    for(Edge e : arr[i].edgesThisVertexIsConnectedTo) {
                        if(e.connectionNode == arr[i+1]){
                            sumOfCharges += e.weight;
                        }
                    }
                }
                else{
                    return "False $0";
                }
            }
            return "True $" + sumOfCharges;
        }
        return "False $0";
    }

    public List<String> depthFirst(Vertex v) {

        Set<Vertex> alreadySeen = new HashSet<>();
        LinkedList<Vertex> queue = new LinkedList<>();
        List<String> output = new LinkedList<>();

        queue.add(v);  //added to quque
        alreadySeen.add(v);  //added to set

        while(!queue.isEmpty()){
            Vertex currentVertex = queue.remove();
            for(Edge edge: currentVertex.edgesThisVertexIsConnectedTo){
                if(!alreadySeen.contains(edge.connectionNode)){
                    alreadySeen.add(edge.connectionNode);
                    queue.addFirst(edge.connectionNode);
                }
            }
            output.add(currentVertex.name);
        }
        return output;
    }
}
