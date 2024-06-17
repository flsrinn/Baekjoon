import java.io.*;

public class Main {

    private static int getCount(int n, int m) {
        int count = 0;
        while (m != 0) {
            count += n / m;
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        bw.write(getCount(n, m) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
