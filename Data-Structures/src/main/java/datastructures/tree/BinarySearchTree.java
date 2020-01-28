package datastructures.tree;

public class BinarySearchTree {
    Node root;
    //    Node runner;
    public void addNode(int value){
        Node newNode = new Node (value);  //create new node with value and name
        if(root == null){     //check if root exists. if it doesn't, new node becomes the root.
            root = newNode;
        }
        else{       //if root already exists, make root the pivot point of reference for left and right nodes as well as parent.
            Node runner = root;
            Node parent;
            while (true) {
                parent = runner;
                if (value < runner.value) {   //if value of new node is lesser than the current, go to the left.
                    runner = runner.leftOffSpring;
                    if (runner == null) {  //if nothing exists on the left
                        parent.leftOffSpring = newNode; //left == new node
                        return;
                    }

                } else {   // if value of new node is lesser than the current, go to the left else, right.
                    runner = runner.rightOffSpring;
//                    break;
                    if (runner == null) {  //no children
                        parent.rightOffSpring = newNode;
                        return;
                    }
                }
            }
        }
    }
    public boolean contains(int lookingFor){
        Node runner = root;
        if(lookingFor == runner.value){
            return true;
        }
        System.out.println("runner.value = " + runner.value);
        while(runner.value != lookingFor){
            if(lookingFor < runner.value){
                runner = runner.leftOffSpring;
                if(runner.value == lookingFor){
                    return true;
                }
//                System.out.println("runner. value" + runner.value);
            }
            else{
                runner = runner.rightOffSpring;
                if(runner.value == lookingFor){
                    return true;
                }
            }

//            return false;
        }
        return false;

    }
//    public String toString(Node runner){
//        System.out.println("HI");
////        String result = "";
//////        runner = root;
////        while (runner != null){
////            result += runner.value;
////        }
////        return "First is " + result + "Last";
//        return "HI";
//    }


}
