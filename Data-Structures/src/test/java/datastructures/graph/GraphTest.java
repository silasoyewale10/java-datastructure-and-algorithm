package datastructures.graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void testAddVertex(){
        Graph gg = new Graph();
        gg.addVertex("Oklahoma");
        gg.addVertex("Edmund");
        gg.addVertex("Sill");
        gg.addVertex("Lawton");
        gg.addVertex("Chickasha");

        String expected1 = "Oklahoma";
        String expected2 = "Edmund";
        String expected3 = "Sill";
        String expected4 = "Lawton";
        String expected5 = "Chikasha";

        assertTrue(expected1.equals(gg.addVertex("Oklahoma").name));
        assertTrue(expected2.equals(gg.addVertex("Edmund").name));
        assertTrue(expected3.equals(gg.addVertex("Sill").name));
        assertTrue(expected4.equals(gg.addVertex("Lawton").name));
        assertTrue(expected5.equals(gg.addVertex("Chikasha").name));

    }

    @Test public void testAddEdge(){
        Graph gg = new Graph();
        //all vertices
        Vertex oklahoma = gg.addVertex("Oklahoma");
        Vertex Edmund = gg.addVertex("Edmund");
        Vertex Sill = gg.addVertex("Sill");
        Vertex Lawton = gg.addVertex("Lawton");
        Vertex Chickasha = gg.addVertex("Chickasha");

        gg.addEdge(oklahoma, Edmund, 200);
        gg.addEdge(Sill, Lawton, 250);
        gg.addEdge(Chickasha, Lawton,300);
        gg.addEdge(Chickasha, oklahoma, 350);
        gg.addEdge(Sill, Edmund, 100);

        gg.addEdge(oklahoma,Sill, 200);
        gg.addEdge(Chickasha, Sill, 500);
        gg.addEdge(Edmund, Chickasha, 400);

        System.out.println(gg.getNeighbours(oklahoma).contains(Edmund.name));
        assertTrue(gg.getNeighbours(Sill).contains(Lawton.name));
        assertFalse(gg.getNeighbours(oklahoma).contains(Lawton.name));
        assertTrue(gg.getNeighbours(Chickasha).contains(Edmund.name));
        assertTrue(gg.getNeighbours(Edmund).contains(Sill.name));


    }
    @Test public void testGetNodes(){
        Graph gg = new Graph();
        //all vertices
        Vertex oklahoma = gg.addVertex("Oklahoma");
        Vertex Edmund = gg.addVertex("Edmund");
        Vertex Sill = gg.addVertex("Sill");
        Vertex Lawton = gg.addVertex("Lawton");
        Vertex Chickasha = gg.addVertex("Chickasha");


        System.out.println(gg.getNodes());

        ArrayList expected = new ArrayList();
        expected.add(Sill.name);
        expected.add(Edmund.name);
        expected.add(Chickasha.name);
        expected.add(oklahoma.name);
        expected.add(Lawton.name);
        assertEquals(expected, gg.getNodes());
    }
    @Test public void testGetNeighbors(){

        Graph gg = new Graph();
        //all vertices
        Vertex oklahoma = gg.addVertex("Oklahoma");
        Vertex Edmund = gg.addVertex("Edmund");
        Vertex Sill = gg.addVertex("Sill");
        Vertex Lawton = gg.addVertex("Lawton");
        Vertex Chickasha = gg.addVertex("Chickasha");

        gg.addEdge(oklahoma, Edmund, 200);
        gg.addEdge(Sill, Lawton, 250);
        gg.addEdge(Chickasha, Lawton,300);
        gg.addEdge(Chickasha, oklahoma, 350);
        gg.addEdge(Sill, Edmund, 100);

        gg.addEdge(oklahoma,Sill, 200);
        gg.addEdge(Chickasha, Sill, 500);
        gg.addEdge(Edmund, Chickasha, 400);

        System.out.println(gg.getNeighbours(oklahoma));
        ArrayList expected = new ArrayList();
        expected.add(Edmund);
        expected.add(200);
        expected.add(Chickasha);
        expected.add(350);
        expected.add(Sill);
        expected.add(200);

        System.out.println(gg.getNeighbours(oklahoma));
    }
    @Test public void testGetSize(){ //good to go
        Graph gg = new Graph();
        Vertex oklahoma = gg.addVertex("Oklahoma");
        Vertex Edmund = gg.addVertex("Edmund");
        Vertex Sill = gg.addVertex("Sill");
        Vertex Lawton = gg.addVertex("Lawton");
        Vertex Chickasha = gg.addVertex("Chickasha");

        assertEquals(5, gg.size());
    }
}