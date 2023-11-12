import java.util.Scanner;

public class Main {
	private static int stack[] = new int [10001];
	static int len = 1;
	
	public static int size() {
		return len-1;
	}
	
	public static void push(int num) {
		stack[len++] = num;
	}
	
	public static int pop() {
		if(len == 1) return -1;
		return stack[--len];
	}
	
	public static int empty() {
		if(len == 1) return 1;
		return 0;
	}
	
	public static int top() {
		if(len == 1) return -1;
		return stack[len - 1];
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			String text = scanner.next();
			if(text.equals("push")) {
				int num = scanner.nextInt();
				push(num);
			}
			else if(text.equals("top"))
				sb.append(top()).append('\n');
			else if(text.equals("pop"))
				sb.append(pop()).append('\n');
			else if(text.equals("empty"))
				sb.append(empty()).append('\n');
			else if(text.equals("size"))
				sb.append(size()).append('\n');
				
		}
		System.out.println(sb);
		scanner.close();
	}

}
