import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<terms.length; i++) {
            String[] t = terms[i].split(" ");
            map.put(t[0], Integer.parseInt(t[1]));
        }
        
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        
        for(int i=0; i<privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            for(int j=0; j<keys.size(); j++) {
                if(keys.get(j).equals(p[1])) {
                    if (isOver(today, p[0], map.get(keys.get(j))))
                        answer.add(i+1);
                    break;
                }
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isOver(String today, String privacy, int term) {
        String[] p = privacy.split("\\.");
        int year = Integer.parseInt(p[0]);
        int month = Integer.parseInt(p[1]);
        int day = Integer.parseInt(p[2]);
        
        month += term;
        while(month > 12) {
            year++;
            month -= 12;
        }
        
        String[] t = today.split("\\.");
        int y = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int d = Integer.parseInt(t[2]);
        
        if(y > year || (y == year && m > month) || (y == year && m == month && d >= day)) return true;
        
        return false;
    }
}