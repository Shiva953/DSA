package DSA.Practice;
import java.util.Arrays;

public class Prac10 {
    public static void main(String[] args) {
        int[] arr = {3,2,-10,35,98};
        int r = arr.length-1;
        selectionSort(arr, r, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int r, int index){
        if (r == 0) {
            return;
        }
        if (index < r) {
            if(arr[index] > arr[index+1]){
                swap(arr,index,index+1);
            }
            bubbleSort(arr, r, index+1);
        } else {
            bubbleSort(arr, r-1, 0);
        }
    }

    private static void selectionSort(int[] arr, int r, int c, int max){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c+1, c);
            } else {
                selectionSort(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
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
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
