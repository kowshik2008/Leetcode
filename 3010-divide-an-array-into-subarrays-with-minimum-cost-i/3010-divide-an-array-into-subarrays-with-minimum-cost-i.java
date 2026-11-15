class Solution {
    public int minimumCost(int[] nums) {
      int min=1000;
      int sum=0;
      for(int i=1;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            sum+=nums[0]+nums[i]+nums[j];
            if(sum<min)
            min=sum;
            sum=0;
        }
      }  
      return min;
    }
}