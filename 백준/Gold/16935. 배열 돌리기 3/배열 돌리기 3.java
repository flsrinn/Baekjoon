import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int count = Integer.parseInt(input[2]);

        int[][] array = new int[N][M];
        for (int i=0; i<N; i++) {
            String[] num = br.readLine().split(" ");
            for (int j=0; j<M; j++) {
                array[i][j] = Integer.parseInt(num[j]);
            }
        }

        String[] Rs = br.readLine().split(" ");
        int[][] tmpArray;
        for (int i=0; i<count; i++) {
            int R = Integer.parseInt(Rs[i]);
            switch (R) {
                case 1: // 상하 반전
                    tmpArray = new int[N][M];
                    for (int j=0; j<N; j++) {
                        for (int k=0; k<M; k++) {
                            tmpArray[N - j - 1][k] = array[j][k];
                        }
                    }
                    array = tmpArray;
                    break;
                case 2: // 좌우 반전
                    tmpArray = new int[N][M];
                    for (int j=0; j<N; j++) {
                        for (int k=0; k<M; k++) {
                            tmpArray[j][M - k - 1] = array[j][k];
                        }
                    }
                    array = tmpArray;
                    break;
                case 3: // 오른쪽으로 90도 회전
                    tmpArray = new int[M][N];
                    for (int j = 0; j < N; j++) {
                        for (int k = 0; k < M; k++) {
                            tmpArray[k][N - j - 1] = array[j][k];
                        }
                    }
                    int temp = N;
                    N = M;
                    M = temp;
                    array = tmpArray;
                    break;
                case 4: // 왼쪽으로 90도 회전
                    tmpArray = new int[M][N];
                    for (int j = 0; j < N; j++) {
                        for (int k = 0; k < M; k++) {
                            tmpArray[M - k - 1][j] = array[j][k];
                        }
                    }
                    temp = N;
                    N = M;
                    M = temp;
                    array = tmpArray;
                    break;
                case 5: // 1->2, 2->3, 3->4, 4->1
                    tmpArray = new int[N][M];
                    for (int j=0; j<N; j++) {
                        for (int k=0; k<M; k++) {
                            if (j < N / 2 && k < M / 2) {
                                tmpArray[j][k + M/2] = array[j][k];
                            } else if (j >= N / 2 && k < M / 2) {
                                tmpArray[j - N/2][k] = array[j][k];
                            } else if (j < N / 2 && k >= M / 2) {
                                tmpArray[j + N/2][k] = array[j][k];
                            } else if (j >= N / 2 && k >= M / 2) {
                                tmpArray[j][k - M/2] = array[j][k];
                            }
                        }
                    }
                    array = tmpArray;
                    break;
                case 6: // 1->4, 4->3, 3->2, 2->1
                    tmpArray = new int[N][M];
                    for (int j=0; j<N; j++) {
                        for (int k=0; k<M; k++) {
                            if (j < N / 2 && k < M / 2) {
                                tmpArray[j + N/2][k] = array[j][k];
                            } else if (j >= N / 2 && k < M / 2) {
                                tmpArray[j][k + M/2] = array[j][k];
                            } else if (j < N / 2 && k >= M / 2) {
                                tmpArray[j][k - M/2] = array[j][k];
                            } else if (j >= N / 2 && k >= M / 2) {
                                tmpArray[j - N/2][k] = array[j][k];
                            }
                        }
                    }
                    array = tmpArray;
                    break;
            }

        }

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
