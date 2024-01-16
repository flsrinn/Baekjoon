import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int count[] = new int[26];
		for(int i=0; i<count.length; i++) {
			count[i] = -1;
		}
		char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
				'w', 'x', 'y', 'z'};
		for(int i=0; i<S.length(); i++) {
			for(int j=0; j<alphabet.length; j++) {
				if(S.charAt(i) == alphabet[j] && count[j] == -1) {
					count[j] = i;
				}
			}
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.print(count[i] + " ");
		}
		scanner.close();
	}

}
