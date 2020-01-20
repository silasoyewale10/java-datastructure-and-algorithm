package stacksandqueues;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> numbers = new LinkedList<>();
     private int top = -1;
     private int sizeOfStack = numbers.size();
    public static void main(String [] args){
        Stack tt = new Stack(5);
        tt.push(5);
        tt.push(2);
        tt.push(1);

        System.out.println(tt);
    }
    public Stack(int size){
        this.sizeOfStack = size;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return (top +1) >= sizeOfStack;
    }
    public void push (int x){
        if(isEmpty()){
            Node n = new Node ();
            n.data = x;
        }
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return top=-1;
    }
//    public void displayStack(){}
//    for(int num : numbers){
//        System.out.println(num);
//    }
}
