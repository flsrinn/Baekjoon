import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int num = 2;
		int less = 1;
		int max = 1;
		
		while(true) {
			if(a < num || b < num) break;
			if(a%num != 0 || b%num != 0)
				num++;
			else {
				a/=num;
				b/=num;
				less *= num;
				max *= num;
			}
		}
		
		max *= a * b;
		
		System.out.println(less);
		System.out.println(max);
		
		scanner.close();
	}

}
