import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(nums[i]);
            if(!hs.contains(num)) hs.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        for (int i=0; i<list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
