import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] init = br.readLine().split(" ");
            int C = Integer.parseInt(init[0]);
            int P = Integer.parseInt(init[1]);

            // 커피 정보 저장
            HashMap<String, int[]> coffeeMap = new HashMap<>();
            for (int j = 0; j < C; j++) {
                String[] coffee = br.readLine().split(" ");
                coffeeMap.put(coffee[0], new int[]{Integer.parseInt(coffee[1]), Integer.parseInt(coffee[2]), Integer.parseInt(coffee[3])});
            }

            String[] names = new String[P];
            int[] pays = new int[P];
            for (int j = 0; j < P; j++) {
                String[] order = br.readLine().split(" ");
                names[j] = order[0];

                int[] price = coffeeMap.get(order[2]); // 사려고 하는 커피의 각 사이즈별 가격표
                int pay = -1; // 최종 지불할 가격
                switch (order[1]) {
                    case "small":
                        pay = price[0];
                        break;
                    case "medium":
                        pay = price[1];
                        break;
                    case "large":
                        pay = price[2];
                        break;
                }
                pay += 100 / P; // 인원수 P 만큼 배달비 분담
                pays[j] = pay;
            }

            // 비용을 5의 배수로 반올림 또는 반내림
            for (int j = 0; j < P; j++) {
                pays[j] = roundToNearestFive(pays[j]);
                sb.append(names[j]).append(" ").append(pays[j]).append("\n");
            }
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    private static int roundToNearestFive(int num) {
        int remainder = num % 5;
        if (remainder == 1) { // 나머지가 1일 경우 반내림
            return num - 1;
        }
        else if (remainder == 4) { // 나머지가 4일 경우 반올림
            return num + 1;
        }
        return num;
    }
}
