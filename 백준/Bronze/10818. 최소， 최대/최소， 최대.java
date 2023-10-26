import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int num[] = new int [N];
		
		for(int i=0; i<N; i++) {
			num[i] = s.nextInt();
		}
		int lowestIndex = 0, largestIndex = 0;
		for(int i=0; i<N; i++) {
			if(num[lowestIndex] > num[i])
				lowestIndex = i;
			if(num[largestIndex] < num[i])
				largestIndex = i;
		}
		System.out.println(num[lowestIndex] + " " + num[largestIndex]);
		s.close();
	}

}
