import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] padovan = new long[100];
        padovan[0] = 1;
        padovan[1] = 1;
        padovan[2] = 1;

        for (int i=3; i<100; i++) {
            padovan[i] = padovan[i-3] + padovan[i-2];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(padovan[N-1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
