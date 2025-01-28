import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=1; j<numbers.length && j != i; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}