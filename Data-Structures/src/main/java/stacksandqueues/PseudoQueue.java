package stacksandqueues;

import java.util.EmptyStackException;

public class PseudoQueue<E> {
    private Stack<E> front ;
    private Stack<E> rear ;

    public PseudoQueue() {
        this.front = new Stack<>();
        this.rear = new Stack<>();
    }
    public void enqUeUe(E x){
            while(!rear.isEmpty()){
                front.push(rear.pop());
            }
            //now the content of my rear is in my front. Just add the new int x on top.
            front.push(x);
    }
    public E DequeUe(){
        while(!front.isEmpty()) {
//            if (!front.isEmpty()) {
            rear.push(front.pop());  //empty the entire front stack to get to the very bottom which is the first in the queue.
        }

        return rear.pop();
    }
    public E peek(){
        return front.pop();
    }

}
