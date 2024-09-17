public class Recursion12 {
    public static int sum =0;
    public static void sum_of_digit(int n){
            if(n<=0){
            System.out.println(sum);
                return;
            }
            int a = n%10;
            sum += a;
            sum_of_digit(n/10);
    }
    public static void main(String[] args) {
        int n = 78458578;
        sum_of_digit(n);
    }
}
