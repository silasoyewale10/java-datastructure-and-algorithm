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

}