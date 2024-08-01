import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i=0; i<chess.length; i++) {
            sb.append(chess[i] - Integer.parseInt(s[i])).append(" ");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
