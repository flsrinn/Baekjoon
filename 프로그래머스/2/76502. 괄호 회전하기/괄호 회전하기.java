import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if(isValid(rotated)) answer++;
        }
        
        return answer;
    }
    
    private boolean isValid(String rotated) {
        Stack<Character> stack = new Stack<>();
        
        char[] cArray = rotated.toCharArray();
        for(char c : cArray) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
            
                char top = stack.pop();
                if(c == ')' && top != '(') {
                    return false;
                } else if(c == '}' && top != '{') {
                    return false;
                } else if(c == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}