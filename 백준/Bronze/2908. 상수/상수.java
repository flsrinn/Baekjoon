import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");
        StringBuffer str1 = new StringBuffer(nums[0]);
        StringBuffer str2 = new StringBuffer(nums[1]);

        int A = Integer.parseInt(str1.reverse().toString());
        int B = Integer.parseInt(str2.reverse().toString());
        if(A > B) bw.write(A+"");
        else bw.write(B+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
