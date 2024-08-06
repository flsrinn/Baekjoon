import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] n = br.readLine().split(" ");
        int[] line = new int[N];
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(n[i]);
        }

        Stack<Integer> s = new Stack<>();
        int next = 1; 

        for (int i = 0; i < N; i++) {
            while (!s.isEmpty() && s.peek() == next) {
                s.pop();
                next++;
            }
            if (line[i] == next) {
                next++;
            } else {
                s.push(line[i]);
            }
        }

        while (!s.isEmpty() && s.peek() == next) {
            s.pop();
            next++;
        }

        if (next - 1 == N) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
