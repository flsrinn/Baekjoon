import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int total = Integer.parseInt(br.readLine());
            HashMap<String, Integer> closet = new HashMap<>();
            for (int j=0; j<total; j++) {
                String[] clothes = br.readLine().split(" ");
                if(!closet.containsKey(clothes[1])) {
                    closet.put(clothes[1], 1);
                }
                else {
                    int count = closet.get(clothes[1]);
                    closet.put(clothes[1], ++count);
                }
            }
            if(closet.size() == 1) {
                bw.write(total + "\n");
            }
            else {
                int count = 1;
                Set<String> sets = closet.keySet();
                Iterator<String> it = sets.iterator();
                while (it.hasNext()) {
                    count *= (closet.get(it.next()) + 1);
                }
                bw.write(--count + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
