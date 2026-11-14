class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> hs=new HashSet<>();
    //    int c=0;
    //    Arrays.sort(nums1);
    //    List<Integer> l=new ArrayList<>();
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                hs.add(nums1[i]);
            }
        }
       }
        int[] arr=new int[hs.size()];
        int j=0;
        for(int i:hs){
            arr[j]=i;
            j++;
        }
       
       return arr;
    }
}