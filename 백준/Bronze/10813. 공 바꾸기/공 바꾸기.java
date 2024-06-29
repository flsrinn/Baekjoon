import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] bucket = new int [N];

        for (int i=0; i<N; i++) {
            bucket[i] = i+1;
        }

        for (int i=0; i<M; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            int tmp = bucket[a-1];
            bucket[a-1] = bucket[b-1];
            bucket[b-1] = tmp;
        }

        for (int i=0; i<N; i++) {
            bw.write(bucket[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
