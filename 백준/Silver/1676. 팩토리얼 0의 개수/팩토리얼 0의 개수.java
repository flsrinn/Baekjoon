import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        BigInteger result = new BigInteger("1");
        int zeroCount = 0;

        while(N != 0) {
            result = result.multiply(BigInteger.valueOf(N));
            N--;
        }

        String resultString = result.toString();
        for (int i=resultString.length()-1; i>=0; i--) {
            if(resultString.charAt(i) == '0') {
                zeroCount++;
            }
            else {
                break;
            }
        }

        bw.write(Integer.toString(zeroCount));
        bw.flush();
        bw.close();
    }
}
