class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        String s = Integer.toString(x);
        int half = s.length() / 2; 
        int start = 0;
        int end = s.length() - 1;
        boolean answer = true;

        for(int i = 0; i < half; i++){
            char left = s.charAt(start++);  
            char right = s.charAt(end--);   
            if(left != right){
                answer = false;
                break;
            }
        }

        return answer; 
    }
}