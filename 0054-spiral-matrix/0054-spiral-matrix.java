class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int srow = 0;
        int scol = 0;
        int erow = m - 1;
        int ecol = n - 1;

        while (srow <= erow && scol <= ecol) {

            // 1. Left to right
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }
            srow++;

            // 2. Top to bottom
            for (int i = srow; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }
            ecol--;

            // 3. Right to left
            if (srow <= erow) {
                for (int j = ecol; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
                erow--;
            }

            // 4. Bottom to top
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    ans.add(matrix[i][scol]);
                }
                scol++;
            }
        }

        return ans;
    }
}