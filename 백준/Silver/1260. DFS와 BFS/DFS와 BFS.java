import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static boolean [][] mat;
    private static boolean[] visited;

    // 깊이 우선 탐색 DFS 
    private static void dfs(int v) {
        visited[v] = true;
        sb.append(v+1).append(" ");
        for (int i=0; i<mat.length; i++) {
            if(!visited[i] && mat[v][i])
                dfs(i);
        }
    }

    // 너비 우선 탐색 BFS
    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);

        while(!queue.isEmpty()) {
            int r = queue.poll();
            sb.append(r+1).append(" ");

            for (int i=0; i<mat.length; i++) {
                if(!visited[i] && mat[r][i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        mat = new boolean[N][N];
        visited = new boolean[N];

        for (int i=0; i<M; i++) {
            String[] vertex = br.readLine().split(" ");
            int from = Integer.parseInt(vertex[0]);
            int to = Integer.parseInt(vertex[1]);
            mat[from-1][to-1] = true;
            mat[to-1][from-1] = true;
        }

        dfs(V-1);
        sb.append("\n");

        visited = new boolean[N];
        bfs(V-1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
