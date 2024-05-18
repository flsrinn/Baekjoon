import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] T = br.readLine().split(" ");
        int N = Integer.parseInt(T[0]);
        int M = Integer.parseInt(T[1]);

        String[] numbers = br.readLine().split(" ");
        int[] num = new int [N];
        int[] sum = new int [N];
        for (int i=0; i<N; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }

        // 누적합 구하기
        sum[N-1] = num[N-1];
        for (int i=N-2; i>=0; i--) {
            sum[i] = num[i] + sum[i+1];
        }
        
        for (int i=0; i<M; i++) {
            String[] range = br.readLine().split(" ");
            int x = Integer.parseInt(range[0]);
            int y = Integer.parseInt(range[1]);
            int result;
            if(x == y) {
                result = num[x-1];
            }
            else if(y != N) {
                result = sum[x-1] - sum[y];
            }
            else {
                result = sum[x-1];
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
