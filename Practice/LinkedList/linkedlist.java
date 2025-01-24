import java.util.*;
public class linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void First(int data){
        if(head == null){
            head=tail=new Node(data); 
            return;
        }
        Node newNode = new Node(data);
         
        newNode.next=head;

        head=newNode;
    }

    public  void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        

        tail.next=newNode;

        tail=newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        

    }
}
