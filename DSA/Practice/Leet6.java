// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

package DSA.Practice;

public class Leet6 {
    int m, n;
    public int kthSmallest(int[][] matrix, int k) {
        m = matrix.length; n = matrix[0].length; // For general, the matrix need not be a square
        int start = matrix[0][0], end = matrix[m-1][n-1], ans = -1;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (countLessOrEqual(matrix, mid) >= k) {
                ans = mid;
                end = mid - 1; // try to looking for a smaller value in the start side
            } else start = mid + 1; // try to looking for a bigger value in the end side
        }
        return ans;
    }
    int countLessOrEqual(int[][] matrix, int x) {
        int cnt = 0, c = n - 1; // start with the endmost column
        for (int r = 0; r < m; ++r) {
            while (c >= 0 && matrix[r][c] > x)
            --c;  // decrease column until matrix[r][c] <= x
            cnt += (c + 1);
        }
        return cnt;
    }
}
