import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            String[] fox = br.readLine().split(" ");
            ArrayList<String> list = new ArrayList<>();
            list.addAll(Arrays.asList(fox));

            HashSet<String> set = new HashSet<>();
            while(true) {
                String st = br.readLine();
                if(st.equals("what does the fox say?")) break;
                String[] a = st.split(" ");
                set.add(a[2]);
            }

            list.removeAll(set);
            for(String s : list) sb.append(s).append(" ");
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
