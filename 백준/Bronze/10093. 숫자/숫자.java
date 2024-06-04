import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        BigInteger A = BigInteger.valueOf(Long.parseLong(input[0]));
        BigInteger B = BigInteger.valueOf(Long.parseLong(input[1]));

        if(A.compareTo(B) > 0) {
            sb.append(B.subtract(A).subtract(BigInteger.valueOf(-1)).abs()).append("\n");
            for (BigInteger i = B.add(BigInteger.valueOf(1)); i.compareTo(A) != 0; i = i.add(BigInteger.valueOf(1))) {
                sb.append(i).append(" ");
            }
        }
        else if(A.compareTo(B) < 0)  {
            sb.append(A.subtract(B).subtract(BigInteger.valueOf(-1)).abs()).append("\n");
            for (BigInteger i = A.add(BigInteger.valueOf(1)); i.compareTo(B) != 0; i = i.add(BigInteger.valueOf(1))) {
                sb.append(i).append(" ");
            }
        }
        else {
            sb.append("0");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
