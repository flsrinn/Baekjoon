import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = scanner.nextInt();
        int[] array = new int [N];
        for (int i=0; i<N; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        // 산술 평균
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        sb.append(Math.round((double)sum / array.length) + "\n");

        // 중앙값
        sb.append(array[(array.length)/2] + "\n");

        // 최빈값
        int maxCount = 1, count = 1, mode;
        Vector<Integer> modes = new Vector<>();
        for(int i=0; i<array.length-1; i++) {
            if(array[i] == array[i+1]) {
                count++;
            }
            else {
                count = 1;
            }
            if(maxCount < count) {
                maxCount = count;
                modes.clear();
                modes.add(array[i]);
            }
            // 최빈값이 여러개일 경우
            else if(maxCount == count) {
                modes.add(array[i]);
            }
        }
        if(modes.size() >= 2) {
            mode = modes.get(1);
        }
        else if(modes.size() == 1){
            mode = modes.get(0);
        }
        else if(array.length > 1) {
            mode = array[1];
        }
        else {
            mode = array[0];
        }
        sb.append(mode + "\n");

        // 범위
        int range = array[array.length - 1] - array[0];
        sb.append(range + "\n");

        System.out.println(sb);
        scanner.close();
    }
}
