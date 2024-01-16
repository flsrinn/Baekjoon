import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=0; i<N; i++) {
			int score = 0;
			int bonus=1;
			String answer = scanner.next();
			for(int j=0; j<answer.length(); j++) {
				if(answer.charAt(j) == 'O') {
					score+=bonus;
					bonus++;
				}
				else {
					bonus=1;
				}
			}
			System.out.println(score);
		}
		
		scanner.close();
	}

}
