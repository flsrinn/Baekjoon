import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[8];
		int pitch[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < 8; i++) {
			num[i] = scanner.nextInt();
		}

		for (int i = 0; i < pitch.length; i++) {
			if (num[i] != pitch[i]) {
				break;
			}
			if (i == pitch.length - 1) {
				System.out.println("ascending");
				return;
			}
		}

		for (int i = 0; i < pitch.length; i++) {
		    if (num[i] != pitch[pitch.length - 1 - i]) {
		        break;
		    }
		    if (i == pitch.length - 1) {
		        System.out.println("descending");
		        return;
		    }
		}

		System.out.println("mixed");

		scanner.close();
	}

}
