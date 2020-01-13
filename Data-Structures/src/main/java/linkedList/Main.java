package linkedList;
import java.util.LinkedList;


public class Main {
    public static void main (String [] args){
        MyLinkedList list1 = new MyLinkedList();

        //populate the list
        list1.populateList("Apple");
        list1.populateList("Orange");
        list1.populateList("Mango");
        list1.populateList("Pawpaw");
        list1.populateList("Strawberry");
        list1.populateList("Blueberry");

        //insert another fruit to the head

        System.out.println( "hshs "+ list1.insert("krr"));


        System.out.println( list1.includes("Blueberry"));


        //toString test
       // expected = { krr } -> { Apple } -> { Orange } -> { Mango } -> { Pawpaw } -> { Strawberry } -> { Blueberry } -> NULL
       // actual = list1.toString();
        //assertEqual(expected, actual);
        list1.toString();


        //includes method test
        //expected = false
        // actual = list1.includes("Guava");
        //assertEqual(expected, actual)

        //expected = true;
        //actual = list1.includes("Apple");
        //assertEqual(expected, actual)

        //insert method
        //actual = list1.insert("krr");
        //expected
            /*  krr
            Apple
            Orange
            Mango
            Pawpaw
            Strawberry */

    }
}

