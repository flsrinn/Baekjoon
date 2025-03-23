import java.util.Stack;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        while(n > 0) {
            stack.push(n % k);
            n /= k;
        }
        
        String s = "";
        while(!stack.isEmpty()) {
            int num = stack.pop();
            if(num != 0) 
                s += Integer.toString(num);
            else {
                if(!s.equals("") && isPrime(Long.parseLong(s))) answer++;
                s = "";
            }
        }
        
        if(!s.equals("") && isPrime(Long.parseLong(s))) answer++;
        
        return answer;
    }
    
    private boolean isPrime(long n) {
        if(n <= 1) return false;
        double k = Math.sqrt(n);
        for(double i=2; i<=k; i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}