import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        // 책 제목을 입력 받고 hashmap에 저장
        // hashmap : 책 제목, 책 팔린 횟수 로 저장
        for (int i=0; i<N; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) map.put(name, map.get(name) + 1);
            else map.put(name, 1);
        }

        Set<String> set = map.keySet();
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        for (String s : set) {
            int count = map.get(s);
            // 더 많이 팔린 책이 있을 경우
            if(count > max) {
                max = count;
                list.removeAll(list); // 기존 arraylist를 비움
                list.add(s);
            }
            // 가장 많이 팔린 책이 여러 개일 경우
            else if(count == max) list.add(s);
        }
        
        Collections.sort(list); // 가장 많이 팔린 책의 제목을 알파벳순으로 정렬 
        sb.append(list.get(0)); // 제일 앞에 있는 책 이름 출력 
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
