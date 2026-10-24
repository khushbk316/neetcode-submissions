class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maximumArea = 0;
        while(left<right)
        {
            int width = right-left;
            int length = Math.min(heights[left],heights[right]);
            int area = width*length;
            maximumArea = Math.max(area,maximumArea);

            if(heights[left]<heights[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maximumArea;
    }
}
