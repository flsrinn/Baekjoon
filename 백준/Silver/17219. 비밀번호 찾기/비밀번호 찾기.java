import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] T = br.readLine().split(" ");
        int N = Integer.parseInt(T[0]);
        int M = Integer.parseInt(T[1]);

        // 비밀번호 정보 입력
        HashMap<String, String> passwords = new HashMap<>();
        for (int i=0; i<N; i++) {
            String[] sites = br.readLine().split(" ");
            passwords.put(sites[0], sites[1]);
        }

        // 찾으려는 사이트의 비밀번호 출력
        for (int i=0; i<M; i++) {
            String site = br.readLine();
            sb.append(passwords.get(site) + "\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
