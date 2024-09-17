// Doubly LinkedList Operations

class LinkedList4{
    public static Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
       
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public static void addAtPos(int data,int pos){
        Node newNode = new Node(data);
        Node currNode = head;
        // Node secondLastNode = head;
        if(head == null || pos == 0){
            head = newNode;
            return;
        }
        int i=1;
        while (i<pos && currNode.next != null) {
            currNode = currNode.next;
            i++;
        }
        newNode.next = currNode.next;
        newNode.prev = currNode;
        if(currNode.next != null){
            currNode.next.prev = newNode;

        }
        currNode.next = newNode;

    }
    public static void ForwardtraverseList(){
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        head.prev = null;

    }

    public static void deleteLast(){
        Node LastNode = head.next;
        Node secondLastNode = head;
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public static void deleteAtpos(int pos){
        if(head == null && pos <0){
            System.out.println("List is Empty");
            return;
        }
        if(pos == 0){
            head = head.next;
            head.prev = null;
        }
        int i=1;
        Node LastNode = head.next;
        Node secondLast = head;
        while(i<pos && LastNode.next != null){
            LastNode = LastNode.next;
            secondLast = secondLast.next;
            i++;
        }
        secondLast.next = LastNode.next;
        LastNode.next.prev = LastNode.prev;
        System.out.println(LastNode.data+" "+secondLast.data);
    }
    public static void BackwardtraverseList(){
        Node currNode = head;
        if (currNode == null) {
            return;
        }

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.prev;
        }
        System.out.println();
    }
    public static void main(String arg[]){
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addFirst(4);
        addLast(5);
        ForwardtraverseList();
        // BackwardtraverseList();
        // addAtPos(6, 3);
        // deleteFirst();
        // deleteLast();
        // deleteAtpos(0);
        deleteAtpos(3);
        ForwardtraverseList();
        BackwardtraverseList();
    }
}