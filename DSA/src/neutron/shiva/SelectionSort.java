package neutron.shiva;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arro = {75,2,9,20,-1};
        selection(arro);
        System.out.println(Arrays.toString(arro));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int indexOfMaxElement = getMaxIndex(arr, 0, last);
            swap(arr, indexOfMaxElement, last);
        }
    }

    private static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
