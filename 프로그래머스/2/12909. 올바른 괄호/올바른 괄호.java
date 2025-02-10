import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char p : s.toCharArray()) {
            if(p == '(') stack.push(p);
            else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()) return false;
        
        return true;
    }
}