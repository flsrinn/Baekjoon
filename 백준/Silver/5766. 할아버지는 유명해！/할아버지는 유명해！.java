import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            if(N == 0 && M == 0) break;

            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i=0; i<N; i++) {
                String[] info = br.readLine().split(" ");
                for (int j=0; j<M; j++) {
                    int n = Integer.parseInt(info[j]);
                    hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
                }
            }

            List<Integer> list = new ArrayList<>(hashMap.values());
            Collections.sort(list, Collections.reverseOrder());
            int max = list.get(0);
            int second = 0;
            for (int i=1; i<list.size(); i++) {
                if(max != list.get(i)) {
                    second = list.get(i);
                    break;
                }
            }

            List<Integer> secondPlayers = new ArrayList<>();
            for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if(entry.getValue() == second) {
                    secondPlayers.add(entry.getKey());
                }
            }

            Collections.sort(secondPlayers);
            for (int n : secondPlayers) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
