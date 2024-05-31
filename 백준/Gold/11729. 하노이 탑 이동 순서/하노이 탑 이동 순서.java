import java.io.*;

public class Main {
    private static int count = 0;
    private static StringBuilder sb = new StringBuilder();

    private static void hanoi(int N, int from, int by, int to) {
        if(N == 0) return;
        hanoi(N-1, from, to, by);
        count++;
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(N-1, by, from, to);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 2, 3);

        bw.write(count + "\n");
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
