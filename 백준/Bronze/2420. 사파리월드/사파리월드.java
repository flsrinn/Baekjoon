import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(" ");
        BigInteger N = BigInteger.valueOf(Integer.parseInt(strings[0]));
        BigInteger M = BigInteger.valueOf(Integer.parseInt(strings[1]));

        bw.write(N.subtract(M).abs() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
