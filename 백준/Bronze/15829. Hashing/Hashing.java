import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        BigInteger hashSum = BigInteger.valueOf(0);
        BigInteger powerHash = BigInteger.valueOf(1);
        int alphabetIndex = 0;
        String hashString = br.readLine();
        for(int i=0; i<L; i++) {
            char letter = hashString.charAt(i);
            alphabetIndex = letter - 'a' + 1;
            hashSum = hashSum.add(powerHash.multiply(BigInteger.valueOf(alphabetIndex)));
            powerHash = powerHash.multiply(BigInteger.valueOf(31));
        }
        hashSum = hashSum.remainder(BigInteger.valueOf(1234567891));
        System.out.println(hashSum);
        br.close();
    }
}
