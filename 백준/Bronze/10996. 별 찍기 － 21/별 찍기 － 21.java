import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j+=2) {
				System.out.print("* ");
			}
			System.out.println();
			for(int j=1; j<n; j+=2) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
