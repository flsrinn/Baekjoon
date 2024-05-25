import java.io.*;
import java.util.Arrays;

public class Main {
    private static char[][] stars;

    private static void star(int x, int y, int N, boolean blank) {
        if(blank) {
            for (int i=x; i<x+N; i++) {
                for (int j=y; j<y+N; j++) {
                    stars[i][j] = ' ';
                }
            }
            return;
        }

        if (N == 1) {
            return;
        }

        int count = 0;
        for (int i=x; i<x+N; i+=N/3) {
            for (int j=y; j<y+N; j+=N/3) {
                count++;
                star(i, j, N/3, count == 5);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        stars = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(stars[i], '*');
        }

        star(0, 0, N, false);

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                bw.write(stars[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
