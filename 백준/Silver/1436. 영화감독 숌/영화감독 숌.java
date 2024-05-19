import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int hellNum = 666;
        int count = 1;

        while (true) {
            if(count == N) break;
            hellNum++;
            String num = Integer.toString(hellNum);
            if(num.contains("666")) {
                count++;
            }
        }

        bw.write(hellNum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
