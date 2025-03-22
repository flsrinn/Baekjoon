class Solution {
    public String solution(String s) {
        String answer = "";
        String[] c = s.split("");
        
        int count = 0;
        for(int i=0; i<c.length; i++) {
            if(c[i].equals(" ")) {
                answer += " ";
                count = 0;
            }
            else {
                if(count % 2 == 0) 
                    answer += c[i].toUpperCase();
                else answer += c[i].toLowerCase();
                count++;
            }
        }
        
        return answer;
    }
}