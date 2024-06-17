import java.io.*;
import java.math.BigInteger;

public class Main {
    private static BigInteger find(BigInteger n) {
        BigInteger num = n;
        while (true) {
            if(num.isProbablePrime(10)) {
                return num;
            }
            num = num.add(BigInteger.valueOf(1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            BigInteger n = new BigInteger(br.readLine());
            sb.append(find(n)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
