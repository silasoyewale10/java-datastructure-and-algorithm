package datastructures;

import java.util.LinkedList;

public class Graph {
    int numOfPointer;

    LinkedList<String>[] connections; //array of linkedlist of edges
    LinkedList<Edge> edges = new LinkedList<>();

    public Graph(int numOfPointer){ // creates pointers

        this.numOfPointer = numOfPointer;
        connections = new LinkedList[numOfPointer]; // number of vertex.
        for(int i = 0; i < connections.length; i++){
            connections[i] = new LinkedList<>(); //generates adj linked list per pointer/vertex.
        }

    }
    public static void addNode(String valueOfNode){

        Graph x = new Graph(1);
//        x.connections[0] = valueOfNode;
    }
    public void addEdge(String startNode, String endNode, int weight){
        Edge e = new Edge("A", "B", 5);

    }


}
