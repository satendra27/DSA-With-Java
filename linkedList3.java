class linkedList3{
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static void traverseLinkedList(Node head)
    {
        // Start from the head of the linked list
        Node current = head;

        // Traverse the linked list until reaching the end
        // (null)
        while (current != null) {
            // Print the data of the current node
            System.out.print(current.data + " ");

            // Move to the next node
            current = current.next;
        }

        System.out.println();
    }

    public void push(int newData)
    {
        Node newNode= new Node(newData); // allocate the Node and
                                 // put in the data
        newNode.next= head; // make next of new Node as head
        head = newNode; // move the head to point to the new
                        // Node
    }

   static Node head; 


    public int findLength()
    {
        int length= 0; // Initialize a counter for the length
        Node current = head; // Start from the head of the list

        // Traverse the list and increment the length for
        // each node
        while (current != null) {
            length++;
            current = current.next;
        }

        // Return the final length of the linked list
        return length;
    }


    /* Appends a new node at the end. This method is
defined inside LinkedList class shown above */
public void append(int new_data) {
    /* 1. Allocate the Node &
    2. Put in the data
    3. Set next as null */
    Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
        new node as head */
    if (head == null) {
        head = new Node(new_data);
        return;
    }

    /* 5. This new node is going to be the last node, so
        make next of it as null */
    new_node.next = null;

    /* 6. Else traverse till the last node */
    Node last = head;
    while (last.next != null)
        last = last.next;

    /* 7. Change the next of last node */
    last.next = new_node;
    return;
}

void insertAtPosition(int data, int position) {
    // Create a new node with the given data
    Node newNode = new Node(data);

    // If position is 0 or the list is empty, insert at the beginning
    if (position == 0 || head == null) {
        newNode.next = head;
        head = newNode;
        return;
    }

    // Traverse to the node just before the specified position
    Node current = head;
    for (int i = 1; i < position && current.next != null; ++i) {
        current = current.next;
    }

    // Insert the new node at the specified position
    newNode.next = current.next;
    current.next = newNode;
}


public static void deleteAtBeginning() {
    // If the list is empty, do nothing
    if (head == null) {
        System.out.println("List is empty. Cannot delete from the beginning.");
        return;
    }

    // Store the current head in a temporary variable
    Node temp = head;

    // Update the head to the next node
    head = head.next;

}

public static void deleteAtEnd() {
    // If the list is empty, do nothing
    if (head == null) {
        System.out.println("List is empty. Cannot delete from the end.");
        return;
    }

    // If there is only one node, delete it and set head to null
    if (head.next == null) {
        head = null;
        return;
    }

    // Traverse to the second last node
    Node current = head;
    while (current.next.next != null) {
        current = current.next;
    }

    // Delete the last node
    current.next = null;
}

public static void deleteAtPosition(Node head, int position) {
    // If the list is empty, do nothing
    if (head == null) {
        System.out.println("List is empty. Cannot delete from a specific position.");
        return;
    }

    // If deleting the head node
    if (position == 0) {
        Node temp = head;
        head = head.next;
        temp = null; // Free memory by making the node eligible for garbage collection
        return;
    }

    // Traverse to the node just before the specified position
    Node current = head;
    for (int i = 1; i < position && current.next != null; ++i) {
        current = current.next;
    }

    // If position is beyond the end of the list, do nothing
    if (current.next == null) {
        System.out.println("Position is beyond the end of the list. Cannot delete.");
    } else {
        // Delete the node at the specified position
        Node temp = current.next;
        current.next = current.next.next;
        temp = null; // Free memory by making the node eligible for garbage collection
    }
}



public void print_list(){
    Node current = head;
    while(current != null){
        System.out.print(current.data+"->");
        current = current.next;
    }
    System.out.println("null");
}

    public static void main(String arg[]){
        // Create nodes
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodes
        head.next = second;
        second.next = third;

        // Call the traverseLinkedList function to print the
        // linked list elements
        traverseLinkedList(head);

        linkedList3 ll = new linkedList3();
        ll.push(5);
        ll.push(6);
        ll.push(7);
        ll.append(8);
        ll.insertAtPosition(9, 2);
        ll.print_list();
        ll.deleteAtBeginning();
        ll.deleteAtEnd();
        ll.deleteAtPosition(head, 2);
        ll.print_list();

        System.out.println("Length of the linked list is: "
                           + ll.findLength());
    }
}