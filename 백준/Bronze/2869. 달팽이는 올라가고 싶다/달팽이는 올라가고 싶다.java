import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        String[] num = nums.split(" ");
        int A = Integer.parseInt(num[0]);
        int B = Integer.parseInt(num[1]);
        int V = Integer.parseInt(num[2]);

        int days = (int)Math.ceil((V-B)/(A-B));
        if((V-B)%(A-B) != 0)
            days++;
        bw.write(days + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

}
