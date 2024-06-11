import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] students = new int[30];
        for (int i=0; i<28; i++) {
            students[Integer.parseInt(br.readLine())-1]++;
        }

        int[] unsubmit = new int[2];
        int count = 0;
        for (int i=0; i<30; i++) {
            if(students[i] != 1) {
                unsubmit[count] = i+1;
                count++;
            }
        }
        Arrays.sort(unsubmit);

        sb.append(unsubmit[0]).append("\n").append(unsubmit[1]);
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
