class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

         Arrays.sort(nums);
         List<List<Integer>> list = new ArrayList<>();


        int a=0;
        while(a<nums.length-3){
            int b= a+1;
            while(b<nums.length-2){
                int c=b+1;
                int d=nums.length-1;
                while(c<d){
                    long sum=(long)nums[a]+nums[b]+nums[c]+nums[d];

                    if(sum==target){
                        
                     ArrayList<Integer> row = new ArrayList<>( Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                     if(list.contains(row)){
                        //duplicate;
                     }else{
                        list.add(row);
                    }
                    c++;
                    d--;
                    }
                    if(sum>target){
                        d--;
                    }
                    if(sum<target){
                        c++;
                    }                
                }
                b++;
            }
            a++;
       }
       return list;
    }
}
        