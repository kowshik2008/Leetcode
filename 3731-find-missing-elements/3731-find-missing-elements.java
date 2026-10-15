class Solution {
    public List<Integer> findMissingElements(int[] nums) {
     Arrays.sort(nums);
     ArrayList<Integer> li=new ArrayList<>();
     int o=0;
     for(int i=nums[0];i<=nums[nums.length-1];i++){
        li.add(i);
        for(int j=0;j<nums.length;j++){
            if(nums[j]==i){
            li.remove(o);
            o--;
            }
        }
        o++;
        }
      
     return li;
    }
}