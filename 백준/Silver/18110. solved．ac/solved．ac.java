import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        long num = Math.round(n*0.15);
        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);

        for (int i=0; i<num; i++) {
            array[i] = 0;
            array[n - i - 1] = 0;
        }
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += array[i];
        }
        int avg = (int)Math.round((double) sum / (n - num*2));
        bw.write(Integer.toString(avg));
        bw.flush();
        bw.close();
    }
}
