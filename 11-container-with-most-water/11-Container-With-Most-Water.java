class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1, maxArea=0;

        while(l<r){
            // 1. Calculate area using the shorter wall and current width
            int currentArea = Math.min(height[l],height[r])*(r-l);
            maxArea = Math.max(maxArea, currentArea);

            // 2. Move the pointer pointing to the shorter wall
            if(height[l] < height[r])
                l++;
            else
                r--;
        }  
        return maxArea;
    }
}