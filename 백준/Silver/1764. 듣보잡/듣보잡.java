import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] count = br.readLine().split(" ");
        int N = Integer.parseInt(count[0]);
        int M = Integer.parseInt(count[1]);
        HashMap<String, Integer> people = new HashMap<>();

        for (int i=0; i<N; i++) {
            String name = br.readLine();
            people.put(name, 1);
        }

        ArrayList<String> dPeople = new ArrayList<>();
        for (int i=0; i<M; i++) {
            String name = br.readLine();
            if(people.containsKey(name)) {
                dPeople.add(name);
            }
        }
        Collections.sort(dPeople);
        bw.write(dPeople.size() + "\n");
        for (int i=0; i<dPeople.size(); i++) {
            bw.write(dPeople.get(i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
