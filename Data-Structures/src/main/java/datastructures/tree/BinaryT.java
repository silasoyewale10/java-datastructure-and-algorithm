package datastructures.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class BinaryT {
    public Node root; //all trees must have this root node.

//    public static void main(String [] args){
//        BinaryT example = new BinaryT();
//        BinaryT example2 = new BinaryT();
//
//        example.createBinaryTree();
//        example2.createBinaryTree();
//
//        BinaryT x = new BinaryT();
//
//        x.intersect(example, example2);
//        System.out.println(x.intersect(example, example2));
////    example.printTree(example);
//    }
//    public void createBinaryTree(){
//        Node newNode1 = new Node(5);
//        Node newNode2 = new Node(15);
//        Node newNode3 = new Node(52);
//        Node newNode4 = new Node(25);
//        Node newNode5 = new Node(85);
//        Node newNode6 = new Node(33);
//        Node newNode7 = new Node(12);
//        Node newNode8 = new Node(7);
//        Node newNode9 = new Node(5);
//        Node newNod10 = new Node(5);
//        Node newNode11 = new Node(5);
//
//        root = newNode1;
//
//
//        newNode1.leftOffSpring = newNode2;
//        newNode1.rightOffSpring = newNode3;
//
//        newNode1.leftOffSpring.leftOffSpring = newNode4;
//        newNode1.leftOffSpring.rightOffSpring = newNode5;
//
//        newNode1.rightOffSpring.leftOffSpring = newNode6;
//        newNode1.rightOffSpring.rightOffSpring = newNode7;
//
//        newNode1.rightOffSpring.rightOffSpring.leftOffSpring = newNode8;
//        newNode1.rightOffSpring.rightOffSpring.rightOffSpring = newNode9;
//
//        newNode1.leftOffSpring.rightOffSpring.leftOffSpring = newNod10;
//        newNode1.leftOffSpring.rightOffSpring.rightOffSpring = newNode11;
//    }

    public void printTree(BinaryT s) {
        while (s.root != null) {
            System.out.println(root.value);
            root = root.leftOffSpring;
            root = root.rightOffSpring;
        }
    }

    public ArrayList<Integer> intersect(BinaryT x, BinaryT y) {  //left , me, right
        ArrayList<Integer> inOrder = new ArrayList<>();
        HashSet<Integer> ans = new HashSet<>();
        Stack<Node> nodes = new Stack<>();
        nodes.add(x.root); //add the root node of tree x to the stack

        while (!nodes.empty()) { //adding all left values to the arraylist.
            Node temp = nodes.pop();
            ans.add(temp.value);  //adding all left values to the arraylist.
            if (temp.leftOffSpring != null) {
                nodes.add(temp.leftOffSpring);
            }
            if (temp.rightOffSpring != null) {
                nodes.add(temp.rightOffSpring);
            }
        } //now i have all my nodes in the stack.

        nodes.add(y.root); //add the root node of tree y to the stack

        while (!nodes.empty()) {
            Node temp = nodes.pop();
            if (ans.contains(temp.value)) {
                inOrder.add(temp.value);
            }
            if (temp.leftOffSpring != null) {
                nodes.add(temp.leftOffSpring);
            }
            if (temp.rightOffSpring != null) {
                nodes.add(temp.rightOffSpring);
            }

        }
        return inOrder;
    }
}


