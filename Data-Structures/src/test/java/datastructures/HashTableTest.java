package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    @Test
    public void testAdd(){
        HashTable x = new HashTable(8);
        x.add("nat", "dad");
        x.add("chellian", "mom");
        x.add("ceelos", "son");
        x.add("love", "cousin");
        x.add("trist", "niece");
        x.add("marly", "nephew");
        x.add("wandast", "street");
        x.add("budapest", "car");

        System.out.println(x);
    }

    @Test
    public void testGetMethodWhenPresent() {
        HashTable x = new HashTable(8);
        x.add("nat", "dad");
        x.add("chellian", "mom");
        x.add("ceelos", "son");
        x.add("love", "cousin");
        x.add("trist", "niece");
        x.add("marly", "nephew");
        x.add("wandast", "street");
        x.add("budapest", "car");

        assertEquals("mom", x.get("chellian"));
        assertEquals("dad", x.get("nat"));
        assertEquals("street", x.get("wandast"));
        assertEquals("cousin", x.get("love"));

    }
    @Test
    public void testGetMethodWhenNotPresent() {
        HashTable x = new HashTable(8);
        x.add("nat", "dad");
        x.add("chellian", "mom");
        x.add("ceelos", "son");
        x.add("love", "cousin");
        x.add("trist", "niece");
        x.add("marly", "nephew");
        x.add("wandast", "street");
        x.add("budapest", "car");

        assertEquals(null, x.get("askd"));
        assertEquals(null, x.get("matthius"));
        assertEquals(null, x.get("code"));
        assertEquals(null, x.get("fellows"));
        assertEquals(null, x.get("seattle"));

    }

    @Test
    public void testContainMethod() {
        HashTable x = new HashTable(8);
        x.add("nat", "dad");
        x.add("chellian", "mom");
        x.add("ceelos", "son");
        x.add("love", "cousin");
        x.add("trist", "niece");
        x.add("marly", "nephew");
        x.add("wandast", "street");
        x.add("budapest", "car");

        assertEquals(false, x.contains("askd"));
        assertEquals(false, x.contains("matthius"));
        assertEquals(false, x.contains("code"));
        assertEquals(false, x.contains("fellows"));
        assertEquals(false, x.contains("seattle"));

        assertEquals(true, x.contains("love"));
        assertEquals(true, x.contains("trist"));
        assertEquals(true, x.contains("nat"));
        assertEquals(true, x.contains("budapest"));

    }

    @Test
    public void testHandleCollision() {
        HashTable x = new HashTable(8);
        x.add("nat", "dad");
        x.add("chellian", "mom");
        x.add("ceelos", "son");
        x.add("love", "cousin");
        x.add("trist", "niece");
        x.add("marly", "nephew");
        x.add("wandast", "street");
        x.add("budapest", "car");
        System.out.println(x.hash("ggj"));
        System.out.println(x.hash("ggj"));
        assertEquals(x.hash("ggj"), x.hash("ggj"));

    }

    @Test
    public void testHashing() {
        HashTable x = new HashTable(2);
        x.add("nat", "dad");
        x.add("chellian", "mom");

        System.out.println(x.hash("ggj"));
        System.out.println(x.hash("ggj"));

        assertTrue(x.hash("nat") <= x.size);
        assertTrue(x.hash("chellian") <= x.size);


    }
}