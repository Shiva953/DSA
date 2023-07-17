package DSA.src.neutron.shiva;

public class Linsearch {
    public static void main(String[] args) {
        //Linear Search
        int[] nums = {32,345,6754,21,23,35};
        int[][] tarr = {{1,2,3},{34,754,164},{43,4,9}};
        int[] rarr = twodlinearsearch(tarr, 164);
        System.out.println(max(tarr));
        System.out.println(linSearch(nums, 23));

    }

    static boolean linSearch(int[] arr,int target){
        int i;
        if(arr.length == 0){
            return false;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true; //returning index of the array
            }
        }
        return false; //element does not exist in array

        //Searching in 2-D arrays
    }
    static int[] twodlinearsearch(int[][] arr, int target){
        for(int row=0; row<arr.length;row++){
            for(int column=0; column< arr[row].length;column++){
                if(arr[row][column]== target){
                    return new int[]{row,column}; //returning 1D array containing the row,column of target
                }
            }
        }
        return new int[]{-1,-1};
    }
    //FINDING MAX VALUE IN 2-D ARRAY
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
