import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int U = Integer.parseInt(input[1]);
        int L = Integer.parseInt(input[2]);

        if (N >= 1000 && (U >= 8000 || L >= 260)) {
            sb.append("Very Good");
        }
        else if (N >= 1000) {
            sb.append("Good");
        }
        else {
            sb.append("Bad");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
