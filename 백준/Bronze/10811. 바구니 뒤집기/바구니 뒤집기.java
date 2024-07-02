import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Integer[] bucket = new Integer[N];
        for (int i=0; i<N; i++) {
            bucket[i] = i+1;
        }

        for (int i=0; i<M; i++) {
            String[] s = br.readLine().split(" ");
            int from = Integer.parseInt(s[0])-1;
            int end = Integer.parseInt(s[1])-1;

            int size = ((end - from) + 1) / 2;
            for (int j=0; j<size; j++) {
                int tmp = bucket[from + j];
                bucket[from + j] = bucket[end - j];
                bucket[end - j] = tmp;
            }
        }

        for (int i=0; i<N; i++) {
            sb.append(bucket[i]).append(" ");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
