import java.io.*;

public class Main {
    private static int sumCases(int num) {
        if(num == 1) return 1;
        else if(num == 2) return 2;
        else if(num == 3) return 4;
        else
            return sumCases(num-3) + sumCases(num-2) + sumCases(num-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(sumCases(n) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
