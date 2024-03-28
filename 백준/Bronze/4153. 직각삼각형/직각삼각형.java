import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[3];
        StringBuilder sb = new StringBuilder();
        while(true) {
            for (int i=0; i<3; i++) {
                num[i] = scanner.nextInt();
            }
            if(num[0] == 0 && num[1] == 0 && num[2] == 0) {
                break;
            }
            Arrays.sort(num);
            if(Math.pow(num[0], 2) + Math.pow(num[1], 2) == Math.pow(num[2], 2)) {
                sb.append("right\n");
            }
            else {
                sb.append("wrong\n");
            }
        }
        System.out.println(sb);
        scanner.close();
    }
}
