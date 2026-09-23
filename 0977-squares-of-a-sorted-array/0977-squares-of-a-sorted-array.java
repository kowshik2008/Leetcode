class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            nums[i]=nums[i]*nums[i];
        }     
        int []arr=Arrays.stream(nums).sorted().toArray();
        return(arr); 
    }
}