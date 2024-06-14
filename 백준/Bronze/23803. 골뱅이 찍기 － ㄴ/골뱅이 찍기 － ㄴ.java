import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int len = 5*N;
        for (int i=0; i<len; i++) {
            for (int j=0; j<N; j++) {
                sb.append("@");
            }
            if(i >= len-N && i <= len - 1) {
                for (int j=0; j<len-N; j++) {
                    sb.append("@");
                }
            }
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
