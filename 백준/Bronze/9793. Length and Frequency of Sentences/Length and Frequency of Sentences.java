import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<N; i++) {
            String[] string = br.readLine().trim().split("\\s+");
            int len = string.length;
            if(hashMap.containsKey(len)) {
                hashMap.put(len, hashMap.get(len)+1);
            }
            else {
                hashMap.put(len, 1);
            }
        }

        List<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            int key = it.next();
            sb.append(key).append(" ").append(hashMap.get(key)).append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
