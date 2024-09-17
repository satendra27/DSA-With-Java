public class recursion2 {
    public static void print_sum(int n,int i,int sum){
    
    if(n==i){
        sum=sum+i;
        System.out.println(sum);
        return;
    }else{
        
      sum = sum + i;
      print_sum(n,i+1,sum);
    }
}
    public static void main(String[] args) {
        
        print_sum(5,1,0);
    }
}
