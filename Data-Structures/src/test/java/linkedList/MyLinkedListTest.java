package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void testToStringMethod() {  //prints out the list in a particular format
        MyLinkedList list1 = new MyLinkedList();

        //populate the list
        list1.append("Apple");
        list1.append("Orange");
        list1.append("Mango");
        list1.append("Pawpaw");
        list1.append("Strawberry");
        list1.append("Blueberry");

//        System.out.println( list1.toString());
        assertEquals("{ Apple } -> { Orange } -> { Mango } -> { Pawpaw } -> { Strawberry } -> { Blueberry } -> NULL",list1.toString());
        Node current = list1.getHead();
        assertEquals(current.data, "Apple"  );

    }
    @Test public void testIncludesMethod() { // checks if the data is contained in the list
        MyLinkedList list1 = new MyLinkedList();

        list1.append("Apple");
        list1.append("Orange");
        list1.append("Mango");
        list1.append("Pawpaw");
        list1.append("Strawberry");
        list1.append("Blueberry");

        //expected false
        assertFalse(list1.includes("Guava"));

        //expected true;
        assertTrue(list1.includes("Apple"));

    }
    @Test public void testInsertMethodAndInsertBeforeFirstNode() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();

        list1.append("Apple");
        list1.append("Orange");
        list1.append("Mango");
        list1.append("Pawpaw");


        //insert Potatoes to the head.
        list1.insert("Potatoes");
        assertEquals("{ Potatoes } -> { Apple } -> { Orange } -> { Mango } -> { Pawpaw } -> NULL",list1.toString());


    }
    @Test public void testEmptyLinkedList() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("");
        assertEquals("{  } -> NULL", list1.toString());

    }

    @Test public void testAppendAndMultipleNodesToTheEndOfTheList() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("gh");
        list1.append("vb");
        list1.append("u");
        list1.toString();
        assertEquals("{ gh } -> { vb } -> { u } -> NULL", list1.toString());


    }
    @Test public void testInsertBeforeNodeInTheMiddle() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Tim");
        list1.append("Blake");
        list1.append("Jim ");
//        list1.insertBefore("vb", "new");
        list1.insertBefore("Blake", "Chelsea");

        assertEquals("{ Tim } -> { Chelsea } -> { Blake } -> { Jim  } -> NULL", list1.toString());
    }
    @Test public void testInsertAfterAndAfterLastNode() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Brittany");
        list1.append("Ashley");
        list1.append("Carmille");
        list1.insertAfter("Carmille", "Langgy");
        list1.insertAfter("Ashley", "Jessica");

        assertEquals("{ Brittany } -> { Ashley } -> { Jessica } -> { Carmille } -> { Langgy } -> NULL", list1.toString() );
    }

    @Test public void testKthGreaterThanListLength() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Brittany");
        list1.append("ljhugh");
        list1.append("Ashl");
        list1.append("Ashley");
        list1.append("fghiu");
        list1.append("fgpoi");
        list1.append("fgp");
        list1.append("fg");
        list1.append("fghiuyt");
//        System.out.println("gfgfgfghfgh " + list1.kthFromEnd(30));
//        assertEquals(new IndexOutOfBoundsException("k is larger than the length of the linked list"),list1.kthFromEnd(30));
        try{
            list1.kthFromEnd(30);
        }catch(IndexOutOfBoundsException e){  //e checks the message that indexoutofexception causes
            assertEquals("k is larger than the length of the linked list", e.getMessage());
        }
    }

    @Test public void testKthKSameAsListLength() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Brittany");
        list1.append("ljhugh");
        list1.append("Ashl");
        list1.append("Ashley");
        list1.append("fghiu");
        list1.append("fgpoi");
        list1.append("fgp");
        list1.append("fg");
        list1.append("fghiuyt");

        assertEquals("Brittany",list1.kthFromEnd(8));
    }
    @Test public void testKthKNotPositiveNumber() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Brittany");
        list1.append("ljhugh");
        list1.append("Ashl");
        list1.append("Ashley");
        list1.append("fghiu");
        list1.append("fgpoi");
        list1.append("fgp");
        list1.append("fg");
        list1.append("fghiuyt");

        assertEquals("can't find it",list1.kthFromEnd(-1));
    }
    @Test public void testKthListSizeOne() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Brittany");
        list1.append("Ashley");

        assertEquals("Brittany", list1.kthFromEnd(1));
    }

    @Test public void testKthKInTheMiddle() {   //checks if what is provided is inserted into the head of the linked list
        MyLinkedList list1 = new MyLinkedList();
        list1.append("Brittany");
        list1.append("ljhugh");
        list1.append("Ashl");
        list1.append("Ashley");
        list1.append("fghiu");
        list1.append("fgpoi");
        list1.append("fgp");
        list1.append("fg");
        list1.append("fghiuyt");

        assertEquals("Ashley",list1.kthFromEnd(5));
    }

    @Test public void testLinkedListMergeNormalLists() {

        System.out.println("merging linked lists start here");

        MyLinkedList list1 = new MyLinkedList();
        list1.append("one");
        list1.append("two");
        list1.append("three");
        list1.append("four");

        MyLinkedList list2 = new MyLinkedList();
        list2.append("five");
        list2.append("six");
        list2.append("seven");
        try{
            MyLinkedList merger = new MyLinkedList();
            System.out.println("merger normal lists "+ merger.mergeList(list1, list2).toString());

            assertEquals("{ one } -> { five } -> { two } -> { six } -> { three } -> { seven } -> { four } -> NULL", merger.mergeList(list1, list2).toString());

        }catch(NullPointerException e){
            e.getMessage();
        }

    }

    @Test public void testLinkedListMergeEmptyList() {

        System.out.println("merging empty linked lists start here");

        MyLinkedList list1 = new MyLinkedList();
        list1.append("ab");
        list1.append("cd");

        MyLinkedList list2 = new MyLinkedList();
//        list2.append("ghout");
//        list2.append("out");
        MyLinkedList merger = new MyLinkedList();

        assertEquals("{ ab } -> { cd } -> NULL", merger.mergeList(list1, list2).toString() );

    }

}