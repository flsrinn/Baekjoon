import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }

        // 문자열 최댓값 15
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                // 각 문자열의 i번째 문자가 있는 경우에만 추가
                if (i < list.get(j).length()) {
                    sb.append(list.get(j).charAt(i));
                }
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
