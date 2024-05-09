import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] MBTIs = br.readLine().split(" ");
            if(N > 32) {
                bw.write(0+"\n");
                continue;
            }
            int lowest = 12;
            for (int j = 0; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    for (int l = k+1; l < N; l++) {
                        int instance = 0;
                        for (int m=0; m<4; m++) {
                            if(MBTIs[j].charAt(m) != MBTIs[k].charAt(m)) instance++;
                            if(MBTIs[j].charAt(m) != MBTIs[l].charAt(m)) instance++;
                            if(MBTIs[l].charAt(m) != MBTIs[k].charAt(m)) instance++;
                        }
                        lowest = Math.min(instance, lowest);
                        if(lowest == 0) break;
                    }
                }
            }
            bw.write(lowest + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
