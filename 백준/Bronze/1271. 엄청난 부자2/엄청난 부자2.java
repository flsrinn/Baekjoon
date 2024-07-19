import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        BigInteger a = new BigInteger(s[0]);
        BigInteger b = new BigInteger(s[1]);
        sb.append(a.divide(b)).append("\n");
        sb.append(a.remainder(b)).append("\n");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
