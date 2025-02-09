import java.awt.Point;
import java.util.HashSet;

class Solution {
    public int solution(String dirs) {
        HashSet<String> set = new HashSet<>();
        String[] ds = dirs.split("");
        int x = 0;
        int y = 0;
        
        for(String d : ds) {
            int pX = x;
            int pY = y;
            
            switch(d) {
                case "U":
                    if(y+1 <= 5) {
                        pY++;
                    }
                    break;
                case "D":
                    if(y-1 >= -5) {
                        pY--;
                    }
                    break;
                case "R":
                    if(x+1 <= 5) {
                        pX++;
                    }
                    break;
                case "L":
                    if(x-1 >= -5) {
                        pX--;
                    }
                    break;
            }
            
            if(pX != x || pY != y) {
                String way1 = x + " " + y + " " + pX + " " + pY;
                String way2 = pX + " " + pY + " " + x + " " + y;

                set.add(way1);
                set.add(way2);

                x = pX;
                y = pY;
            }
        }
        
        return set.size() / 2;
    }
    
}