import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split("");
        int count = 0;
        int i = 0;

        while (i < s.length) {
            String current = s[i];

            if (i < s.length - 1) {
                String next = s[i + 1];

                if (current.equals("c") && (next.equals("=") || next.equals("-"))) {
                    count++;
                    i += 2;
                    continue;
                } else if (current.equals("d") && next.equals("-")) {
                    count++;
                    i += 2;
                    continue;
                } else if ((current.equals("l") || current.equals("n")) && next.equals("j")) {
                    count++;
                    i += 2;
                    continue;
                } else if ((current.equals("s") || current.equals("z")) && next.equals("=")) {
                    count++;
                    i += 2;
                    continue;
                } else if (current.equals("d") && next.equals("z") && i < s.length - 2 && s[i + 2].equals("=")) {
                    count++;
                    i += 3;
                    continue;
                }
            }

            count++;
            i++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
