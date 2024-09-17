public class factorial {
    public static int calcfactorial(int n){
        if(n==0){
            return 1;
        }
        int fact_num = calcfactorial(n-1);
        int fact_n = n*fact_num;
        return fact_n;
        
    }
    public static void main(String[] args) {
        int n=5;
       int result=calcfactorial(n);
       System.out.println(result);
    }
}
