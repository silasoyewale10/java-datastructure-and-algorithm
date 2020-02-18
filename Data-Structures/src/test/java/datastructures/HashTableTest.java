package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {
    @Test
    public void testAdd(){
        HashTable x = new HashTable(4);
        x.add("nat", "dad");
        x.add("caroline", "mom");
        x.add("silas", "son");
        x.add("love", "daughter");
        System.out.println(x.toString());

        System.out.println(x.get("son"));
    }
//    //{
//    "nat" : 777754;
//    "caroline": 84393
//    // }
//    x.get("nat") return 7777754.

}