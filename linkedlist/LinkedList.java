package linkedList;

public class MyLinkedList{
    Node head;
    public void populateList(String data){
        //create a new node
        Node node = new Node ();
        node.data = data;
        node.next = null;
        if (head == null){  //if head does not exist ie have no value
            head = node;   //make the first node the head
        }
        else
        {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public String toString(){
        String result = "";
      //      "{ a } -> { b } -> { c } -> NULL"
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            result+= "{ " + node.data + " } -> ";
            node = node.next;
        }
        String answer = result + "NULL";
        System.out.println(node.data);
        System.out.println("result = " + " "+answer);

        return result;
    }
    public boolean includes(String toBeFound) {
        boolean answer = false;
        Node node = head;
        while (node.next != null) {
//            System.out.println("node.data = " + node.data);
            if(node.data.equals(toBeFound)){
                return true;
            }
            System.out.println(node.data);
            node = node.next;
        }
        if(node.data.equals(toBeFound)){
            return true;
        }
        return false;
    }
    public String insert(String data){
        Node node = new Node ();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        this.head = head;
//        System.out.println("this.head = " + this.head.data);
        return this.head.data;
    }
}