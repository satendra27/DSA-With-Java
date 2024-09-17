public class Stack7 {
    static class Stack{
        static int top;
        public static int Max = 5;
        static String a[] = new String[Max];

        Stack(){
            top = -1;
        }
        static void isEmpty(){
            if(top<0){
                System.out.println("Stack is Underflow");
                return;
            }
        }
        static void push(String n){
            if(top >= (Max-1)){
                System.out.println("Stack is Overflow");
            }
            else{
                a[++top] = n;
            }
        }
        static String pop(){
            if(top<0){
                System.out.println("Stack is UnderFlow");
            }
            String b = a[top--];
            return b;
        }
        static String peek(){
            String c = a[top];
            return c;
        }
        static void print_stack(){
            for(int i=top;i > -1;i--){
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        // s.Underflow(0);
        s.push("A");
        s.push("Y");
        s.push("T");
        s.push("A");
        s.push("S");
        s.print_stack();

        // for(int i=0;i<s.Max;i++){
        // System.out.print(s.pop());
        // }
        System.out.println("Popped Element is "+s.pop());
        System.out.println("Popped Element is "+s.pop());
        System.out.println("Popped Element is "+s.pop());
        // System.err.println("The top element is "+s.peek());
    }
}
