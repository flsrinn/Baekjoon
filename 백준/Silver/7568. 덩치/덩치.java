import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] people = new int [N][2];
        int[] rank = new int[N];
        Arrays.fill(rank, 1);

        for (int i=0; i<N; i++) {
            String[] info = br.readLine().split(" ");
            people[i][0] = Integer.parseInt(info[0]);
            people[i][1] = Integer.parseInt(info[1]);
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank[i]++;
                }
                else if((people[i][0] > people[j][0] && people[i][1] < people[j][1]) || (people[i][0] < people[j][0] && people[i][1] > people[j][1])) {
                    rank[i]++;
                    rank[j]--;
                }
            }
        }

        for (int i=0; i<N; i++) {
            bw.write(rank[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
