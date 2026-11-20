class Solution {
    public int[] concatWithReverse(int[] nums) {
       int[] arr=new int[2*nums.length];
       for(int i=0;i<arr.length;i++){
        if(nums.length-1>=i)
        arr[i]=nums[i];
        else
        arr[i]=nums[(2*nums.length-1)-i];
       } 
       return arr;
    }
}