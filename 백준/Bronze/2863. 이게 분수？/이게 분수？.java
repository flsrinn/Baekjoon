import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double[] array = new double[4];
        String[] s1 = br.readLine().split(" ");
        double a = Double.parseDouble(s1[0]);
        double b = Double.parseDouble(s1[1]);

        String[] s2 = br.readLine().split(" ");
        double c = Double.parseDouble(s2[0]);
        double d = Double.parseDouble(s2[1]);

        array[0] = (a/c) + (b/d);
        array[1] = (c/d) + (a/b);
        array[2] = (d/b) + (c/a);
        array[3] = (b/a) + (d/c);

        double max = 0;
        int n = 0;

        for(int i = 0; i < 4; i++) {
            if(max < array[i]) {
                max = array[i];
                n = i;
            }
        }

        bw.write(n+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
