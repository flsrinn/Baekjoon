import java.util.Scanner;

public class Main {
	
	private static boolean isPalindrome(int num) {
		String N = Integer.toString(num);
		int initNumber = num;
		int number[] = new int [N.length()];
		for (int i=0; i<N.length(); i++) {
			number[i] = num % 10;
			num /= 10;
		}
		
		int sum = 0;
		int digit = 1;
		for(int i=number.length-1; i>=0; i--) {
			sum += number[i] * digit;
			digit *= 10;
		}
		if(initNumber == sum) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int N = scanner.nextInt();
			if(N == 0) {
				scanner.close();
				return;
			}
			if(!isPalindrome(N)) {
				System.out.println("no");
			}
			else {
				System.out.println("yes");
			}
		}
	}
}
