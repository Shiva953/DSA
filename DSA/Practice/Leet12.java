// https://leetcode.com/problems/flipping-an-image
package DSA.Practice;
public class Leet12 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        // int[][] bucket = new bucket[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n/2){
                swap(image[i],j,n-j-1);
                }
                image[i][j] ^= 1;
            }
        }
        return image;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
