import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] word = br.readLine().split("");
        for (int i=0; i<word.length; i++) {
            String alphabet = word[i];
            String lower = alphabet.toLowerCase();
            String upper = alphabet.toUpperCase();
            if(!lower.equals(word[i])) {
                sb.append(lower);
            }
            else if(!upper.equals(word[i])) {
                sb.append(upper);
            }
        }

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
