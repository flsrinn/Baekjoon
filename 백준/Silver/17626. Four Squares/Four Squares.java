import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n+1];
        for (int i=1; i<=n; i++) {
            num[i] = i;
            for (int j=1; j*j <= i; j++) {
                num[i] = Math.min(num[i], num[i-(j*j)] + 1);
            }
        }

        bw.write(num[n] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
