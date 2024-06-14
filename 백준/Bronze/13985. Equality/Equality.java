import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        int c = Integer.parseInt(strings[4]);

        if(a + b == c) {
            bw.write("YES");
        }
        else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
