public class eight {
    class Solution {
    public int myAtoi(String s) {
        int result=0;
        int sign = 1;
        int index =0;
         if (s == null || s.isEmpty()) {
            return 0;
        }
      
        while (index < s.length() && s.charAt(index) == ' ')
        {
            index ++;
        }

        if (index < s.length() && s.charAt(index) == '-')
        {
            sign = -1;
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';

            result = result*10 + digit;
            index++;
        }
        return result * sign;
}
}
