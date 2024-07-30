import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i=0; i<N*2 - 1; i++) {
            String name = br.readLine();
            if(set.contains(name)) set.remove(name);
            else set.add(name);
        }
        List<String> list = new ArrayList<>(set);
        sb.append(list.get(0));

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
