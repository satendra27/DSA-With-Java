public class setbit{
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
       int set_result = bitmask | n;
       System.out.println(set_result);

    } 
}
