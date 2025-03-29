import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Arrays.sort(spell);
        
        for(int i=0; i<dic.length; i++) {
            String[] d = dic[i].split("");
            Arrays.sort(d);
            
            if(isEqual(spell, d)) return 1;
        }
        
        return 2;
    }
    
    private boolean isEqual(String[] spell, String[] d) {
        if(spell.length != d.length) return false;
        
        for(int j=0; j<d.length; j++) {
            if(!d[j].equals(spell[j])) return false;
        }
        
        return true;
    }
}