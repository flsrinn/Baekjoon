import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 8;
        int roomCount = 1;
        if(N != 1){
            for (int i=2; i<=N; i++) {
                if(count == i) {
                    roomCount++;
                    count += (6 * roomCount);
                }
            }
            roomCount++;
        }
        bw.write(Integer.toString(roomCount));

        bw.flush();
        bw.close();
        br.close();
    }
}
