import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
				'w', 'x', 'y', 'z'};
		int count[] = new int [26];
		String text = scanner.next();
		text = text.toLowerCase();
		for(int i=0; i<text.length(); i++) {
			for(int j=0; j<alphabet.length; j++) {
				if(text.charAt(i) == alphabet[j]) {
					count[j]++;
				}
			}
		}
		int largest = count[0];
		int largestIndex = 0;
		for(int i=0; i<count.length; i++) {
			if(largest < count[i]) { 
				largest = count[i];
				largestIndex = i;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] == count[largestIndex] && i != largestIndex) {
				System.out.println("?");
				return;
			}
		}
		System.out.println(Character.toString(alphabet[largestIndex]).toUpperCase());
		scanner.close();
	}
}
