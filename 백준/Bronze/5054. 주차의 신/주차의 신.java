import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] loc = new int [n];

            String[] s = br.readLine().split(" ");
            for (int j=0; j<n; j++) {
                loc[j] = Integer.parseInt(s[j]);
            }

            Arrays.sort(loc);
            // 일직선 상에 있으므로
            // 최솟값은 제일 큰 값에서 작은 값을 빼고 2를 곱한 값과 동일
            sb.append((loc[n-1] - loc[0]) * 2).append("\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
