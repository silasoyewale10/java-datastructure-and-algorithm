package datastructures.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testPreOrder() {
        BinarySearchTree searchTree = new BinarySearchTree();
        BinaryTree tree = new BinaryTree();

        searchTree.addNode(5);
        searchTree.addNode(8);
        searchTree.addNode(4);
        searchTree.addNode(9);
        searchTree.addNode(2);
        searchTree.addNode(6);

        int[] arr = {5, 4, 2, 8, 6, 9};
        System.out.println(tree.preOrder(searchTree.root));

        int expected1 = (int) tree.preOrder(searchTree.root).toArray()[0];
        int expected2 = (int) tree.preOrder(searchTree.root).toArray()[1];
        int expected3 = (int) tree.preOrder(searchTree.root).toArray()[2];
        int expected4 = (int) tree.preOrder(searchTree.root).toArray()[3];
        int expected5 = (int) tree.preOrder(searchTree.root).toArray()[4];
        int expected6 = (int) tree.preOrder(searchTree.root).toArray()[5];


        assertEquals(expected1, arr[0]);
        assertEquals(expected2, arr[1]);
        assertEquals(expected3, arr[2]);
        assertEquals(expected4, arr[3]);
        assertEquals(expected5, arr[4]);
        assertEquals(expected6, arr[5]);


    }
    @Test
    public void testInOrder() {
        BinarySearchTree searchTree = new BinarySearchTree();
        BinaryTree tree = new BinaryTree();

        searchTree.addNode(5);
        searchTree.addNode(8);
        searchTree.addNode(4);
        searchTree.addNode(9);
        searchTree.addNode(2);
        searchTree.addNode(6);

        int[] arr = {2, 4, 5, 6, 8, 9};
        System.out.println(tree.inOrder(searchTree.root));

        int expected1 = (int) tree.inOrder(searchTree.root).toArray()[0];
        int expected2 = (int) tree.inOrder(searchTree.root).toArray()[1];
        int expected3 = (int) tree.inOrder(searchTree.root).toArray()[2];
        int expected4 = (int) tree.inOrder(searchTree.root).toArray()[3];
        int expected5 = (int) tree.inOrder(searchTree.root).toArray()[4];
        int expected6 = (int) tree.inOrder(searchTree.root).toArray()[5];


        assertEquals(expected1, arr[0]);
        assertEquals(expected2, arr[1]);
        assertEquals(expected3, arr[2]);
        assertEquals(expected4, arr[3]);
        assertEquals(expected5, arr[4]);
        assertEquals(expected6, arr[5]);


    }
    @Test public void testPostOrder() {
        BinarySearchTree searchTree = new BinarySearchTree();
        BinaryTree tree = new BinaryTree();

        searchTree.addNode(5);
        searchTree.addNode(8);
        searchTree.addNode(4);
        searchTree.addNode(9);
        searchTree.addNode(2);
        searchTree.addNode(6);

        int [] arr = {2, 4, 6, 9, 8, 5};
        System.out.println(tree.postOrder(searchTree.root));

        int expected1 = (int)tree.postOrder(searchTree.root).toArray()[0];
        int expected2 = (int)tree.postOrder(searchTree.root).toArray()[1];
        int expected3 = (int)tree.postOrder(searchTree.root).toArray()[2];
        int expected4 = (int)tree.postOrder(searchTree.root).toArray()[3];
        int expected5 = (int)tree.postOrder(searchTree.root).toArray()[4];
        int expected6 = (int)tree.postOrder(searchTree.root).toArray()[5];



        assertEquals(expected1, arr[0]);
        assertEquals(expected2, arr[1]);
        assertEquals(expected3, arr[2]);
        assertEquals(expected4, arr[3]);
        assertEquals(expected5, arr[4]);
        assertEquals(expected6, arr[5]);


    }

        @Test public void testContainsWhenPresent() {
        BinarySearchTree searchTree2 = new BinarySearchTree();

        searchTree2.addNode(8);
        searchTree2.addNode(4);
        searchTree2.addNode(7);
        searchTree2.addNode(3);
        searchTree2.addNode(13);
        searchTree2.addNode(43);


        assertTrue(searchTree2.contains(8));
        assertTrue(searchTree2.contains(4));
        assertTrue(searchTree2.contains(7));
        assertTrue(searchTree2.contains(3));
        assertTrue(searchTree2.contains(13));
        assertTrue(searchTree2.contains(43));


        }
    @Test public void testContainsWhenAbsent() {
        BinarySearchTree searchTree3 = new BinarySearchTree();

        searchTree3.addNode(8);
        searchTree3.addNode(4);
        searchTree3.addNode(7);
        searchTree3.addNode(3);

        assertFalse(searchTree3.contains(6));
        assertFalse(searchTree3.contains(1));
        assertFalse(searchTree3.contains(2));
        assertFalse(searchTree3.contains(56));

    }
    @Test public void testInstantiateEmptyTree() {
        BinarySearchTree searchTree3 = new BinarySearchTree();
        assertEquals(null, searchTree3.root);
    }
    @Test public void testSingleRootNode() {
        BinarySearchTree searchTree3 = new BinarySearchTree();
        searchTree3.addNode(4);
        assertEquals(4, searchTree3.root.value);
    }
    @Test public void testLeftAndRightChildren() {
        BinarySearchTree searchTree3 = new BinarySearchTree();
        searchTree3.addNode(10);
        searchTree3.addNode(7);
        searchTree3.addNode(12);

        assertEquals(7, searchTree3.root.leftOffSpring.value);
        assertEquals(12, searchTree3.root.rightOffSpring.value);

    }

}