import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class updatebit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int oper = Integer.parseInt(br.readLine());
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        if(oper == 1){
            int newNumber = bitmask|n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitmask);
            int newNumber = newBitMask&n;
            System.out.println(newNumber);
        }
        

    }
}
