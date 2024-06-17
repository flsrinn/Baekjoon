import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str;
        HashMap<String, Integer> hashMap = new HashMap<>();
        int total = 0; // 전체 나무 수

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);
            }
            else {
                hashMap.put(str, 1);
            }
            total++;
        }

        List<String> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list);

        for (String name : list) {
            double percentage = (double) hashMap.get(name) * 100 / total;
            sb.append(name).append(" ");
            sb.append(String.format("%.4f\n", percentage));
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
