import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static boolean binarySearch(int num, int low, int high, int[] array) {
        if(low > high)
            return false;
        int mid = (low + high) / 2;
        if(array[mid] == num) {
            return true;
        }
        else if(array[mid] > num) {
            return binarySearch(num, low, mid-1, array);
        }
        else {
            return binarySearch(num, mid + 1, high, array);
        }
    }

    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int M = scanner.nextInt();
        for (int i=0; i<M; i++) {
            int num = scanner.nextInt();
            if (binarySearch(num, 0, N - 1, A)) {
                sb.append(1 + "\n");
            }
            else {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
        scanner.close();
    }
}
