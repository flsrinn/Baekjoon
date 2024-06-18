import java.io.*;

public class Main {
    private static boolean[][] mat;
    private static boolean[] visited;
    private static int count = 0;
    private static int connected = 0;

    // 깊이 우선 탐색 DFS
    private static void dfs(int v) {
        visited[v] = true;
        count++;
        for (int i=0; i<mat.length; i++) {
            if(!visited[i] && mat[i][v])
                dfs(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        mat = new boolean[N][N];
        visited = new boolean[N];
        for (int i=0; i<M; i++) {
            String[] vertex = br.readLine().split(" ");
            int u = Integer.parseInt(vertex[0]);
            int v = Integer.parseInt(vertex[1]);

            mat[u-1][v-1] = true;
            mat[v-1][u-1] = true;
        }

        int start = 0;
        while (true) {
            dfs(start);
            connected++;
            if(count != N) {
                for (int i=0; i<N; i++) {
                    // 방문하지 않은 노드가 있을 경우 
                    if(!visited[i]) {
                        start = i;
                        break;
                    }
                }
            }
            else break;
        }
        bw.write(connected + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
