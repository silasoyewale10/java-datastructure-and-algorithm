package linkedList;
import java.util.LinkedList;


public class Main {
    public static void main (String [] args){
        MyLinkedList list1 = new MyLinkedList();

        //populate the list
        list1.append("Apple");
        list1.append("Orange");
        list1.append("Mango");
        list1.append("Pawpaw");
        list1.append("Strawberry");
        list1.append("Blueberry");

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

