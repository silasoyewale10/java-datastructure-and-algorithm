package stacksandqueues;

import java.util.EmptyStackException;

public class Stack<E> {
    private Node<E> top;   //pointer or reference to the node

    public Stack(){
        this.top = null; // this gets called once the class is instantiated with the word new.
    }
    public boolean isEmpty(){
        return top == null;
    }

    public void push (E x){
        if(isEmpty()){
            Node<E> n = new Node<>(x);
            top = n;
        } else {
            Node<E> y = new Node<>(x);
            y.next = top;  //.next points down
            top = y;  //my top now points to y.
        }
    }
    public E pop() {
        if (!isEmpty()) {
            Node<E> temp = top;
            top = temp.next;
            return temp.data;
        }
        else
            throw new NullPointerException();

    }
    public E peek(){
        if(!isEmpty()){
            return top.data;
        }
        throw new EmptyStackException();

    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<E> node = top;
        while (node.next != null) {
            System.out.println(node.data);
            result.append("{ ").append(node.data).append(" } -> ");
            node = node.next;
        }
        String answer = result + "{ " + node.data + " } -> " + "BOTTOM";
//        System.out.println(node.data);
        System.out.println("TOP = " + " " + answer);

//        return answer;
        return result.toString();
    }
}
