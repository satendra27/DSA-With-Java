// Circular LinkedList Operation

public class LinkedList6 {
    static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        newNode.next = head;
        newNode.prev = tail;
        head.prev = newNode;
        tail.next = newNode;
        head = newNode;
        // System.out.println(tail.next.data);
        
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        Node curNode = head;
        while(curNode.next != tail){
            curNode = curNode.next;
        }
        // System.out.println(curNode.next.data);
        // System.out.println(tail.data);
        newNode.next = curNode.next.next;
        curNode.next.next = newNode;
        newNode.prev = curNode.next;
        tail = newNode;
        head.prev = newNode;
        // System.out.println(head.prev.data);
        // tail.next = head;
        // newNode.next = head;
        // curNode.next.next = newNode;
        // tail = newNode;
        // System.out.println(head.data);
    }

    public static void addAtPos(int data,int pos){
        Node newNode = new Node(data);
        if(head == null || pos == 0){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            head.prev = tail;
            tail.next = newNode;
            // System.out.println(head.prev.data);
            return;
        }
        Node currNode = head; 
        for(int i=1;i<pos && currNode.next != head;i++ ){
            currNode = currNode.next;
        }
        // newNode.next = currNode.next;
        // currNode.next = newNode;
        // System.out.println(currNode.data);
        newNode.next = currNode.next;
        currNode.next.prev = newNode;
        currNode.next = newNode;
        newNode.prev = currNode;

       }

       public static void deleteFirst(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
            head = head.next;
            head.prev = tail;
            tail.next = head;
       }
    public static void deleteLast(){
        Node currNode = head.next;
        Node secondLastNode = head;

        while(currNode.next != head){
            currNode = currNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = tail.next;
        tail = secondLastNode;
        tail.prev = secondLastNode.prev;
        tail.next = head;
        head.prev = tail;
        // System.out.println(data+" "+secondLastNode.data);

    }

    public static void deleteAtPos(int data,int pos){
        Node currNode = head.next;
        Node secondLastNode = head;
        if(pos == 0){
            head = head.next;
            head.prev = tail;
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
        currNode.next.prev = secondLastNode;
        // System.out.println(currNode.data+" "+secondLastNode.data);

    }
    public static void ForwardtraverseList(){
        Node currNode = head;
        while(currNode != tail){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
        
       }
    public static void BackwardtraverseList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = tail;
        do {
            System.out.print(currNode.data + "->");
            currNode = currNode.prev;
        } while (currNode != tail);
        System.out.println();
        // System.out.println(tail.next.data);
    }


        

    

    
    public static void main(String arg[]){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addLast(5);
        // addLast(6);
        addAtPos(7, 0);
        // addAtPos(8, 5);
        ForwardtraverseList();
        // deleteFirst();
        // deleteLast();
        deleteAtPos(9, 2);
        ForwardtraverseList();
        BackwardtraverseList();

    }
}
