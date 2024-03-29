import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        int[] numArray = new int [N];
        for (int i=0; i<N; i++) {
            numArray[i] = scanner.nextInt();
        }
        Arrays.sort(numArray);
        for (int i=0; i<numArray.length; i++) {
            sb.append(numArray[i] + "\n");
        }
        System.out.println(sb);
        scanner.close();
    }
}
