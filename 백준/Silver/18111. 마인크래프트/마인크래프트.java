import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);
        int B = Integer.parseInt(array[2]);
        int min = 256;
        int max = 0;

        int[][] blocks = new int[N][M];
        for (int i=0; i<N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j=0; j<M; j++) {
                int count = Integer.parseInt(row[j]);
                blocks[i][j] = count;
                max = Math.max(count, max);
                min = Math.min(count, min);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;

        for (int i = max; i >= min; i--) {
            int time = 0;
            int inventory = B;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    int diff = blocks[j][k] - i;
                    if (diff > 0) { // 현재 블록이 목표 높이보다 높은 경우
                        time += diff * 2;
                        inventory += diff;
                    } else if (diff < 0) { // 현재 블록이 목표 높이보다 낮은 경우
                        time -= diff;
                        inventory += diff; // 여기서는 inventory가 줄어듭니다.
                    }
                }
            }
            if (inventory >= 0 && time < minTime) { // 인벤토리 검사와 최소 시간 갱신
                minTime = time;
                height = i;
            }
        }


        bw.write(minTime + " " + height);

        bw.flush();
        bw.close();
        br.close();
    }
}
