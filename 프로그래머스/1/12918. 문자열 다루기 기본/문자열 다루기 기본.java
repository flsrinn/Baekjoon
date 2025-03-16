class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6) return false;
        answer = s.matches("[0-9]+");
        return answer;
    }
}