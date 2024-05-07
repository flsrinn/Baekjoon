import java.io.*;
import java.util.Arrays;

public class Main {
    private static int[] cards;

    private static int lowerBound(int search) {
        int left = 0;
        int right = cards.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if(search > cards[mid]) {
                left = mid + 1;
            }
            else if(search <= cards[mid]) {
                right = mid;
            }
        }
        return left;
    }

    private static int upperBound(int search) {
        int left = 0;
        int right = cards.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if(search >= cards[mid]) {
                left = mid + 1;
            }
            else if(search < cards[mid]) {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        cards = new int[N];
        String card = br.readLine();
        String[] cardArray = card.split(" ");
        for (int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(cardArray[i]);
        }
        Arrays.sort(cards);
        int M = Integer.parseInt(br.readLine());
        String num = br.readLine();
        String[] numArray = num.split(" ");
        int count = 0;
        for (int i=0; i<M; i++) {
            int search = Integer.parseInt(numArray[i]);
            count = upperBound(search) - lowerBound(search);
            bw.write(count + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
