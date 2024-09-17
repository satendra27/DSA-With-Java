public class LinkedList {
    public static Node head;
    static class Node{
        String data;
        Node next;
        Node(String d){
            this.data = d;
            this.next = null;
        }
    }


    public static void addFirst(String data){
        Node newNode = new Node(data);     
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }


    public static void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public static void addAtPos(String data,int pos){
        Node newNode = new Node(data);
        if(head == null || pos==0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        int i=1;
        while (i<pos && currNode.next != null) {
            currNode = currNode.next;
            i++;
        }
        // System.out.println(currNode.data);
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public static void getSize(){
        Node currNode = head;
        int count = 1;
        while (currNode.next!=null) {
            count++;
            currNode = currNode.next;
        }
        System.out.println(count);
    }

    public static void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;
    }

    public static void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head.next;
        Node secondLastNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            secondLastNode = secondLastNode.next;
        }
        System.out.println(secondLastNode.data);
        secondLastNode.next = null;
    }

    public static void deleteAtPos(int pos){
        if(head==null){
            System.out.println("List is Empty");
        }
        else if(head.next==null || pos==0){
            head = null;
            return;
        }
        Node LastNode = head.next;
        Node secondLastNode = head;
        for(int i=1;i<pos && LastNode.next!=null;i++){
            LastNode = LastNode.next;
            secondLastNode = secondLastNode.next;
        }
        // System.out.println(secondLastNode.data);
        // System.out.println(LastNode.data);
        secondLastNode.next = LastNode.next;
    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){

        }
    }

    public Node reverseRecursive(Node head){
        if (head == null || head.next == null) {
            return head;
            
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
        addFirst("a");
        addFirst("b");
        addFirst("c");
        addFirst("d");
        printList();
        addLast("e");
        printList();
        addAtPos("g", 3);
        printList();
        deleteFirst();
        printList();
        // deleteLast();
        // printList();
        deleteAtPos(2);
        printList();
        getSize();
    }
}
