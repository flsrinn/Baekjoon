import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N = scanner.nextInt();
		String num = scanner.next();
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			char n = num.charAt(i);
			sum += Character.getNumericValue(n);
		}
		System.out.println(sum);
		scanner.close();
	}

}
