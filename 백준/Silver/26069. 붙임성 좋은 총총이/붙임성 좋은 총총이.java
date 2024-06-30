import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet<String> hs = new HashSet<>();
        hs.add("ChongChong");
        for (int i=0; i<N; i++) {
            String[] names = br.readLine().split(" ");
            if(hs.contains(names[0])) hs.add(names[1]);
            else if(hs.contains(names[1])) hs.add(names[0]);
        }
        bw.write(hs.size() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
