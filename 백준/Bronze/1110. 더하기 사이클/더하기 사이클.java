import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int ten = num / 10;
		int one = num % 10;
		int count = 0;

		while(true) {
			int sum = ten + one;
			ten = one;
			one = sum % 10;
			count++;
			if(ten*10 + one == num)
				break;
		}
		
		System.out.println(count);
		
		scanner.close();
	}

}
