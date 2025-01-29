import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] s = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] a = new int [3];
        for(int i=0; i<answers.length; i++) {
            // 수포자 1이 문제를 맞혔을 경우
            if(s[0][i%5] == answers[i]) 
                a[0]++;
            
            // 수포자 2가 문제를 맞혔을 경우
            if(s[1][i%8] == answers[i])
                a[1]++;
            
            // 수포자 3이 문제를 맞혔을 경우
            if(s[2][i%10] == answers[i])
                a[2]++;
        }
        
        int max = 0;
        for(int i=0; i<a.length; i++) {
            if(max < a[i]) max = a[i];
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<a.length; i++) {
            if(max == a[i]) list.add(i+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}