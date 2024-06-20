import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        String S = br.readLine();

        for (int i=0; i<S.length(); i+=K) {
            sb.append(S.charAt(i));
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
