import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String[]> list = new ArrayList<>();
        HashMap<String, String> users = new HashMap<>();
        String[] answer = {};
        int count = 0;
        
        for(int i=0; i<record.length; i++) {
            String[] r = record[i].split(" ");
            String action = r[0];
            String id = r[1];

            if(action.equals("Enter")) {
                users.put(id, r[2]);
                count++;
            } else if(action.equals("Change")) {
                users.put(id, r[2]);
            } else {
                count++;
            }

            String[] s = {action, id};
            list.add(s);
        }
        
        answer = new String[count];
        count = 0;
        for (int i=0; i<list.size(); i++) {
            String[] msg = list.get(i);
            String action = msg[0];
            String id = msg[1];
            String name = users.get(id);
            
            if(action.equals("Enter")) {
                answer[count] = name + "님이 들어왔습니다.";
                count++;
            } else if(action.equals("Leave")) {
                answer[count] = name + "님이 나갔습니다.";
                count++;
            }
        }
        
        return answer;
    }
    
}