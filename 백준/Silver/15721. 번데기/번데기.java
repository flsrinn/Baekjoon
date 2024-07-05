import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        int word = Integer.parseInt(br.readLine());

        int aCount = 0;
        int tCount = 0;
        int count = 2;
        while(tCount < T) {
            ArrayList<Integer> game = new ArrayList<>(Arrays.asList(0, 1, 0, 1));
            // 뻔 * n
            for (int i=0; i<count; i++) {
                game.add(0);
            }
            // 데기 * n
            for (int i=0; i<count; i++) {
                game.add(1);
            }

            for (int i=0; i<game.size(); i++) {
                if(game.get(i) == word) {
                    tCount++;
                    if(tCount == T) break;
                }
                aCount++;
                if(aCount == A) aCount = 0;
            }
            count++;
        }
        bw.write(aCount + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
