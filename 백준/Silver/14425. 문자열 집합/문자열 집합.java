import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int M = Integer.parseInt(strings[1]);

        HashSet<String> hashSet = new HashSet<>();
        for (int i=0; i<N; i++) {
            String string = br.readLine();
            hashSet.add(string);
        }

        int count = 0;
        for (int i=0; i<M; i++) {
            String string = br.readLine();
            if(hashSet.contains(string)) count++;
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
