import java.util.Scanner;

public class Main {
    private static int power(int num, int times) {
        int result = 1;
        while(times > 0) {
            result *= num;
            times--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        String alphabet[] = new String[26];
        char currentAlphabet = 'a';
        for(int i=0; i<26; i++){
            alphabet[i] = String.valueOf(currentAlphabet);
            currentAlphabet++;
        }
        int hashSum = 0;
        int count = 0;
        int alphabetIndex = 0;
        String hashString = scanner.next();
        for(int i=0; i<L; i++) {
            String letter = String.valueOf(hashString.charAt(i));
            for (int j=0; j<26; j++) {
                if(alphabet[j].equals(letter)) {
                    alphabetIndex = j+1;
                }
            }
            int result =  alphabetIndex * power(31, count);
            hashSum += result;
            count++;
        }
        System.out.println(hashSum);
        scanner.close();
    }
}
