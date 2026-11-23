
class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int current = 0;
            int next = 0;

            if(c == 'I') current = 1;
            else if(c == 'V') current = 5;
            else if(c == 'X') current = 10;
            else if(c == 'L') current = 50;
            else if(c == 'C') current = 100;
            else if(c == 'D') current = 500;
            else if(c == 'M') current = 1000;

            if(i + 1 < s.length()) {
                char n = s.charAt(i + 1);
                if(n == 'I') next = 1;
                else if(n == 'V') next = 5;
                else if(n == 'X') next = 10;
                else if(n == 'L') next = 50;
                else if(n == 'C') next = 100;
                else if(n == 'D') next = 500;
                else if(n == 'M') next = 1000;
            }

            if(current < next) {
                sum -= current;
            } else {
                sum += current;
            }
        }
        return sum;
    }
}
