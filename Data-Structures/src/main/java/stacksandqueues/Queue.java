package stacksandqueues;

public class Queue<E> {
    private Node<E> front;
    private Node<E> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(E w){
        if(isEmpty()){
            Node<E> n = new Node<>(w);
            front = n;
            rear = n;
        }else{
            Node<E> n = new Node<>(w);
            Node<E> temp = rear;
            temp.next = n;
            rear = n;
        }
    }
    public E dequeue(){
        if(!isEmpty()){
            Node<E> temp = front;
            front = temp.next;
            return temp.data;
        }else {
            throw new NullPointerException();
        }
    }
    public boolean isEmpty(){
        return front == null;
    }
    public E peek (){
        return front.data;
    }

    @Override
    public String toString(){
        StringBuilder holder = new StringBuilder();
        Node<E> current = front;
        while(current !=null){
            holder.append("{ ").append(current.data).append(" } -> ");
            current = current.next;
        }
        return holder.toString();
//        System.out.println("FRONT" + holder + " BOTTOM");
    }
}
