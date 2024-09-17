public class recursion15 {
    public static int sum=0;
    public static void print_length(String word,int i){
        if(word.length() == i){
            System.out.println(sum);
            return;
        }
        sum = sum+1;
        print_length(word, i+1);
    }
    public static void main(String[] args) {
        String word = "SatendraBaghel";
        int i = 0;
        print_length(word,i);
    }
}
