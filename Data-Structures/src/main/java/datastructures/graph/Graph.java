package datastructures.graph;

import java.util.*;

public class Graph {
    HashSet<Vertex> allVertexes ;

    public Graph(){ // creates pointers
        allVertexes = new HashSet<>();
    }
    public Vertex addVertex(String nameOfVertex){
        Vertex nn = new Vertex(nameOfVertex);
        nn.name = nameOfVertex;
        allVertexes.add(nn);
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
    public ArrayList getNeighbours(Vertex iWantAllMyNeighbours){
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
    public void breadthFirst(Vertex v){
        allVertexes.add(v);
        Queue<String> queue = new LinkedList<String>();
        boolean [] visited = new boolean[allVertexes.size()];

        for(int j = 0; j < visited.length; j++){
            visited[j]= false;
        }

        for(Vertex a : allVertexes){
            if(a.name == v.name){
                v.isVisited = true;
            }
        }
        queue.add(v.name);

        while(queue.size() !=0){
            v.name = queue.poll();
            System.out.println(v.name);

            Iterator<String> i = getNeighbours(v).iterator();

            for(Object c : getNeighbours(v))
            while(i.hasNext()){
                System.out.println("i is " + i.toString().toUpperCase());
                String n = i.next();
//                if(!)
            }
        }


    }
}
