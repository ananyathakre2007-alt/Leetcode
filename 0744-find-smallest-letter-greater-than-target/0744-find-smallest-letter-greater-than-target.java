class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int end=letters.length-1;
        int start=0;

        while(start<=end){
            int mid=(start+end)/2;

            
            if (letters[mid]>target){
               end=mid-1;
               
            }
            else{
                 start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}