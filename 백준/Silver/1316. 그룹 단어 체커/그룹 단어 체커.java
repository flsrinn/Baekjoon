import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=0; i<N; i++) {
            String s = br.readLine();
            HashSet<Character> set = new HashSet<>();
            char current = s.charAt(0);
            set.add(current);
            boolean isGroupWord = true;
            for (int j=1; j<s.length(); j++) {
                char c = s.charAt(j);
                if(current != c) {
                    if(set.contains(c)) {
                        isGroupWord = false;
                        break;
                    }
                    else {
                        set.add(c);
                        current = c;
                    }
                }
            }
            if(isGroupWord) {
                count++;
            }
        }
        sb.append(count);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
