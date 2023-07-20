package DSA.src.neutron.shiva;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {76,2,10,88};
        int[] sorted = mergesort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid)); //first half
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length)); //second half
        return merge(left,right); //merging 2 arrays
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        // its possible that some elements are remaining to be added in arr
        while(i<arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
