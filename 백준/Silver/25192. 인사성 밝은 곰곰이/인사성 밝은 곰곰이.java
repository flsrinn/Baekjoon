import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> hs = new HashSet<>();
        for (int i=0; i<N; i++) {
            String name = br.readLine();
            if(!name.equals("ENTER") && !hs.contains(name)) {
                hs.add(name);
                count++;
            }
            else if(name.equals("ENTER")) {
                hs.clear();
            }
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
