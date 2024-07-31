import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        BigInteger A = new BigInteger(s[0]);
        BigInteger B = new BigInteger(s[1]);
        bw.write(String.valueOf(A.multiply(B)));

        bw.flush();
        bw.close();
        br.close();
    }
}
