import java.io.*;

public class Main {
    private static int fibonacci(int n) {
        int f0=0, f1=1, f2=1;
        for (int i=2; i<=n; i++) {
            f2 = f0+f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                bw.write("1 0\n");
            }
            else if(num == 1) {
                bw.write("0 1\n");
            }
            else {
                bw.write(fibonacci(num-1) + " " + fibonacci(num) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
