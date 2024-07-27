import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        sb.append(s);
        String reverse = sb.reverse().toString();

        if(s.equals(reverse)) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }
}
