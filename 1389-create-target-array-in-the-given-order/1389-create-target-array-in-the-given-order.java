
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];
        int size = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = size; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            target[index[i]] = nums[i];
            size++;
        }

        return target;
    }
}
