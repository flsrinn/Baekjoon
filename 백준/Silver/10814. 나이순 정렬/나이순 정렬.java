import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static class Info {
        int age;
        String name;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Info[] infos = new Info[N];
        for (int i=0; i<N; i++) {
            infos[i] = new Info();
            String info = br.readLine();
            String[] infoArray = info.split(" ");
            infos[i].age = Integer.parseInt(infoArray[0]);
            infos[i].name = infoArray[1];
        }

        Arrays.sort(infos, new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return o1.age - o2.age;
            }
        });


        for (Info info : infos) {
            bw.write(info.age + " " + info.name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
