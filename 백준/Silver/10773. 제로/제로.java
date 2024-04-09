import java.util.Scanner;

class ZeroStack {
    private int MAX_STACK_SIZE = 100000;
    private int[] stack = new int[MAX_STACK_SIZE];
    private int top = -1;
    private int K;
    private int sum = 0;

    private void push(int num) {
        if(top > MAX_STACK_SIZE-1) return;
        stack[++top] = num;
        sum += num;
    }

    private void pop() {
        if(top == -1) return;
        sum -= stack[top--];
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        for(int i=0; i<K; i++) {
            int num = scanner.nextInt();
            if(num == 0 && top != -1) {
                pop();
            }
            else {
                push(num);
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        ZeroStack zeroStack = new ZeroStack();
        zeroStack.run();
    }
}
