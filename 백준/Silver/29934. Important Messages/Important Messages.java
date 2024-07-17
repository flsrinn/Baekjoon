import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            String email = br.readLine();
            set.add(email);
        }

        int M = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=0; i<M; i++) {
            String s = br.readLine();
            if(set.contains(s)) count++;
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
