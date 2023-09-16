import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long f0 = 0;
		long f1 = 1;
		long f2 = 1;
		int n;
		while(true) {
			try {
				n = scanner.nextInt();
				
			}
			catch(InputMismatchException e) {
				scanner.next();
				continue;
			}
			break;
		}
		for(int i=1; i<n; i++) {
			f2 = f0 + f1;
			f0=f1;
			f1=f2;
		}
		System.out.println(f2);
		scanner.close();
	}
}
