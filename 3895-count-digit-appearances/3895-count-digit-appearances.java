class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
      int c=0;
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<String.valueOf(nums[i]).length();j++){
        if(String.valueOf(String.valueOf(nums[i]).charAt(j)).contains(String.valueOf(digit)))
        c++;
        }
      }  
      return c;
    }
}