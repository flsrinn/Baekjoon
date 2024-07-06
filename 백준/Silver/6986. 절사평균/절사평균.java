import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        ArrayList<Double> al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            al.add(Double.parseDouble(br.readLine()));
        }
        Collections.sort(al);

        double aSum = 0.0;
        double bSum = 0.0;

        for (int i = K; i < N - K; i++) {
            aSum += al.get(i);
        }
        sb.append(String.format("%.2f", aSum / (N - 2 * K))).append("\n");

        for (int i = 0; i < K; i++) {
            bSum += al.get(K) + al.get(N - K - 1);
        }
        for (int i = K; i < N - K; i++) {
            bSum += al.get(i);
        }
        sb.append(String.format("%.2f", bSum / N)).append("\n");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
