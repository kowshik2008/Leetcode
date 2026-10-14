class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
     int c=0;
     int sum=0;
     for(int i=0;i<nums.length;i++){
        c=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j])
            c++;
        }//c--;
        if(c%k==0)
        sum+=nums[i];
     }   
     return sum;
    }
}