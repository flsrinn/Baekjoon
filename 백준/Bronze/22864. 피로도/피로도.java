import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);

        int tired = 0;
        int time = 0;
        int job = 0;
        while (time < 24) {
            if(A > M) break;
            if(tired + A <= M) {
                tired += A;
                job += B;
            }
            else if (tired - C >= 0)
                tired -= C;
            else tired = 0;
            time++;
        }
        bw.write(job + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
