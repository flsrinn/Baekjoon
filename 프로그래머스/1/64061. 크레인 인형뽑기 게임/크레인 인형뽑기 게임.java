import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int i=0; i<moves.length; i++) {
            int idx = moves[i]-1;
            
            for(int j=0; j<board.length; j++) {
                int num = board[j][idx];
                board[j][idx] = 0;
                if(num != 0) {
                    if(!stack.isEmpty() && stack.peek() == num) {
                        stack.pop();
                        answer+=2;
                    } else {
                        stack.push(num);
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}