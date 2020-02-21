package datastructures.tree;

import stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.Stack;

public class FizzBuzzTree {
    NodeString root;

    public FizzBuzzTree(NodeString root) {
        this.root = root;
    }
    public void replace(){
        replace(this.root);
    }
    private void replace(NodeString runner) {
        if (runner != null){
            int runnerValue = Integer.parseInt(runner.value);
            if(runnerValue % 15 == 0) {       //check if input is greater than
                runner.value = "FizzBuzz";
            }
            else if(runnerValue % 5 == 0) {       //check if input is greater than
                runner.value = "Buzz";
            }
            else if(runnerValue % 3 == 0) {       //check if input is greater than
                runner.value = "Fizz";
            }
            replace(runner.left);
            replace(runner.right);
        }
    }
    public ArrayList breadthPrint() {
        Queue myQueue = new Queue();
        ArrayList myArrayList = new ArrayList();

        if(this.root == null){
            return myArrayList;
        }
        myQueue.enqueue(root);


        while (!myQueue.isEmpty()) {

            NodeString tmp = (NodeString) myQueue.dequeue();
            myArrayList.add(tmp.value);

            if(tmp.left != null){
                myQueue.enqueue(tmp.left);
            }
            if(tmp.right != null){
                myQueue.enqueue(tmp.right);
            }
        }

        return myArrayList;
    }
    public int findMaxValueInATree(){
        int max = Integer.MIN_VALUE;
        int intValue = 0;
        Queue myQueue = new Queue();
        ArrayList myArrayList = new ArrayList();

        if(this.root == null){
            return 0;
        }
        myQueue.enqueue(root);
        while (!myQueue.isEmpty()) {

            NodeString tmp = (NodeString) myQueue.dequeue();
            myArrayList.add(tmp.value);

            if(tmp.left != null){
                myQueue.enqueue(tmp.left);
            }
            if(tmp.right != null){
                myQueue.enqueue(tmp.right);
            }
        }
        for(Object s : myArrayList){
            String str = s.toString();
            intValue = Integer.parseInt(str);
            if(intValue > max){
                max = intValue;
            }
        }
        return max;
    }

//    public ArrayList treeIntersection(BinarySearchTree x, BinarySearchTree y){
//        Queue myQueue = new Queue();
//        ArrayList myArrayList = new ArrayList();
//
//        if(this.root == null){
//            return myArrayList;
//        }
//        myQueue.enqueue(root);
//
//
//        while (!myQueue.isEmpty()) {
//
//            Node tmp = (Node) myQueue.dequeue();
//            myArrayList.add(tmp.value);
//
//            if(tmp.leftOffSpring != null){
//                if(x.root.value == y.root.value){
//                    myArrayList.add(x.root.value);
//                }
//                myQueue.enqueue(tmp.leftOffSpring);
//            }
//            if(tmp.right != null){
//                if(x.root.value == y.root.value){
//                    myArrayList.add(x.root.value);
//                }
//                myQueue.enqueue(tmp.right);
//            }
//        }
//
//        return myArrayList;
//
//    }

}

