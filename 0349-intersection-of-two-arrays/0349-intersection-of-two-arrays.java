class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int size;
        if(m>n){
            size=n;
        }else{size=m;}

        int[] result = new int[size];
        int point=0;

        if(m>n){
            for(int i=0;i<n;i++){
                if(binary(nums1,nums2[i])){
                    if (i == 0 || nums2[i] != nums2[i - 1]) {
                        result[point] = nums2[i];
                        point++;
                    }
                }
            }
        }
        else{
            for(int i=0;i<m;i++){
                if(binary(nums2,nums1[i])){
                     if (i == 0 || nums1[i] != nums1[i - 1]) {
                        result[point] = nums1[i];
                        point++;
                       
                    }
                }
            }    
        }
        return Arrays.copyOf(result, point);
    }

    

    static boolean binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }

}