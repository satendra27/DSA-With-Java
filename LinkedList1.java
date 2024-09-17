class LL{
    Node head;
    private int size;
    LL(){
        this.size =  0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
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

    // Print Linked List

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Delete First Node
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete Last Node 
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }
    public int getSize(){
        return size;
    }

    // Reverse List
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nexNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse recursively
    public Node reverseRecursive(Node head){
        if (head == null || head.next == null) {
            return head;
            
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("This");
        list.printList();
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        System.err.println(list.getSize());
        // list.reverseList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}