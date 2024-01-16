import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num[] = new int [10];
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		String result = Integer.toString(A*B*C);
		for(int i=0; i<result.length(); i++) {
			char c = result.charAt(i);
			String s = Character.toString(c);
			int number = Integer.parseInt(s);
			for(int j=0; j<10; j++) {
				if(number == j) {
					num[j]++;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		scanner.close();
	}

}
