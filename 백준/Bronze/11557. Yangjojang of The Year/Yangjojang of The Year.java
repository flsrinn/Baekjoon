import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<Integer, String> map = new HashMap<>();
            for (int j=0; j<N; j++) {
                String[] s = br.readLine().split(" ");
                String name = s[0];
                int drinks = Integer.parseInt(s[1]);
                map.put(drinks, name);
            }
            ArrayList<Integer> list = new ArrayList<>(map.keySet());
            Collections.sort(list);
            sb.append(map.get(list.get(list.size()-1))).append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
