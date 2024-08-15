import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            long option1 = (long) a * a + (long) (b + c) * (b + c);
            long option2 = (long) b * b + (long) (a + c) * (a + c);
            long option3 = (long) c * c + (long) (a + b) * (a + b);

            long min = Math.min(option1, Math.min(option2, option3));
            bw.write(min + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
