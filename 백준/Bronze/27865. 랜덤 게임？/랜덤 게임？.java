import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // N 입력 받기
        Random random = new Random(); // 랜덤 숫자 생성기

        for (int i = 0; i < 20000; i++) {
            int guess = random.nextInt(N) + 1; // 1부터 N까지 랜덤 숫자 생성

            // 현재 인터랙터가 가진 수가 guess인지 물어보기
            bw.write("? " + guess + "\n");
            bw.flush(); // 질문 후 버퍼 비우기

            // 인터랙터로부터 응답 받기
            String response = br.readLine();

            if (response.equals("Y")) {
                // 정답을 맞췄다면 그 수를 출력하고 종료
                bw.write("! " + guess + "\n");
                bw.flush(); // 정답 출력 후 버퍼 비우기
                break; 
            }
        }

        bw.close();
        br.close();
    }
}
