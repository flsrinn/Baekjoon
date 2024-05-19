import java.io.*;
import java.util.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static HashSet<List<String>> girlGroups = new HashSet<>();

    private static void searchMemberName(String group) throws IOException {
        Iterator<List<String>> it = girlGroups.iterator();
        while (it.hasNext()) {
            List<String> list = it.next();
            if(list.contains(group)) {
                for (int i=0; i<list.size()-1; i++) {
                    bw.write(list.get(i) + "\n");
                }
            }
        }
    }

    private static void searchGroupName(String member) throws IOException {
        Iterator<List<String>> it = girlGroups.iterator();
        while (it.hasNext()){
            List<String> list = it.next();
            if(list.contains(member)) {
                bw.write(list.get(list.size()-1) + "\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String[] T = br.readLine().split(" ");
        int N = Integer.parseInt(T[0]);
        int M = Integer.parseInt(T[1]);
        for (int i=0; i<N; i++) {
            List<String> girlGroup = new ArrayList<>();
            String groupName = br.readLine();
            int people = Integer.parseInt(br.readLine());
            for (int j=0; j<people; j++) {
                girlGroup.add(br.readLine());
            }
            Collections.sort(girlGroup);
            girlGroup.add(groupName);
            girlGroups.add(girlGroup);
        }

        for (int i=0; i<M; i++) {
            String search = br.readLine();
            int quiz = Integer.parseInt(br.readLine());
            switch (quiz) {
                case 0:
                    searchMemberName(search);
                    break;
                case 1:
                    searchGroupName(search);
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
