import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int result = bfs(N, K);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs(int n, int k) {
        boolean[] visited = new boolean[100001];
        int[] time = new int[100001];
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = true;

        while (!q.isEmpty()) {
            int current = q.poll();
            if (current == k) {
                return time[current];
            }

            if (current - 1 >= 0 && !visited[current - 1]) {
                q.add(current-1);
                visited[current-1] = true;
                time[current-1] = time[current] + 1;
            }

            if (current + 1 <= 100000 && !visited[current + 1]) {
                q.add(current+1);
                visited[current+1] = true;
                time[current+1] = time[current] + 1;
            }

            if (current * 2 <= 100000 && !visited[current * 2]) {
                q.add(current*2);
                visited[current*2] = true;
                time[current*2] = time[current] + 1;
            }
        }
        return -1;
    }
}
