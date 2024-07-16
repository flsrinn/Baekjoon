class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        int max = Integer.parseInt(nums[0]), min = Integer.parseInt(nums[0]);
        
        for(int i=0; i<nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if(max < num) max = num;
            if(min > num) min = num;
        }
        
        answer = min + " " + max;
        return answer;
    }
}