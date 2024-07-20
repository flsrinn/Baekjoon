import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int C = Integer.parseInt(s[2]);
        HashMap<String, Integer> normal = new HashMap<>();
        HashMap<String, Integer> special = new HashMap<>();
        HashSet<String> service = new HashSet<>();

        for (int i=0; i<A; i++) {
            String[] menu = br.readLine().split(" ");
            normal.put(menu[0], Integer.parseInt(menu[1]));
        }
        for (int i=0; i<B; i++) {
            String[] menu = br.readLine().split(" ");
            special.put(menu[0], Integer.parseInt(menu[1]));
        }
        for (int i=0; i<C; i++) {
            String menu = br.readLine();
            service.add(menu);
        }

        int N = Integer.parseInt(br.readLine());
        long aMoney = 0, bMoney = 0;
        int check = 0;
        for (int i=0; i<N; i++) {
            String order = br.readLine();
            if(normal.containsKey(order)) {
                aMoney += normal.get(order);
            }
            else if(special.containsKey(order)) {
                bMoney += special.get(order);
            }
            else if(service.contains(order))
                check++;
        }
        if((aMoney < 20000 && bMoney > 0) || (aMoney + bMoney < 50000 && check > 0) || check >= 2) sb.append("No");
        else sb.append("Okay");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
