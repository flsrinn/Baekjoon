import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        int aCount = 1, bCount = 0;
        for (int i=0; i<K; i++) {
            int tmpA = bCount;
            int tmpB = aCount + bCount;
            
            // 현재 a, b의 정보 업데이트
            aCount = tmpA;
            bCount = tmpB;
        } 

        sb.append(aCount).append(" ").append(bCount);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
