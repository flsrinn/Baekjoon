import java.util.Scanner;

class Stack {
    int top = -1;
    int stack[] = new int[100000];
    int n;
    int [] num;
    int number = 0;
    StringBuilder sb = new StringBuilder();
    private void push(int num) {
        sb.append("+\n");
        stack[++top] = num;
    }
    private int pop() {
        sb.append("-\n");
        return stack[top--];
    }

    private int peek() {
        return stack[top];
    }

    private void writeNum() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        num = new int[n];
        for (int i=0; i<n; i++) {
            num[i] = scanner.nextInt();
        }
    }

    private void search() {
        int count = 0;
        while(count != n) {
            if(top == -1 || num[count] != peek()) {
                push(++number);
            }
            else if(peek() == num[count]) {
                pop();
                count++;
            }
            if(number > n){
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
    }

    public void run() {
        writeNum();
        search();
        System.out.print(sb);
    }
}

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.run();
    }
}
