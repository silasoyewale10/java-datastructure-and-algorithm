package datastructures.tree;

import stacksandqueues.Queue;

import java.util.ArrayList;

public class BinaryTree {
//    Node root;
    //to be moved
        ArrayList<Integer> preOrder = new ArrayList<>();
//        int [] preOrderArray;
        ArrayList<Integer> inOrder = new ArrayList<>();
        ArrayList<Integer> postOrder = new ArrayList<>();

        public ArrayList<Integer> preOrder(Node runner){  //left , me, right
            if(runner != null) {
//            System.out.println(runner); // prints me.
                preOrder.add(runner.value);
//            System.out.println("preOrder is " + preOrder);
                preOrder(runner.leftOffSpring); //updates the runner to leftoffspring.
                preOrder(runner.rightOffSpring); //updates runner to right;
            }
//            Object [] preOrderArray = preOrder.toArray();

//        }else{
//            return; // do nothing. go to sleep.
//        }
//            return preOrderArray;
            return preOrder;
        }

        public ArrayList<Integer> inOrder(Node runner){  //left , me, right
            if(runner != null){
                inOrder(runner.leftOffSpring); //updates the runner to leftoffspring.
//                System.out.println(runner); // prints new runner which is left.
                inOrder.add(runner.value);
                inOrder(runner.rightOffSpring); //updates runner to right;
            }
//        else{
//            return; // do nothing. go to sleep.
//        }
            return inOrder;
        }
        public ArrayList<Integer> postOrder(Node runner){  //left, right, me
            if(runner != null){
                postOrder(runner.leftOffSpring); //updates the runner to leftoffspring.
                postOrder(runner.rightOffSpring); //updates runner to right;
//                System.out.println(runner); // prints new runner which is left.
                postOrder.add(runner.value);
            }
//        else{
//            return; // do nothing. go to sleep.
//        }
            return postOrder;
        }
}
