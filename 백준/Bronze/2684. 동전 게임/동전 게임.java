import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine()); // number of test cases
        String[] patterns = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};

        for (int i = 0; i < P; i++) {
            String s = br.readLine();
            int[] counts = new int[8];

            for (int j = 0; j <= s.length() - 3; j++) {
                String sub = s.substring(j, j + 3);
                for (int k = 0; k < 8; k++) {
                    if (sub.equals(patterns[k])) {
                        counts[k]++;
                        break;
                    }
                }
            }

            for (int count : counts) {
                bw.write(count + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
