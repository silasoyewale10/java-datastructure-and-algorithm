package linkedList;

import java.util.LinkedList;

public class MyLinkedList{
    Node head;
    public void append(String data){
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
        while(node.next != null ){
            System.out.println(node.data);
            result+= "{ " + node.data + " } -> ";
            node = node.next;
        }
        String answer = result + "{ "+ node.data+ " } -> " + "NULL";
//        System.out.println(node.data);
        System.out.println("answer = " + " "+answer);

        return answer;
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

    public void insertBefore(String value, String newVal){
        System.out.println("Insert before starts");

        Node start = head;
        Node now = start;

        while( now.next != null )
        {
            if( now.next.data == value )
            {
                Node n = new Node();
                n.data = newVal;
                n.next = now.next;
                now.next = n;
                return;
            }
            else {
                now = now.next;
            }
        }

    }

    public Node getHead() {
        return head;
    }

    public void insertAfter(String value, String newVal){
        System.out.println("Insert after starts");
        Node start = head;
        Node n = new Node();
        n.data = newVal;
        Node now = head;
        while(now != null){
            if(now.data == value){
                n.next = now.next;
                now.next = n;
                return;
            }
            else{
                now = now.next;
            }
        }
    }
    public String kthFromEnd(int k) {
        int count  = 0;
        Node temp=head;
        int lenOfList = 0;
        while(temp!=null)
        {
            temp=temp.next;
            lenOfList++;
        }
        Node node = head;
            if(k > lenOfList){
                throw new IndexOutOfBoundsException("k is larger than the length of the linked list");
            }
            while (node.next != null) {
//            System.out.println("node.data = " + node.data);
                if(k == (lenOfList - count - 1)){
                    return node.data;
                }
                System.out.println(node.data);
                node = node.next;
                count++;
            }
        return "can't find it";
    }
    public MyLinkedList mergeList (MyLinkedList list1, MyLinkedList list2){
        Node head = list1.head;
        Node head2 = list2.head;
        Node temp = head.next;
        Node temp2 = head.next;
        if (head == null){
            return list2;
        }
        if (head2 == null){
            return list1;
        }
        while (head.next !=null){
            temp = head.next;
            temp2 = head2.next;
            head.next = head2;
            head2.next = temp;
            head = temp;
            head2 = temp2;
        }
        return list1;

    }

}