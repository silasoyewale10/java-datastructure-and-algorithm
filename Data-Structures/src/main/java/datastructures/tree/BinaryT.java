package datastructures.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class BinaryT {
    public Node root; //all trees must have this root node.

    public void printTree(BinaryT s) {
        while (s.root != null) {
            System.out.println(root.value);
            root = root.leftOffSpring;
            root = root.rightOffSpring;
        }
    }

    public static ArrayList<Integer> intersect(BinaryT x, BinaryT y) {  //left , me, right
        System.out.println("here");
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
                ans.remove(temp.value);
            }
            if (temp.leftOffSpring != null) {
                nodes.add(temp.leftOffSpring);
            }
            if (temp.rightOffSpring != null) {
                nodes.add(temp.rightOffSpring);
            }

        }
        System.out.println("inOrder = " + inOrder);
        return inOrder;
    }
}


