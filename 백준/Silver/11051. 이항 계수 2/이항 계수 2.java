import java.io.*;
import java.math.BigInteger;

public class Main {
    private static BigInteger factorial(int start, int end) {
        BigInteger result = BigInteger.valueOf(1);
        while (start > end) {
            result = result.multiply(BigInteger.valueOf(start));
            start--;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        BigInteger result = factorial(N, N-K).divide(factorial(K, 1));
        result = result.remainder(BigInteger.valueOf(10007));

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
