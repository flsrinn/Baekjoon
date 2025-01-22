class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wMax, wMin, bMax, bMin;
        if(wallet[0] > wallet[1]) {
            wMax = wallet[0];
            wMin = wallet[1];
        }
        else {
            wMax = wallet[1];
            wMin = wallet[0];
        }
        
        if(bill[0] > bill[1]) {
            bMax = bill[0];
            bMin = bill[1];
        }
        else {
            bMax = bill[1];
            bMin = bill[0];
        }
        
        while(bMax > wMax || bMin > wMin) {
            bMax /= 2;
            answer++;
            
            if(bMax < bMin) {
                int tmp = bMax;
                bMax = bMin;
                bMin = tmp;
            }
        }
        return answer;
    }
}