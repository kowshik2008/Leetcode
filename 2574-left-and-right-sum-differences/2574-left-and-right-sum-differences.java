class Solution {
    public int[] leftRightDifference(int[] nums) {
      int[] arr1=new int[nums.length];
      arr1[0]=0;
      int[] arr2=new int[nums.length];
      arr2[nums.length-1]=0;
      for(int i=0;i<nums.length;i++){
        if(nums.length-1>i){
        arr1[i+1]=nums[i]+arr1[i];
        arr2[nums.length-2-i]=nums[nums.length-1-i]+arr2[nums.length-1-i];
      }
      }
      for(int j=0;j<nums.length;j++){
        nums[j]=Math.abs(arr1[j]-arr2[j]);
      
    }
    return nums;
    }
}