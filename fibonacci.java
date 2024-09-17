public class fibonacci {
    public static void print_fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        print_fibonacci(b, c, n-1);

        

    }
    public static void main(String[] args) {
        int a=0,b=1;
        int n=5;
        System.out.println(a);
        System.out.println(b);
        print_fibonacci(a, b, n);
    }
}
