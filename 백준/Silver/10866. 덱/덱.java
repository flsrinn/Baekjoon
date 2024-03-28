import java.util.Scanner;

class Deque {
    private int front = 0, rear = 0;
    private int MAX_DEQUE_SIZE = 10000;
    private int data[] = new int [MAX_DEQUE_SIZE];
    private StringBuilder sb = new StringBuilder();
    private int num;

    private void push_front(int num) {
        if(isFull()) {
            return;
        }
        data[front] = num;
        front = (front - 1 + MAX_DEQUE_SIZE) % MAX_DEQUE_SIZE;
    }

    private void push_back(int num) {
        if(isFull()) {
            return;
        }
        rear = (rear + 1) % MAX_DEQUE_SIZE;
        data[rear] = num;
    }

    private int pop_front() {
        if(isEmpty() == 1) {
            return -1;
        }
        front = (front + 1) % MAX_DEQUE_SIZE;
        return data[front];
    }

    private int pop_back() {
        int prev = rear;
        if(isEmpty() == 1) {
            return -1;
        }
        rear = (rear - 1 + MAX_DEQUE_SIZE) % MAX_DEQUE_SIZE;
        return data[prev];
    }

    private int getSize() {
        return (MAX_DEQUE_SIZE - (front - rear)) % MAX_DEQUE_SIZE;
    }

    private int isEmpty() {
        if(rear == front) {
            return 1;
        }
        return 0;
    }

    private boolean isFull() {
        if((rear + 1) % MAX_DEQUE_SIZE == front) {
            return true;
        }
        return false;
    }

    private int getFront() {
        if(isEmpty() == 1) {
            return -1;
        }
        return data[(front + 1) % MAX_DEQUE_SIZE];
    }

    private int getBack() {
        if(isEmpty() == 1) {
            return -1;
        }
        return data[rear];
    }

    private void setDeque() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=0; i<N; i++) {
            String command = scanner.next();
            switch (command) {
                case "push_front":
                    num = scanner.nextInt();
                    push_front(num);
                    break;
                case "push_back":
                    num = scanner.nextInt();
                    push_back(num);
                    break;
                case "pop_front":
                    sb.append(pop_front() + "\n");
                    break;
                case "pop_back":
                    sb.append(pop_back() + "\n");
                    break;
                case "size":
                    sb.append(getSize() + "\n");
                    break;
                case "empty":
                    sb.append(isEmpty() + "\n");
                    break;
                case "front":
                    sb.append(getFront() + "\n");
                    break;
                case "back":
                    sb.append(getBack() + "\n");
                    break;
            }
        }
        scanner.close();
    }

    public void run() {
        setDeque();
        System.out.println(sb);
    }
}

public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.run();
    }
}
