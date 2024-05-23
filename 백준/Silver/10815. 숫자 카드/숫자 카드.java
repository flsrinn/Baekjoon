import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> cards = new HashSet<>();
        String[] card = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            cards.add(Integer.parseInt(card[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i=0; i<M; i++) {
            if(cards.contains(Integer.parseInt(s[i]))) {
                sb.append("1 ");
            }
            else {
                sb.append("0 ");
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
