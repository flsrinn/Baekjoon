import java.io.*;
import java.util.*;

public class Main {
    private static HashMap<String, ArrayList<String>> map;

    private static boolean BFS(String a, String b) {
        if(a.equals(b)) return true;
        if(!map.containsKey(a)) return false;

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(a);
        visited.add(a);

        while(!queue.isEmpty()) {
            String current = queue.poll();
            if(map.containsKey(current)) {
                for(String s : map.get(current)) {
                    if(s.equals(b)) {
                        return true;
                    }
                    if(!visited.contains(s)) {
                        queue.add(s);
                        visited.add(s);
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            String A = s[0]; String B = s[1];
            if (!map.containsKey(A)) map.put(A, new ArrayList<>());
            map.get(A).add(B);
        }
        String[] s = br.readLine().split(" ");
        String A = s[0]; String B = s[1];

        if (BFS(A, B) || BFS(B, A)) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
        br.close();
    }
}
