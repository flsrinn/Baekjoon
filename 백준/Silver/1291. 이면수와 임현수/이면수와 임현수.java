import java.io.*;

public class Main {

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    private static int countPrimeFactors(int n) {
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                while (n % i == 0) n /= i;
                count++;
            }
        }
        if (n > 1 && isPrime(n)) count++;
        return count;
    }

    private static boolean isLeeMyeonSu(int n) {
        return n >= 4 && n != 5 && sumOfDigits(n) % 2 == 1;
    }

    private static boolean isLimHyunSu(int n) {
        if (n == 2 || n == 4) return true;
        if (isPrime(n) || n == 1) return false;
        return countPrimeFactors(n) % 2 == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean isLee = isLeeMyeonSu(n);
        boolean isLim = isLimHyunSu(n);

        int result;
        if (isLee && isLim) result = 4;
        else if (isLee) result = 1;
        else if (isLim) result = 2;
        else result = 3;

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
