class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] arp=new int[nums.length/2]; 
       int[] arn=new int[nums.length/2]; 
       int c=0;
       int p=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
        arp[c]=nums[i];
        c++;
        }
        else{
            arn[p]=nums[i];
            p++;
        }
       }
       for(int i=0;i<nums.length;i++){
        if(i%2==0)
        nums[i]=arp[nums.length/2-c--];
        else
        nums[i]=arn[nums.length/2-p--];
       }
       return nums;
    }
}