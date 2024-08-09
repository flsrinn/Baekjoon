import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] info = br.readLine().split(" ");
            int num = Integer.parseInt(info[0]);
            ArrayList<Integer> medals = new ArrayList<>();
            for (int j = 1; j < info.length; j++) {
                medals.add(Integer.parseInt(info[j]));
            }

            map.put(num, medals);
        }

        ArrayList<int[]> list = new ArrayList<>();
        for (int key : map.keySet()) {
            ArrayList<Integer> medals = map.get(key);
            list.add(new int[]{key, medals.get(0), medals.get(1), medals.get(2)});
        }


        list.sort((o1, o2) -> {
            if (o1[1] != o2[1]) return o2[1] - o1[1];
            else if (o1[2] != o2[2]) return o2[2] - o1[2];
            else return o2[3] - o1[3];
        });

        int rank = 1;
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && !Arrays.equals(Arrays.copyOfRange(list.get(i), 1, 4), Arrays.copyOfRange(list.get(i - 1), 1, 4))) {
                rank = i + 1;
            }
            if (list.get(i)[0] == K) {
                bw.write(rank + "\n");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
