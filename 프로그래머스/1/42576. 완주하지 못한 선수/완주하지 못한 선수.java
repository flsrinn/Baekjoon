import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        
        for(int i=0; i<participant.length; i++) {
            String name = participant[i];
            if(map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
            else {
                map.put(name, 1);
            }
        }
        
        for(int i=0; i<completion.length; i++) {
            String name = completion[i];
            if(map.containsKey(name)) {
                if(map.get(name) == 1) 
                    map.remove(name);
                else {
                    System.out.println(map.get(name));
                    map.put(name, map.get(name) - 1);
                    System.out.println(map.get(name));
                }
            }
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            answer = entry.getKey();
        }
        
        return answer;
    }
}