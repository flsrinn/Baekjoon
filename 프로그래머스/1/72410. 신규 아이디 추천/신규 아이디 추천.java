import java.util.ArrayList;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String[] new_id_list = new_id.split("");
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < new_id_list.length; i++) {
            // 알파벳 소문자, 숫자, '-', '_', '.' 만 허용
            if (!new_id_list[i].matches("[A-Za-z0-9-_.]")) {
                continue;
            }
            
            // 연속된 '.' 처리
            if (new_id_list[i].equals(".") && (!list.isEmpty() && list.get(list.size() - 1).equals("."))) {
                continue;
            }
            
            list.add(new_id_list[i].toLowerCase());
        }
        
        // 처음과 끝의 '.' 제거
        if (!list.isEmpty() && list.get(0).equals(".")) {
            list.remove(0);
        }
        if (!list.isEmpty() && list.get(list.size() - 1).equals(".")) {
            list.remove(list.size() - 1);
        }
        
        // 빈 문자열이면 "a" 추가
        if (list.isEmpty()) {
            list.add("a");
        }
        
        // 리스트를 문자열로 변환
        for (String s : list) {
            answer += s;
        }
        
        // 길이가 16자 이상이면 앞 15자만 남기기
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }

        // 끝이 '.'이면 제거
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        // 길이가 2 이하면 마지막 문자를 반복하여 길이 3으로 맞춤
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}
