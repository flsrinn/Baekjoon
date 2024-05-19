import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sugar = 0;

        while (N > 0) {
            if (N - 5 < 0 && N - 3 < 0) {
                sugar = -1;
                break;
            } else if (N % 5 == 0) {
                sugar += N / 5;
                break;
            } else if (N - 3 >= 0) {
                N -= 3;
                sugar++;
            }
        }
        bw.write(Integer.toString(sugar));
        bw.flush();
        br.close();

    }
}
