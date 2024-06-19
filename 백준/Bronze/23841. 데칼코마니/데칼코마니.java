import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[][] map = new String[N][M];
        for (int i=0; i<N; i++) {
            String[] m = br.readLine().split("");
            for (int j=0; j<M; j++) {
                map[i][j] = m[j];
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if(!map[i][j].equals(".")) {
                    map[i][M-j-1] = map[i][j];
                }
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
