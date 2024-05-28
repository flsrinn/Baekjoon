import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long K = Long.parseLong(input[1]);

        long[] coins = new long[N];
        long count = 0;
        for (int i=0; i<N; i++) {
            coins[i] = Long.parseLong(br.readLine());
        }

        for (int i=coins.length-1; i>=0; i--) {
            if(K >= coins[i]) {
                count += K / coins[i];
                K %= coins[i];
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
