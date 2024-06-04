import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        for (int i=0; i<n; i++) {
            String[] log = br.readLine().split(" ");
            if(log[1].equals("enter")) {
                hashSet.add(log[0]);
            }
            else {
                hashSet.remove(log[0]);
            }
        }

        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list, Collections.reverseOrder());

        for (int i=0; i< list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
