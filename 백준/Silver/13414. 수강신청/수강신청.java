import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");
        int K = Integer.parseInt(list[0]);
        int L = Integer.parseInt(list[1]);

        LinkedHashSet<String> ids = new LinkedHashSet<>();
        for (int i=0; i<L; i++) {
            String id = br.readLine();
            if(ids.contains(id)) {
                ids.remove(id);
            }
            ids.add(id);
        }

        Iterator<String> it = ids.iterator();
        int count = 0;
        while(it.hasNext() && count != K) {
            bw.write(it.next() + "\n");
            count++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
