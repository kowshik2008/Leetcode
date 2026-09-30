class Solution {
    public int countPartitions(int[] nums) {
       int s=0;
       int p=0;
       int c=0;
       for(int i=0;i<nums.length-1;i++){
        s+=nums[i];
        for(int j=i+1;j<nums.length;j++){
            p+=nums[j];
        }
        if((s-p)%2==0)
        c++;
        p=0;
       } 
       return c;
    }
}