class Node{ 
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}



public class LinkedList{

    public static void main(String[] args){
        Node a =new Node(10);
        System.out.println(a.data);
        System.out.println(a.next);
    }
}