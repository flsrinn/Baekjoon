import java.util.*;
import java.math.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int person = 2; 
        int count = 1;
        HashSet<String> set = new HashSet<>();
        
        set.add(words[0]);
        char lastWord = words[0].charAt(words[0].length() - 1);
        boolean isOver = false;
        for(int i=1; i<words.length; i++) {
            String word = words[i];
            char firstWord = word.charAt(0);
            
            if(lastWord != firstWord) {
                isOver = true;
                break;    
            } else if(word.length() == 1) {
                isOver = true;
                break; 
            } else if(set.contains(word)) {
                isOver = true;
                break; 
            }
            
            if(person == n) {
                person = 1;
                count++;
            }
            else 
                person++;
            
            lastWord = word.charAt(word.length() - 1);
            set.add(word);
        }
        
        if(!isOver) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = person;
            answer[1] = count;
        }
        
        return answer;
    }
}