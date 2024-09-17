public class Queue3 {
    static Node rear = null;
    static Node front = null;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isEmpty(){
        if(rear == null && front == null){
            return true;
        }
        return false;
    }
    public static void add(int data){
        Node newNode = new Node(data);
        if(rear == null && front == null){
            rear = newNode;
            rear.next = newNode;
            front = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public static void delete(){
        if(front != null){
        front = front.next;
        }
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }
    public static void print_Queue(){
        while(front != null){
            System.out.print(front.data+"<-");
            front = front.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        while (!isEmpty()) {
            System.out.println(peek());
            delete();
        }
        // System.out.println(peek());
        // print_Queue();
    }
}