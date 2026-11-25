class Solution {

    public boolean isPowerOfTwo(int n) {
        return helper(n, 0);
    }

    static boolean helper(int n, int x) {
        if (n <= 0) {
            return false;
        }

        if (Math.pow(2, x) == n) {
            return true;
        }

        if (Math.pow(2, x) > n) {
            return false;
        }

        return helper(n, x + 1);
    }
}