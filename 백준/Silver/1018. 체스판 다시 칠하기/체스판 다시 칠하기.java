import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        String[] nums = num.split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);
        String[][] chess = new String[N][M];
        for (int i = 0; i < N; i++) {
            String chessLine = br.readLine();
            chess[i] = chessLine.split("");
        }

        int minChange = Integer.MAX_VALUE; 

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int changeCount = calculateChange(chess, i, j); 
                minChange = Math.min(minChange, changeCount); 
            }
        }

        bw.write(Integer.toString(minChange));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int calculateChange(String[][] chess, int startRow, int startCol) {
        int changeCount = 0;

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if ((i + j) % 2 == 0) { 
                    if (!chess[i][j].equals("W"))
                        changeCount++;
                } else { 
                    if (!chess[i][j].equals("B"))
                        changeCount++;
                }
            }
        }

        return Math.min(changeCount, 64 - changeCount);
    }
}
