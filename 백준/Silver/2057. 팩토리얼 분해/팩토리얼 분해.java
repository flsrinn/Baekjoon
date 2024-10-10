import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        if(N == 0) bw.write("NO");
        else {
            long[] fac = new long[21];

            fac[0] = 1;
            for (int i = 1; i < fac.length; i++) {
                fac[i] = fac[i - 1] * i;
            }

            for (int i = fac.length - 1; i >= 0; i--) {
                if (N >= fac[i]) {
                    N -= fac[i];
                }
            }

            if (N == 0) bw.write("YES");
            else bw.write("NO");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
