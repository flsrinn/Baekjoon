import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int count = 1;
        int remain = k;
        String[] amount = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(amount[i]);
            if(remain >= a) {
                remain -= a;
            }
            else {
                count++;
                remain = k - a;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
