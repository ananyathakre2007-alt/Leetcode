class Solution {
    public int findPeakElement(int[] arr) {
         if(arr==null || arr.length==0){
            return -1;
        }        
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<end){
            mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
        
    }
}