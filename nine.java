public class nine {
    class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int j=0;
        int count=0;
        while (y!=0)
        {
            j=j*10 + y%10;
            count++;
            y/=10;
        }
        if(j==x && x > 0)
        {
            return true;
        }
        else
            return false;
    }
}
}
