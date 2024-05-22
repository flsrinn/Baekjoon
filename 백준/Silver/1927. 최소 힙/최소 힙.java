import java.io.*;

public class Main {
    private static int[] heap = new int[100000];
    private static int heapSize = 0;

    private static void insertMinHeap(int num) {
        heap[++heapSize] = num;
        for (int i=heapSize; i>=1; i/=2) {
            if(heap[i/2] >= heap[i]) {
                int tmp = heap[i/2];
                heap[i/2] = heap[i];
                heap[i] = tmp;
            }
            else break;
        }
    }

    private static int deleteMinHeap() {
        if(heapSize == 0)
            return 0;
        int item = heap[1];
        heap[1] = heap[heapSize];
        heap[heapSize--] = 0;

        for (int i=1; i*2<=heapSize;) {
            int left = i*2;
            int right = i*2 + 1;
            int smaller = left;

            if(right <= heapSize && heap[right] < heap[left]) {
                smaller = right;
            }

            if (heap[i] <= heap[smaller]) break;

            int tmp = heap[i];
            heap[i] = heap[smaller];
            heap[smaller] = tmp;
            i = smaller;
        }
        return item;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                bw.write(deleteMinHeap() + "\n");
            }
            else {
                insertMinHeap(num);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
