import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);

            String[] priorities = br.readLine().split(" ");
            Queue<int[]> queue = new LinkedList<>();
            for (int j=0; j<N; j++) {
                queue.add(new int[]{Integer.parseInt(priorities[j]), j});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();

                boolean isPrintable = true;
                for (int[] doc : queue) {
                    if (doc[0] > current[0]) { // 더 중요한 문서가 있다면
                        isPrintable = false;
                        break;
                    }
                }

                if(isPrintable) {
                    count++;
                    if(current[1] == M) {
                        sb.append(count + "\n");
                        break;
                    }
                }
                else {
                    queue.add(current);
                }
            }
        }
        
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
