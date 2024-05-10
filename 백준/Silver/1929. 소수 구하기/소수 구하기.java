import java.io.*;

public class Main {

    private static boolean isPrimeNum(int num) {
        for (int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] T = br.readLine().split(" ");
        int M = Integer.parseInt(T[0]);
        int N = Integer.parseInt(T[1]);
        if(M == 1) M++;

        for (int i=M; i<=N; i++) {
            if(isPrimeNum(i)) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
