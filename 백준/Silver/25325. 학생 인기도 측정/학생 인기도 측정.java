import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String[] names = br.readLine().split(" ");
        for (int i=0; i<names.length; i++) {
            map.put(names[i], 0);
        }

        for (int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j=0; j<s.length; j++) {
                map.put(s[j], map.get(s[j]) + 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> {
           int value = e2.getValue().compareTo(e1.getValue()); // 인기도 내림차순 정렬
           if (value == 0) {
               return e1.getKey().compareTo(e2.getKey()); // 이름 오름차순 정렬
           }
           return value;
        });

        for(int i=0; i<list.size(); i++) {
            Map.Entry e = list.get(i);
            sb.append(e.getKey()).append(" ").append(e.getValue()).append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
