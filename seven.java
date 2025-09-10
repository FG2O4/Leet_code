public class seven {
   
    public int reverse(int x) {
        int y=0;
        while (x != 0)
        {
            int c = x%10;
            x/=10;
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && c > 7)) {
                return 0;
            }
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && c < -8)) {
                return 0;
            }
            
               y=y*10+c;
                        
            
        }
        return y;
    }

}
