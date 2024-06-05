import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int money = 1000 - m;
        int count = 0;
        while (money > 0) {
            if(money - 500 >= 0) {
                money -= 500;
            }
            else if(money - 100 >= 0) {
                money -= 100;
            }
            else if(money - 50 >= 0) {
                money -= 50;
            }
            else if(money - 10 >= 0) {
                money -= 10;
            }
            else if(money - 5 >= 0) {
                money -= 5;
            }
            else {
                money -= 1;
            }
            count++;
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
