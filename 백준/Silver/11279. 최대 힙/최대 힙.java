import java.io.*;

public class Main {
    private static int[] heap = new int[100000];
    private static int heapSize = 0;

    private static void insertMaxHeap(int num) {
        heap[++heapSize] = num;
        for (int i=heapSize; i>1; i/=2) {
            if(heap[i/2] <= heap[i]) {
                int tmp = heap[i/2];
                heap[i/2] = heap[i];
                heap[i] = tmp;
            }
            else break;
        }
    }

    private static int deleteMaxHeap() {
        int item = heap[1];
        heap[1] = heap[heapSize];
        heap[heapSize--] = 0;

        for (int i=1; i*2<=heapSize;) {
            int left = i*2;
            int right = i*2 + 1;
            int larger = left;

            if(right <= heapSize && heap[right] > heap[left]) {
                larger = right;
            }

            if (heap[i] >= heap[larger]) break;

            int tmp = heap[i];
            heap[i] = heap[larger];
            heap[larger] = tmp;
            i = larger;
        }
        return item;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            if(num == 0) {
                if(heapSize == 0) {
                    bw.write("0\n");
                }
                else {
                    bw.write(deleteMaxHeap() + "\n");
                }
            }
            else {
                insertMaxHeap(num);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
