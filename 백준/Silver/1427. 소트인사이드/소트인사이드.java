import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] array = br.readLine().split("");
        Arrays.sort(array, Comparator.reverseOrder());

        for (int i=0; i< array.length; i++) {
            sb.append(array[i]);
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
