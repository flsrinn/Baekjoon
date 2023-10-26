import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine().trim();
		
		if(text.isEmpty()) {
			System.out.println("0");
		}
		else {
			String sp[] = text.split(" ");
			System.out.println(sp.length);
		}
		s.close();
	}

}
