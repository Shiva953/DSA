package DSA.src.neutron.shiva;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {56,1,39,80,501};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //it uses quick sort under the hood
    }

    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its ALREADY SORTED it will NOT swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e); //left part of the array[till the pivot]
        sort(nums, s, hi); //right part of the array[after the pivot]
    }
}
