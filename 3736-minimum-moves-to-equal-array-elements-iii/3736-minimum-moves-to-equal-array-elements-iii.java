class Solution {
    public int minMoves(int[] nums) {
      Arrays.sort(nums);
      int r=nums[nums.length-1];
      int p=0;
      int v=0;
      for(int i=0;i<nums.length;i++){
        p=r-nums[i];
        if(p>0)
        v+=p;
      }  
      return v;
    }
}