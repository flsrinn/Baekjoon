import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Main {
    private static int[][] mat;
    private static boolean[][] visited;
    private static int count = 0;
    private static Vector<Integer> vector = new Vector<>();

    private static void search(int n, int m) {
        if(n < 0 || m < 0 || n >= mat.length || m >= mat.length || visited[n][m] || mat[n][m] == 0) {
            return;
        }

        visited[n][m] = true;
        count++;

        search(n-1 ,m);
        search(n+1 ,m);
        search(n ,m-1);
        search(n ,m+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        mat = new int[N][N];
        visited = new boolean[N][N];

        for (int i=0; i<N; i++) {
            String[] array = br.readLine().split("");
            for (int j=0; j<N; j++) {
                mat[i][j] = Integer.parseInt(array[j]);
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if(!visited[i][j] && mat[i][j] == 1) {
                    count = 0;
                    search(i, j);
                    vector.add(count);
                }
            }
        }

        sb.append(vector.size()).append("\n");
        List<Integer> list = new ArrayList<>(vector);
        Collections.sort(list);

        for (int i=0; i<list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
