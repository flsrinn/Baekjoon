import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split("");
        String[] rewritten = br.readLine().split("");

        int count = 0;
        for (int i=0; i<n; i++) {
            if(strings[i].equals(rewritten[i]))
                count++;
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
