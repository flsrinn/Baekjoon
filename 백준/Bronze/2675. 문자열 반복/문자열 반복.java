import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int R;
		for(int i=0; i<T; i++) {
			R = s.nextInt();
			String text = s.next();
			for(int j=0; j<text.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(text.charAt(j));
				}
			}
			System.out.println();
		}
		
		
		s.close();
	}

}
