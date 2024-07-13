import java.io.*;
import java.util.ArrayList;

public class Main {

    // 한수 여부를 판별하는 함수
    private static boolean isHansoo(int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int gap = 0, count = 0;
        while (x > 0) {
            al.add(x % 10);
            x /= 10;

            if(al.size() == 2) {
                gap = al.get(count-1) - al.get(count);
            }
            else if(al.size() > 2) {
                int g = al.get(count-1) - al.get(count);
                if (g != gap) return false; // 등차수열이 아닐 경우 false
            }
            count++;
        }
        return true; // 등차수열을 이룰 경우 true
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=1; i<=N; i++) {
            if(isHansoo(i)) count++;
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
