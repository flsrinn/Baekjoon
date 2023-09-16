import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
 
 
public class Main {
 
	public static BigInteger fib(int n) {
        BigInteger f0 = BigInteger.valueOf(1);
        BigInteger f1 = BigInteger.valueOf(1);
        BigInteger f2 = null;
        for (int j=2 ; j <= n ; j++) {
            f2 = f1.add(f0);
            f0 = f1;
            f1 = f2;
        }
 
        return (f0);
    }
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(fib(Integer.parseInt(br.readLine())));
    }

    
    
}