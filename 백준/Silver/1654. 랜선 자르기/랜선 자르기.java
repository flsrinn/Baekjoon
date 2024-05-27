import java.io.*;
import java.util.Arrays;

public class Main {
    private static long[] array, copyArray;
    private static long N;
    private static long max = 0;

    private static boolean isPossible(long[] copyArray, long num) {
        long sum = 0;
        int count = 0;

        for (int i=0; i<copyArray.length; i++) {
            while(copyArray[i] - num >= 0) {
                copyArray[i] -= num;
                sum += num;
                count++;
            }
        }

        if(sum > max) {
            max = sum;
        }

        if(N <= count) {
            return true;
        }
        else return false;
    }

    private static long binarySearch(long start, long end) {
        long mid;
        while (start <= end) {
            copyArray = Arrays.copyOfRange(array, 0, array.length);
            mid = (start + end) / 2;
            if(isPossible(copyArray, mid)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return start - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int K = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);

        array = new long[K];
        copyArray = new long[K];
        for (int i=0; i<K; i++) {
            array[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(array);
        bw.write(binarySearch(1, array[array.length-1]) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
