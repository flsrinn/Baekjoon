import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int sum = 0;
            int[] scores = new int[N];

            for (int j = 1; j <= N; j++) {
                scores[j-1] = Integer.parseInt(s[j]);
                sum += scores[j-1];
            }
            double avg = (double) sum / N;

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg) count++;
            }
            sb.append(String.format("%.3f", ((double) count / N) * 100)).append("%\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
