import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        int[][] position = new int[N][2];
        for (int i=0; i<N; i++) {
            position[i][0] = scanner.nextInt(); // x
            position[i][1] = scanner.nextInt(); // y
        }
        Arrays.sort(position, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        for (int i=0; i<position.length; i++) {
            for (int j=0; j<position[i].length; j++) {
                sb.append(position[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        scanner.close();
    }
}
