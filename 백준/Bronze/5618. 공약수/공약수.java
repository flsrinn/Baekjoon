import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] nums = new int [n];
		
		int min = 100000001;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(s[i]);
			if(min > num) min = num;
			
			nums[i] = num;
		}
		
		for(int i=1; i<=min; i++) {
			boolean isCommonDivider = true;
			for(int num : nums) {
				if(!isDivided(num, i)) {
					isCommonDivider = false;
					break;
				}
			}
			if(isCommonDivider) {
				sb.append(i).append("\n");
			}
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static boolean isDivided(int a, int b) {
		return a%b == 0;
	}

}
