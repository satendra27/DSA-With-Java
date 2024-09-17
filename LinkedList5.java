// Circular LinkedList Operation

public class LinkedList5 {
    static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        Node curNode = head;
        while(curNode.next != tail){
            curNode = curNode.next;
        }
        // System.out.println(curNode.next.data);
        newNode.next = head;
        curNode.next.next = newNode;
        tail = newNode;
        // System.out.println(head.data);
    }

    public static void addAtPos(int data,int pos){
        Node newNode = new Node(data);
        if(head == null || pos == 0){
            newNode.next = head;
            head = newNode;
            // tail = newNode;
            return;
        }
        Node currNode = head; 
        for(int i=1;i<pos && currNode.next != head;i++ ){
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
       }

       public static void deleteFirst(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
            head = head.next;
            tail.next = head;
       }
    public static void deleteLast(){
        Node currNode = head.next;
        Node secondLastNode = head;

        while(currNode.next != head){
            currNode = currNode.next;
            secondLastNode = secondLastNode.next;
        }
        // System.out.println(tail.data+" "+secondLastNode.data);
        tail = secondLastNode;
    }

    public static void deleteAtPos(int data,int pos){
        Node currNode = head.next;
        Node secondLastNode = head;
        if(pos == 0){
            head = head.next;
            tail.next = head;
            return;
        }
        if(head == null){
            System.out.println("List is Empty");
        }
        for(int i=1;i<pos && currNode.next != head;i++){
            currNode = currNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = currNode.next;
        // System.out.println(currNode.data+" "+secondLastNode.data);

    }
    public static void traverseList(){
        Node currNode = head;
        while(currNode != tail){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
        
       }

    
    public static void main(String arg[]){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addLast(5);
        addLast(6);
        addAtPos(7, 2);
        addAtPos(8, 5);
        traverseList();
        deleteFirst();
        deleteLast();
        deleteAtPos(9, 2);
        traverseList();

    }
}
