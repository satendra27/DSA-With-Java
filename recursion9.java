public class recursion9 {
    public static void printPerm(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }                                              // Time Complexity => O(n!);
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
            
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}
