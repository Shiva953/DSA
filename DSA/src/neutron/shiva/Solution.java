package neutron.shiva;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] x = {1,7,5};
        int[] y = {2,3,5};
        System.out.println(minAbsoluteSumDiff(x,y));
    }

    private static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int s0 = absoluteSumDiff(nums1, nums2);
        int[] diffArray = new int[n];

        for (int i = 0; i < n; i++) {
            diffArray[i] = Math.abs(nums1[i] - nums2[i]);
        }

        Arrays.sort(nums1);

        int maxReduction = 0;
        for (int i = 0; i < n; i++) {
            int target = nums2[i];
            int closestValue = binarySearchClosest(nums1, target);
            int diff = Math.abs(target - closestValue);
            maxReduction = Math.max(maxReduction, diff - diffArray[i]);
        }

        int s1 = (s0 - maxReduction + 1000000007) % 1000000007;

        return s1;
    }

    private static int absoluteSumDiff(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += Math.abs(arr1[i] - arr2[i]);
        }
        return s;
    }

    private static int binarySearchClosest(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Check the closest value from left and left-1
        if (left > 0 && Math.abs(nums[left] - target) > Math.abs(nums[left - 1] - target)) {
            left--;
        }

        return nums[left];
    }
}

