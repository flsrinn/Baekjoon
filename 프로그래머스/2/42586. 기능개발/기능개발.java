import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Double> q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++) {
            double day = Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(day);
        }
        
        while(!q.isEmpty()) {
            int count = 1;
            double day = q.poll();
            while (!q.isEmpty() && (day > q.peek() || day == q.peek())) {
                count++;
                q.poll();
            }
            answer.add(count);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}