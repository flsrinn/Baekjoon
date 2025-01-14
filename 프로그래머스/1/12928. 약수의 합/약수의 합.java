class Solution {
    public int solution(int n) {
        int answer = n;
        
        for(int i=n-1; i>=1; i--) {
            if(n % i == 0) answer += i;
        }
        
        return answer;
    }
}