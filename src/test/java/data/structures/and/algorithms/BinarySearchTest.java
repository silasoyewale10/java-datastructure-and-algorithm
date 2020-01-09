package data.structures.and.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
BinarySearch obj = new BinarySearch();
    //tests here
    @Test public void testBinarySearch() {
        int [] arr = {1,2,3,4,5,6,7,9};
        int look = 5;
        assertEquals(4, obj.binarySearch(arr,look));
    }

    @Test public void testBinarySearch2() {
        BinarySearch obj = new BinarySearch();

        int [] arr = {1,2,3,4,5,6,7,9};
        int look = 8;
        assertEquals(-1, obj.binarySearch(arr,look));
    }

    @Test public void testBinarySearch3() {
        BinarySearch obj = new BinarySearch();

        int [] arr = {};
        int look = 4;
        assertEquals(-1, obj.binarySearch(arr,look));
    }
}