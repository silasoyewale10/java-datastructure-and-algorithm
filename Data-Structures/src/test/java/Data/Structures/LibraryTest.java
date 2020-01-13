/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;

import linkedList.MyLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testToStringMethod() {  //prints out the list in a particular format
        MyLinkedList list1 = new MyLinkedList();

        //populate the list
        list1.populateList("Apple");
        list1.populateList("Orange");
        list1.populateList("Mango");
        list1.populateList("Pawpaw");

        System.out.println( list1.toString());


    }
    @Test public void testIncludesMethod() { // checks if the data is contained in the list

    }
    @Test public void testInsertMethod() {   //checks if what is provided is inserted into the head of the linked list

    }

}
