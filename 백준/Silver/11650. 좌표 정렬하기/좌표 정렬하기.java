import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] position = new int[N][2];

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            position[i][0] = Integer.parseInt(st.nextToken());
            position[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(position, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                } else {
                    return Integer.compare(o1[0], o2[0]);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(position[i][0]).append(" ").append(position[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}
