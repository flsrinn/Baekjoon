import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int[] all = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Set<Integer> S = new HashSet<>();
        int index = 0;
        for (int i=0; i<M; i++) {
            String[] testCase = (br.readLine()).split(" ");
            String op = testCase[0];
            int num;
            try {
                num = Integer.parseInt(testCase[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                num = 0;
            }

            switch (op) {
                case "add":
                    if(!S.contains(num)) {
                        S.add(num);
                    }
                    break;
                case "remove":
                    if(S.contains(num)) {
                        S.remove(num);
                    }
                    break;
                case "check":
                    if (S.contains(num)) {
                        bw.write(1 + "\n");
                    }
                    else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "toggle":
                    if(!S.contains(num)) {
                        S.add(num);
                    }
                    else {
                        S.remove(num);
                    }
                    break;
                case "all":
                    S.clear();
                    for (int n : all) {
                        S.add(n);
                    }
                    break;
                case "empty":
                    S.clear();
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
