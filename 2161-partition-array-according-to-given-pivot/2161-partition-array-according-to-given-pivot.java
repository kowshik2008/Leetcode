class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr=new int[nums.length];
     int temp=0;
     int l=0;
     int r=nums.length-1;
    //  while(l<r){
    //     if(nums[l]<=pivot)
    //     l++;
    //     else if(nums[r]>pivot)
    //     r--;
    //     if(nums[l]>=pivot && nums[r]<=pivot){
    //         temp=nums[r];
    //         nums[r]=nums[l];
    //         nums[l]=temp;
    //     }
    //  }   
    // //  temp=nums[l-1];
    // //  nums[l-1]=pivot;
    //  return nums;
    int i=0;
    while(l<=r){
        if(pivot>nums[l]){
        arr[i]=nums[l];
        i++;
        }
        l++;
    }
    l=0;
        while(l<=r){
        if(pivot==nums[l]){
        arr[i]=nums[l];
        i++;
        }
        l++;
        }
        l=0;
        while(l<=r){
        if(pivot<nums[l]){
        arr[i]=nums[l];
        i++;
        }
        l++;
        }
    
    return arr;
    }
}