import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double score[] = new double [n];
		for(int i=0; i<n; i++) {
			score[i] = scanner.nextInt();
		}
		double M = score[0];
		for(int i=0; i<n; i++) {
			if(M < score[i])
				M=score[i];
		}
		double sum = 0;
		for(int i=0; i<n; i++) {
			score[i] = score[i] / M * 100;
		}
		for(int i=0; i<n; i++) {
			sum += score[i];
		}
		
		System.out.println(sum / n);
		scanner.close();
	}

}
