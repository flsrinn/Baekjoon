import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<score.length; i++) {
            int s = score[i];
            if(pq.size() < k) pq.offer(s);
            else {
                if(pq.peek() < s) {
                    pq.poll();
                    pq.offer(s);
                }
            }
            
            answer.add(pq.peek());
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}