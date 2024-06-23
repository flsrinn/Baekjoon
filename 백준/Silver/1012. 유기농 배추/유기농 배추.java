import java.io.*;

public class Main {
    private static boolean[][] mat;
    private static boolean[][] visited;

    private static void dfs(int n, int m) {
        if(n < 0 || m < 0 || n >= mat.length || m >= mat[0].length || visited[n][m] || !mat[n][m])
            return;

        visited[n][m] = true;

        dfs(n+1, m);
        dfs(n-1, m);
        dfs(n, m+1);
        dfs(n, m-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);

            mat = new boolean[N][M];
            visited = new boolean[N][M];
            for (int j=0; j<K; j++) {
                String[] vertex = br.readLine().split( " ");
                int y = Integer.parseInt(vertex[0]);
                int x = Integer.parseInt(vertex[1]);

                mat[x][y] = true;
            }

            int count = 0;
            for (int j=0; j<N; j++) {
                for (int k=0; k<M; k++) {
                    if(mat[j][k] && !visited[j][k]) {
                        dfs(j, k);
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
