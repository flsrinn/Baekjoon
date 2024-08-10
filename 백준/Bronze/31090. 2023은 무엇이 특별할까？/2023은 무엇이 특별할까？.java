import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            int y = Integer.parseInt(br.readLine());
            int lastTwo = y % 100;
            if((y+1) % lastTwo == 0) sb.append("Good\n");
            else sb.append("Bye\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
