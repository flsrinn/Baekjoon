import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int num = 0;
        int backNum = 0;
        for (int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            String op = input[0];
            switch (op) {
                case "push":
                    backNum = Integer.parseInt(input[1]);
                    queue.add(backNum);
                    break;
                case "pop":
                    if(queue.isEmpty()) num = -1;
                    else num = queue.poll();
                    break;
                case "size":
                    num = queue.size();
                    break;
                case "empty":
                    if(queue.isEmpty()) num = 1;
                    else num = 0;
                    break;
                case "front":
                    if(queue.isEmpty()) num = -1;
                    else num = queue.peek();
                    break;
                case "back":
                    if(queue.isEmpty()) num = -1;
                    else num = backNum;
                    break;
            }
            if(!op.equals("push"))
                sb.append(num).append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
