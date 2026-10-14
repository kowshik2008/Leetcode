class Solution {
    public int maximizeSum(int[] nums, int k) {
       int m=0;
       int l=0;
       Arrays.sort(nums);
       for(int i=0;i<k;i++){
        l+=nums[nums.length-1];
        m=nums[nums.length-1]+1;
        nums[nums.length-1]=m;
       } 
       return l;
    }
}