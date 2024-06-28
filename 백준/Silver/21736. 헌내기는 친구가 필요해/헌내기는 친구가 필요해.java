import java.io.*;

public class Main {
    private static String[][] campus;
    private static boolean[][] visited;
    private static int count = 0;

    private static void move(int n, int m) {
        if(n < 0 || m < 0 || n >= campus.length || m >= campus[n].length || visited[n][m] || campus[n][m].equals("X"))
            return;
        else if (campus[n][m].equals("P")) {
            count++;
        }

        visited[n][m] = true;

        move(n-1, m);
        move(n+1, m);
        move(n, m-1);
        move(n, m+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        campus = new String[N][M];
        visited = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split("");
            for (int j=0; j<M; j++) {
                campus[i][j] = s[j];
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if(!visited[i][j] && campus[i][j].equals("I")) {
                    move(i, j);
                }
            }
        }
        if(count == 0)
            bw.write("TT");
        else bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
