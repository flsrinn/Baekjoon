import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] cards = new int[N];
        for(int i=0; i<N; i++) {
            cards[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i=0; i<cards.length; i++) {
            for(int j=i+1; j<cards.length; j++) {
                for (int k=j+1; k<cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(result < sum && M >= sum) {
                        result = sum;
                    }
                }
            }
        }
        sb.append(result);
        System.out.println(sb);
        scanner.close();
    }
}
