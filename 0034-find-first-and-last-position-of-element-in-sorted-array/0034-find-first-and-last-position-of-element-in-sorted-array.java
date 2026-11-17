class Solution {
    public int[] searchRange(int[] nums, int target) {
       int firstocc = BinarySearch(nums,target,true);
       int lastocc = BinarySearch(nums,target,false);

       return new int[]{firstocc,lastocc};
    }

    static int BinarySearch(int[] nums,int target,boolean first){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                ans=mid;
                if(first){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
        }
        return ans;
    }


}