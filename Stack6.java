public class Stack6 {
    static class Stack{
        static int top;
        public static int Max = 5;
        static int a[] = new int[Max];

        Stack(){
            top = -1;
        }
        static void isEmpty(){
            if(top<0){
                System.out.println("Stack is Underflow");
                return;
            }
        }
        static void push(int n){
            if(top >= (Max-1)){
                System.out.println("Stack is Overflow");
            }
            else{
                a[++top] = n;
            }
        }
        static int pop(){
            if(top<0){
                System.out.println("Stack is UnderFlow");
            }
            int b = a[top--];
            return b;
        }
        static int peek(){
            int c = a[top];
            return c;
        }
        static void print_stack(){
            for(int i=top;i > -1;i--){
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        // s.Underflow(0);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(1);
        s.push(3);
        s.push(3);
        s.print_stack();
        // System.out.println("Popped Element is "+s.pop());
        // System.out.println("Popped Element is "+s.pop());
        // System.err.println("The top element is "+s.peek());
    }
}
