import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0.0;
        double creditSum = 0.0;
        for(int i=0; i<20; i++) {
            String[] input = br.readLine().split(" ");
            double credit = Double.parseDouble(input[1]);
            String score = input[2];
            if(!score.equals("P")) creditSum += credit;

            switch(score) {
                case "A+":
                    sum += credit * 4.5;
                    break;
                case "A0":
                    sum += credit * 4;
                    break;
                case "B+":
                    sum += credit * 3.5;
                    break;
                case "B0":
                    sum += credit * 3;
                    break;
                case "C+":
                    sum += credit * 2.5;
                    break;
                case "C0":
                    sum += credit * 2;
                    break;
                case "D+":
                    sum += credit * 1.5;
                    break;
                case "D0":
                    sum += credit;
                    break;
            }
        }
        bw.write(String.format("%6f", sum / creditSum));

        bw.flush();
        bw.close();
        br.close();
    }
}
