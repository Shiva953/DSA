// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

package DSA.Practice;

public class Leet5 {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
    private static int countNegatives(int[][] grid) {
        int c = 0,start,end;
        for(int i=0;i<grid.length;i++){
            start = 0;
            end = grid[i].length-1;
            if(end==1){
                if(grid[i][0]<0 && grid[i][1]<0){
                    c += 2;
                }
                else if(grid[i][0]<0 || grid[i][1]<0){
                    c += 1;
                }
                else{
                    c += 0;
                }
            }
            else{
                if(grid[i][end]>=0){
                    end += 1;
                }
                else{
                while(start<end){
                    int mid = start + (end-start)/2;
                    if(grid[i][mid]>=0){
                        start = mid + 1;
                    }
                    else if(grid[i][mid]<0){
                        end = mid;
                    }
                }
                }
            c += grid[i].length - end;
            }
        }
        return c;
    }
}
