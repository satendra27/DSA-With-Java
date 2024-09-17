// time complexity = O(n); where n is length of String

public class recursion4 {
    public static void printRev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String arg[]){
        String str = "abcd";
        printRev(str,str.length()-1);

    }
}
