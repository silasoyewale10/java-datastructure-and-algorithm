package datastructures.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test public void testReplaceWithBuzz() {
        //       5
        //    15     7
        //          8  10
        NodeString root = new NodeString("5", new NodeString("15"), new NodeString("7", new NodeString ("9"), new NodeString("10")) );
        FizzBuzzTree tree = new FizzBuzzTree(root);
        tree.replace();
        assertEquals("Buzz",tree.root.value);
    }
    @Test public void testReplaceWithFizz() {
        //       5
        //    15     6
        //          9  10
        NodeString root = new NodeString("5", new NodeString("15"), new NodeString("6", new NodeString ("9"), new NodeString("10")) );
        FizzBuzzTree tree = new FizzBuzzTree(root);
        tree.replace();
        assertEquals("Fizz",tree.root.right.value);
        assertEquals("Fizz",tree.root.right.left.value);
    }
    @Test public void testReplaceWithFizzBuzz() {
        //       15
        //    15     7
        //          8  10
        NodeString root = new NodeString("15", new NodeString("15"), new NodeString("7", new NodeString ("9"), new NodeString("10")) );
        FizzBuzzTree tree = new FizzBuzzTree(root);
        tree.replace();
        assertEquals("FizzBuzz",tree.root.value);
        assertEquals("FizzBuzz",tree.root.left.value);
    }

    @Test public void testTraversal() {
        //       15
        //    15     7
        //          9  10
//        NodeString root =
        NodeString root = new NodeString("15", new NodeString("15"), new NodeString("7", new NodeString("9"), new NodeString("10")));
        FizzBuzzTree tree = new FizzBuzzTree(root);
        assertEquals("[15, 15, 7, 9, 10]",tree.breadthPrint().toString() );


    }
    @Test public void testTraversalSecond() {

        NodeString root2 = new NodeString("3");
        root2.left = new NodeString("4", new NodeString("9"),null);
        root2.right = new NodeString("5", new NodeString("10", null,null),null);
        FizzBuzzTree tree = new FizzBuzzTree(root2);
        System.out.println(tree.breadthPrint());
        assertEquals("[3, 4, 5, 9, 10]",tree.breadthPrint().toString() );

    }
    @Test public void testTraversalThird() {

        NodeString root3 = new NodeString("3");
        FizzBuzzTree tree = new FizzBuzzTree(root3);

        System.out.println(tree.breadthPrint());
        assertEquals("[3]", tree.breadthPrint().toString());
    }

}