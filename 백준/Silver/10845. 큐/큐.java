import java.util.Scanner;

class Queue {
    int front = 0, rear = 0;
    int MAX_QUEUE_SIZE = 10000;
    int data[] = new int [MAX_QUEUE_SIZE];
    private StringBuilder sb = new StringBuilder();

    private int isEmpty() {
        if(rear == front) {
            return 1;
        }
        return 0;
    }

    private boolean isFull() {
        if((rear + 1) % MAX_QUEUE_SIZE == front) {
            return true;
        }
        return false;
    }

    private void enqueue(int num) {
        if(isFull()) {
            return;
        }
        rear = (rear+1) % MAX_QUEUE_SIZE;
        data[rear] = num;
    }

    private int dequeue() {
        if(isEmpty() == 1) {
            return -1;
        }
        front = (front + 1) % MAX_QUEUE_SIZE;
        return data[front];
    }

    private int getFront() {
        if(isEmpty() == 1) {
            return -1;
        }
        return data[(front + 1) % MAX_QUEUE_SIZE];
    }

    private int getBack() {
        if(isEmpty() == 1) {
            return -1;
        }
        return data[rear];
    }

    private int getSize() {
        return rear-front;
    }
    private void setQueue() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=0; i<N; i++) {
            String command = scanner.next();
            switch (command) {
                case "push":
                    int num = scanner.nextInt();
                    enqueue(num);
                    break;
                case "pop":
                    sb.append(dequeue() + "\n");
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
        setQueue();
        System.out.println(sb);
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.run();
    }
}
