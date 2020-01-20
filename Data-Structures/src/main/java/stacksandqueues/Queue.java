package stacksandqueues;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int w){
        if(isEmpty()){
            Node n = new Node(w);
            front = n;
            rear = n;
        }else{
            Node n = new Node (w);
            Node temp = rear;
            temp.next = n;
            rear = n;
        }
    }
    public int dequeue(){
        if(!isEmpty()){
            Node temp = front;
            front = temp.next;
            return temp.data;
        }else {
            throw new NullPointerException();
        }
    }
    public boolean isEmpty(){
        return front == null;
    }
    public int peek (){
        return front.data;
    }
    public void printQueue(){
        String holder = "";
        Node current = front;
        while(current !=null){
            holder += "{ " + current.data + " } -> ";
            current = current.next;
        }
//        System.out.println("FRONT" + holder + " BOTTOM");
    }
}
