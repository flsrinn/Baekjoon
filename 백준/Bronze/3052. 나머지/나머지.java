import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		int count=0;
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
			num[i] %= 42;
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] == num[j]) {
					num[j] = -1;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			if(num[i] != -1) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
