package neutron.shiva;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,4,9,2,-1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap = false;
            for(int j=1;j<arr.length - i;j++){
                if(arr[j]<arr[j-1]){ // swap if the next element[for a particular i] is less than the previous
                    swap = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            // if NO SWAP occur for a particular i, it means the array is already sorted and hence NOW LOOP NEEDS to be breaked
            if(swap==false){
                break;
            }
        }
    }
}
