import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        String result = S.replaceAll("pi|ka|chu", "");

        if(result.equals("")) sb.append("YES");
        else sb.append("NO");
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
