public class eleven {
    class Solution {
    public int maxArea(int[] height) {
    int i = 0;
    int j = height.length - 1;
    int maxVolume = 0;
    
    while (i < j) {
        int currentVolume = Math.min(height[i], height[j]) * (j - i);
        maxVolume = Math.max(maxVolume, currentVolume);
        
        if (height[i] < height[j]) {
            i++;
        } else {
            j--;
        }
    }
    
    return maxVolume;
    }
}
}
