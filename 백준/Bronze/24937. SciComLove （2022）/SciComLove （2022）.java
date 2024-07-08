import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        BigInteger n = BigInteger.valueOf(Integer.parseInt(br.readLine()));
        int num = Integer.parseInt(String.valueOf(n.remainder(BigInteger.valueOf(10))));
        String[] s = "SciComLove".split("");
        for (int i=num; i<s.length; i++) {
            sb.append(s[i]);
        }
        for (int i=0; i<num; i++) {
            sb.append(s[i]);
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
