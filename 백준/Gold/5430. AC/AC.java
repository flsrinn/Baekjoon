import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String[] p = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();
            String[] num = br.readLine().replace("[", "").replace("]", "").split(",");
            for (int j=0; j<n; j++) {
                deque.addLast(Integer.parseInt(num[j]));
            }

            boolean isReversed = false;
            boolean isError = false;
            for (int j=0; j<p.length; j++) {
                switch (p[j]) {
                    // 뒤집기
                    case "R":
                        if(isReversed) isReversed = false;
                        else isReversed = true;
                        break;
                    // 첫번째 요소 삭제
                    case "D":
                        if(deque.isEmpty()) {
                            isError = true;
                        }
                        else {
                            if(isReversed) {
                                deque.pollLast();
                            }
                            else {
                                deque.poll();
                            }
                        }

                        break;
                }
            }

            if(isError) {
                sb.append("error\n");
            }
            else if(deque.isEmpty()) {
                sb.append("[]\n");
            }
            else {
                sb.append("[");
                if(isReversed) {
                    while (deque.size() > 1) {
                        sb.append(deque.pollLast() + ",");
                    }
                    sb.append(deque.pollLast().toString());
                }
                else {
                    while (deque.size() > 1) {
                        sb.append(deque.poll() + ",");
                    }
                    sb.append(deque.poll().toString());
                }
                sb.append("]\n");
            }
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
