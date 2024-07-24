import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            queue.add(i);
        }

        sb.append("<");
        for (int i=0; i<N; i++) {
            for (int j=0; j<K-1; j++) {
                int num = queue.poll();
                queue.add(num);
            }
            sb.append(queue.poll());
            if(i != N-1) sb.append(", ");
        }
        sb.append(">");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
