import java.util.Scanner;

public class Main {
    private static int factorial(int num) {
        int result = 1;
        for(int i=num; i>1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int result = factorial(N) / (factorial(N - K) * factorial(K));
        // n! / (n-k)!*k!
        sb.append(result);
        System.out.println(sb);
        scanner.close();
    }
}
