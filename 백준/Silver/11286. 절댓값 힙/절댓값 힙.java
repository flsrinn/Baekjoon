import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐 
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            // 절댓값 정렬
            @Override
            public int compare(Integer o1, Integer o2) {
                // 절댓값이 같을 경우 
                if(Math.abs(o1) == Math.abs(o2))
                    return Integer.compare(o1, o2);
                else return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });

        for (int i=0; i<N; i++) {
            int op = Integer.parseInt(br.readLine());
            if(op == 0) {
                if(priorityQueue.isEmpty()) {
                    sb.append("0\n");
                }
                else {
                    sb.append(priorityQueue.remove()).append("\n");
                }
            }
            else {
                priorityQueue.add(op);
            }
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();

    }
}
