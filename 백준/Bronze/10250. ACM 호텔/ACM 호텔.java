import java.util.Scanner;

public class Main {
	public static void floor(int h, int w, int n) {
		int count = 0;
		while(n - h > 0) {
			n -= h;
			count++;
		}
		if(count + 1 >= 10) {
			System.out.println(Integer.toString(n) + Integer.toString(count + 1));
		}
		else {
			System.out.println(Integer.toString(n) + "0" + Integer.toString(count + 1));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T, H, W, N;
		T = scanner.nextInt();
		for(int i=0; i<T; i++) {
			// 6 12 10
			H = scanner.nextInt();
			W = scanner.nextInt();
			N = scanner.nextInt();
			floor(H, W, N);
		}
		
		scanner.close();
	}

}
