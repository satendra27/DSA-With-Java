class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class Queue{
    Node rear;
    Node front;
    Queue(){
        this.rear = null;
        this.front = null;
    }

    public void Enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            this.front = this.rear = newNode;
        }else{
            this.rear.next = newNode;
            this.rear = newNode; 
        }
    }

    public void Dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            Node temp = this.front;
            this.front = this.front.next;
        }
        if(this.front == null){
            this.rear = null;
        }
    }

    public void print_Queue(){
        while(front != null){
            System.out.print(front.data+"<-");
            front = front.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        // q.print_Queue();
        q.Dequeue();
        q.print_Queue();


    }
}
