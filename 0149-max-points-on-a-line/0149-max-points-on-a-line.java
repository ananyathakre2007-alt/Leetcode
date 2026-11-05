        class Solution {
    public int maxPoints(int[][] points) {

        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int max = 0;

        for (int i = 0; i < n; i++) {

            int same = 1;
            int duplicate = 0;

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    duplicate++;
                    continue;
                }

                int count = 1;

                for (int k = j + 1; k < n; k++) {

                    long dx2 = (long) points[k][0] - points[i][0];
                    long dy2 = (long) points[k][1] - points[i][1];

                    if ((long) dy * dx2 == (long) dy2 * dx) {
                        count++;
                    }
                }

                max = Math.max(max, count + duplicate + 1);
            }
        }

        return max;
    }
}
    