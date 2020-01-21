package stacksandqueues;

import java.util.EmptyStackException;

public class PseudoQueue {
    private Stack front ;
    private Stack rear ;

    public PseudoQueue() {
        this.front = new Stack();
        this.rear = new Stack();
    }
    public void enqUeUe(int x){
            while(!rear.isEmpty()){
                front.push(rear.pop());
            }
            //now the content of my rear is in my front. Just add the new int x on top.
            front.push(x);
        front.printstack();
    }
    public int DequeUe(){
        while(!front.isEmpty()) {
//            if (!front.isEmpty()) {
            rear.push(front.pop());  //empty the entire front stack to get to the very bottom which is the first in the queue.

            }
//        if(front.isEmpty()){
//            throw new NullPointerException();
//        }
        return rear.pop();

//        front.printstack();
    }
//    public void print(){
//        while(front.){
//            System.out.println("front is " + front);
//            front = front.
//        }
//    }
public int peek(){
        return front.pop();
}

}
