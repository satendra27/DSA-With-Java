class Solution {
    // public static int p = 0;
    public static boolean isPalindrome(int x) {
        int d = x;
        int p = 0;
        while(x>0){
            int a = x%10;
             p = p*10 + a;
                 x = x/10;
        }
        System.out.println(d + " "+ p);
        if(d==p){
        return true;
        }else{
            return false;
        }
    }
    public static void main(String arg[]){
    
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(0));
        
    }
    
}