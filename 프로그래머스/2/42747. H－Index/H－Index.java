import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Integer[] sorted = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Comparator.reverseOrder());
        
        for(int i=0; i<sorted.length; i++) {
            if(sorted[i] >= i+1) answer++;
        }
        
        return answer;
    }
}