import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        String[] input = br.readLine().split(" ");

        for (int i=0; i<N; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int[] origianl = array.clone();
        Arrays.sort(array);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i=0; i<N; i++) {
            if(!map.containsKey(array[i])) {
                map.put(array[i], count++);
            }
        }

        for (int i=0; i<N; i++) {
            sb.append(map.get(origianl[i])).append(" ");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
