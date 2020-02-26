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
        ArrayList vertexesThatAreMyNeighbors = new ArrayList();
        for(Edge edge: iWantAllMyNeighbours.edgesThisVertexIsConnectedTo){
            if(iWantAllMyNeighbours.edgesThisVertexIsConnectedTo.contains(edge)){
                vertexesThatAreMyNeighbors.add(edge.connectionNode.name);
                vertexesThatAreMyNeighbors.add(edge.weight);
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
    public List<Vertex> breadthFirst(Vertex v){

     Set<Vertex> alreadySeen = new HashSet<>();
     Queue<Vertex> queue = new LinkedList<>();
     List<Vertex> output = new LinkedList<>();



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
            output.add(currentVertex);
        }
        return output;
    }


    public void getEdge(Graph g, Vertex [] arr) throws IndexOutOfBoundsException{
        Graph gg = new Graph();

        for(int i = 0; i < arr.length; i++){
            arr[i] = gg.addVertex(arr[i].name);
            System.out.println("arr at " + i + "is " + arr[i]);
        }
        gg.addEdge(arr[0], arr[1], 200);
        gg.addEdge(arr[1], arr[2], 50);
        gg.addEdge(arr[2], arr[3],180);
        gg.addEdge(arr[3], arr[4], 500);
        gg.addEdge(arr[0], arr[4], 100);

        gg.addEdge(arr[0],arr[2], 400);
        gg.addEdge(arr[2], arr[4], 30);

        System.out.println(getNeighbours(arr[2]));

    }
    public String checkDirectFlightAndCost(Vertex departure, Vertex arrival){
        String answer = " ";
        if(getNeighbours(departure).contains(arrival)){
            answer = "True";
        }
        else{
            answer = "False";
        }
        int cost = 0;
        for(Edge edge : departure.edgesThisVertexIsConnectedTo){
            if(edge.connectionNode == arrival){
                cost = edge.weight;
            }
            else{
                cost = 0;
            }
        }
        return answer + " " + "$"+cost;

    }

}
