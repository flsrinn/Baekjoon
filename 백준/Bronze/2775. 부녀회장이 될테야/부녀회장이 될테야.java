import java.io.*;

public class Main {
    private static int getPeople(int k, int n) {
        if(n == 1) {
            return 1;
        }
        int[][] people = new int[k+1][n];
        for (int i=1; i<=n; i++) {
            people[0][i-1] = i;
        }

        for (int i=1; i<=k; i++) {
            for (int j=1; j<n; j++) {
                if(j - 1 == 0) {
                    people[i][j] += 1 + people[i-1][j];
                }
                else {
                    people[i][j] += people[i][j-1] + people[i-1][j];
                }
            }
        }

        return people[k][n-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int P = getPeople(k, n);
            bw.write(P + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
