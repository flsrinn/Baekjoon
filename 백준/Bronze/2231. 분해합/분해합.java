import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int number = i;
            int sum = number;
            while (number > 0) {
                sum += (number % 10);
                number /= 10;
            }
            if(sum == N) {
                bw.write(Integer.toString(i));
                break;
            }
            else if(i == N - 1) {
                bw.write(Integer.toString(0));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
