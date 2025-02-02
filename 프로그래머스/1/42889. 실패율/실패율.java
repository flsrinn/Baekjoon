import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        double[] rates = new double[N];
        
        for(int i=1; i<=N; i++) {
            double person = 0;
            double failure = 0;
            
            for(int j=0; j<stages.length; j++) {
                if(stages[j] >= i) person++;
                if(stages[j] == i) failure++;
            }
            
            double rate;
            if(person == 0) rate = 0.0;
            else rate = failure / person;
            
            rates[i-1] = rate;
        }
        
        Double[] sorted = Arrays.stream(rates).boxed().toArray(Double[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(sorted[i] == rates[j]) {
                    answer[i] = j + 1;
                    rates[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}