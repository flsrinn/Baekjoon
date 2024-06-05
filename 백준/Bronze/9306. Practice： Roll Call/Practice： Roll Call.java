import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        String[] array = new String[T*2];
        for (int i=0; i<T*2; i++) {
            array[i] = br.readLine();
        }

        for (int i=0; i<T; i++) {
            sb.append("Case ").append(i+1).append(": ").append(array[i*2+1]).append(", ").append(array[i*2]).append("\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
