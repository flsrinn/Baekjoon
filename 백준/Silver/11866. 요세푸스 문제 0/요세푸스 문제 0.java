import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nums = br.readLine();
        String[] num = nums.split(" ");
        int N = Integer.parseInt(num[0]);
        int K = Integer.parseInt(num[1]);
        bw.write("<");

        int[] array = new int[N];
        for (int i=1; i<=N; i++) {
            array[i-1] = i;
        }
        int count = 0;
        int arraySize = 0;
        int arrayIndex = 0;
        while (arraySize != N) {
            if(array[arrayIndex] != -1) {
                count++;
            }
            if(count == K) {
                count = 0;
                bw.write(Integer.toString(array[arrayIndex]));
                array[arrayIndex] = -1;
                arraySize++;
                if (arraySize != N)
                    bw.write(", ");
            }
            if(arrayIndex <= N - 2)
                arrayIndex++;
            else
                arrayIndex = 0;
        }

        bw.write(">");

        bw.flush();
        bw.close();
        br.close();
    }
}
