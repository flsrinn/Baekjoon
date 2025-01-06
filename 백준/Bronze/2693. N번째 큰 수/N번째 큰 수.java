import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String[] nums = br.readLine().split(" ");
			int[] numArray = new int[10];
			
			for(int j=0; j<nums.length; j++) {
				numArray[j] = Integer.parseInt(nums[j]);
			}
			
			Arrays.sort(numArray);
			sb.append(numArray[7]).append("\n");
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();
	}

}
