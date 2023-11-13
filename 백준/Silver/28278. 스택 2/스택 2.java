import java.util.Scanner;

class Stack {
	private int stack[] = new int [1000001];
	private int size = 0;
	
	public void push(int num) {
		stack[++size] = num;
	}
	
	public int pop() {
		if(size == 0) return -1;
		return stack[size--];
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		if(size == 0) return 1;
		return 0;
	}
	
	public int peek() {
		if(size == 0) return -1;
		return stack[size];
	}
}

class StackManager {
	private StringBuffer sb = new StringBuffer();
	private Stack s = new Stack();
	
	private void stack() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int task;
		
		for(int i=0; i<N; i++) {
			task = scanner.nextInt();
			switch(task) {
			case 1:
				int a = scanner.nextInt();
				s.push(a); break;
			case 2: 
				sb.append(s.pop()).append('\n');
				break;
			case 3:
				sb.append(s.size()).append('\n');
				break;
			case 4:
				sb.append(s.empty()).append('\n');
				break;
			case 5:
				sb.append(s.peek()).append('\n');
				break;
			}
		}
		System.out.println(sb);
		scanner.close();
	}
	
	public void run() {
		stack();
	}
}

public class Main {

	public static void main(String[] args) {
		StackManager sm = new StackManager();
		sm.run();
	}

}
