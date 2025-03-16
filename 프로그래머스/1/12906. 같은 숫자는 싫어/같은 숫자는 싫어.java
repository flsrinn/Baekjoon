import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            if(!stack.isEmpty() && stack.peek() != num) stack.add(num); 
            else if(stack.isEmpty()) stack.add(num);
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}