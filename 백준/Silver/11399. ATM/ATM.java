import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] times = br.readLine().split(" ");
        int[] P = new int [N];
        int[] total = new int [N];
        for (int i=0; i<N; i++) {
            P[i] = Integer.parseInt(times[i]);
        }

        Arrays.sort(P);
        total[0] = P[0];
        int result = total[0];
        for (int i=1; i<N; i++) {
            total[i] = total[i-1] + P[i];
            result += total[i];
        }
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
