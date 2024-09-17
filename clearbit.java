public class clearbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);
       int set_result = notbitmask & n;
       System.out.println(set_result);
    }
}
