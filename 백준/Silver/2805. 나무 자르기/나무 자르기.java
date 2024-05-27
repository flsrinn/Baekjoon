import java.io.*;
import java.util.Arrays;

public class Main {
    private static int[] trees;
    private static int M;

    // 매개 변수 탐색
    private static boolean isPossible(long num) {
        long sum = 0;

        for (int i=0; i<trees.length; i++) {
            if(trees[i] >= num) {
                sum += trees[i] - num;
            }
        }

        if(sum >= M) {
            return true;
        }
        else {
            return false;
        }
    }

    // 이진 탐색
    private static long binarySearch(long start, long end){
        long mid;
        while(start <= end) {
            mid = (start + end) / 2;
            if(isPossible(mid)) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start-1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        trees = new int [N];
        String[] size = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            trees[i] = Integer.parseInt(size[i]);
        }

        Arrays.sort(trees);
        bw.write(binarySearch(0, trees[trees.length-1]) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
