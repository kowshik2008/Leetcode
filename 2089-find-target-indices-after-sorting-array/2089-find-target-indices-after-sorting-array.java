class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> li=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                c++;
                li.add(i);
            }
        }
        return li;
    }
}