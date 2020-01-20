package stacksandqueues;

import java.util.EmptyStackException;

public class Stack {
    private Node top;   //pointer or reference to the node

    public Stack(){
        this.top = null; // this gets called once the class is instantiated with the word new.
    }
    public boolean isEmpty(){
        return top == null;
    }

    public void push (int x){
        if(isEmpty()){
            Node n = new Node (x);
            top = n;
        } else {
            Node y = new Node(x);
            y.next = top;  //.next points down
            top = y;  //my top now points to y.
        }
    }
    public int pop() {
        if (!isEmpty()) {
            Node temp = top;
            top = temp.next;
            return temp.data;
        }
        else
            throw new NullPointerException();

    }
    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        throw new EmptyStackException();

    }
    public void printstack() {
        String result = "";
        Node node = top;
        while (node.next != null) {
            System.out.println(node.data);
            result += "{ " + node.data + " } -> ";
            node = node.next;
        }
        String answer = result + "{ " + node.data + " } -> " + "BOTTOM";
//        System.out.println(node.data);
        System.out.println("TOP = " + " " + answer);

//        return answer;
    }
}
