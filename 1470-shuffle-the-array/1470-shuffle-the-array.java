class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newarr = new int[nums.length];
        for(int i=0,j=0;i<n;i++){
            newarr[i+j]=nums[i];
            j=j+1;
            newarr[i+j]=nums[i+n];
        }
        return newarr;

        
    }
}