import java.io.*;

public class Main {
    private static int count = 0;
    private static boolean[][] mat;
    private static boolean[] visited;

    private static void dfs(int v) {
        visited[v] = true;
        for (int i=0; i<mat.length; i++) {
            if(mat[i][v] && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        mat = new boolean[N][N];
        visited = new boolean[N];
        for (int i=0; i<M; i++) {
            String[] edge = br.readLine().split(" ");
            int from = Integer.parseInt(edge[0]);
            int to = Integer.parseInt(edge[1]);
            mat[from-1][to-1] = true;
            mat[to-1][from-1] = true;
        }

        // 깊이 우선 탐색
        dfs(0);

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
