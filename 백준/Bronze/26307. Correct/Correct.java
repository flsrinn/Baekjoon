import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int HH = Integer.parseInt(input[0]);
        int MM = Integer.parseInt(input[1]);

        bw.write((HH - 9) * 60 + MM + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
