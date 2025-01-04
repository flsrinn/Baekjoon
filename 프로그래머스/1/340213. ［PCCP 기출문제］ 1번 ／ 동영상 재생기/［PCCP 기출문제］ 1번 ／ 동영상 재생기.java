class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] video_len_tokens = video_len.split(":");
        int video_len_sec = Integer.parseInt(video_len_tokens[0]) * 60 
            + Integer.parseInt(video_len_tokens[1]);
        
        String[] pos_tokens = pos.split(":");
        int pos_sec = Integer.parseInt(pos_tokens[0]) * 60 
            + Integer.parseInt(pos_tokens[1]);
        
        String[] op_start_tokens = op_start.split(":");
        int op_start_sec = Integer.parseInt(op_start_tokens[0]) * 60 
            + Integer.parseInt(op_start_tokens[1]);
        
        String[] op_end_tokens = op_end.split(":");
        int op_end_sec = Integer.parseInt(op_end_tokens[0]) * 60
            + Integer.parseInt(op_end_tokens[1]);
        
        if((op_start_sec <= pos_sec && pos_sec <= op_end_sec)) {
            pos_sec = op_end_sec;
        } 
        
        String answer = "";
        int answer_sec = pos_sec;
        StringBuilder sb = new StringBuilder();
        
        for (String command : commands) {
            if(command.equals("prev")) {
                if(answer_sec < 10) {
                    answer_sec = 0;
                } else {
                    answer_sec -= 10;
                }
            } else if(command.equals("next")) {
                if(answer_sec + 10 > video_len_sec) {
                    answer_sec = video_len_sec;
                } else {
                    answer_sec += 10;
                }
            }
            
            if((op_start_sec <= answer_sec && answer_sec <= op_end_sec)) {
                answer_sec = op_end_sec;
            } 
        }
        
        int answer_min = answer_sec / 60;
        answer_sec %= 60;
        
        // 최종 결과
        if(answer_min < 10) { // 한 자리 숫자일 경우
            sb.append("0");
        }
        sb.append(answer_min).append(":");
        if(answer_sec < 10) { // 한 자리 숫자일 경우
            sb.append("0");
        }
        sb.append(answer_sec);
        
        answer = sb.toString();
        return answer;
    }
}