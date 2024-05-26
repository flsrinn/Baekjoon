import java.io.*;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            int K = Integer.parseInt(br.readLine());
            // 트리맵 사용
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();

            for (int j=0; j<K; j++) {
                String[] test = br.readLine().split(" ");
                String op = test[0];
                int n = Integer.parseInt(test[1]);
                switch (op) {
                    case "I":
                        treeMap.put(n, treeMap.getOrDefault(n, 0) + 1);
                        break;
                    case "D":
                        if(treeMap.isEmpty()) continue;
                        // 최댓값 삭제
                        if(n == 1) {
                            int max = treeMap.lastKey();
                            if (treeMap.get(max) == 1) {
                                treeMap.remove(max);
                            }
                            else {
                                treeMap.put(max, treeMap.get(max) - 1);
                            }
                        }
                        // 최솟값 삭제
                        else {
                            int min = treeMap.firstKey();
                            if (treeMap.get(min) == 1) {
                                treeMap.remove(min);
                            }
                            else {
                                treeMap.put(min, treeMap.get(min) - 1);
                            }
                        }
                        break;
                }
            }

            if(treeMap.isEmpty()) {
                bw.write("EMPTY\n");
            }
            else {
                int min = treeMap.firstKey();
                int max = treeMap.lastKey();

                bw.write(max + " " + min + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
