import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashSet<Integer> A = new HashSet<>();
        String[] aInput = br.readLine().split(" ");
        for (int i=0; i<n; i++) {
            A.add(Integer.parseInt(aInput[i]));
        }

        HashSet<Integer> B = new HashSet<>();
        String[] bInput = br.readLine().split(" ");
        for (int i=0; i<m; i++) {
            B.add(Integer.parseInt(bInput[i]));
        }

        int aCount = 0;
        Iterator<Integer> aIt = A.iterator();
        while (aIt.hasNext()) {
            int num = aIt.next();
            if(B.contains(num)) aCount++;
        }

        int bCount = 0;
        Iterator<Integer> bIt = B.iterator();
        while (bIt.hasNext()) {
            int num = bIt.next();
            if(A.contains(num)) bCount++;
        }
        bw.write((A.size() - aCount) + (B.size() - bCount) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
