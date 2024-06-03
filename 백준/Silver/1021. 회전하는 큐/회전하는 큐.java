import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String[] nums = br.readLine().split(" ");

        // 덱 생성, 삽입
        Deque<Integer> deque = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            deque.addLast(i);
        }

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            while (true) {
                int index = 0;

                // 목표값의 인덱스 구하기 
                for (int num : deque) {
                    if(num == Integer.parseInt(nums[i])) break;
                    index++;
                }

                // 목표값이 덱의 중간값보다 뒤에 있을 경우
                if(index > deque.size()/2) {
                    while(deque.peekFirst() != Integer.parseInt(nums[i])) {
                        int n = deque.pollLast();
                        deque.addFirst(n);
                        count++;
                    }
                }

                // 목표값이 덱의 중간값보다 잎에 있을 경우
                else {
                    while(deque.peekFirst() != Integer.parseInt(nums[i])) {
                        int n = deque.pollFirst();
                        deque.addLast(n);
                        count++;
                    }
                }
                break;
            }
            deque.pollFirst();
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
