class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        while(i<j){
         int min=Math.min(heights[i],heights[j]);
         int width=j-i;
          if(heights[i]<heights[j])i+=1;
          else j-=1;
          max=Math.max(max,min*width);
        }
        return max;
    }
}
