package DSA.Practice;

public class Prac4 {
    public static void main(String[] args) {
        int n = 90904102;
        System.out.println(noOfZeros(n));
        System.out.println(noOfZerosAlt(n, 0));
    }
    static int c = 0;
    private static int noOfZeros(int n){
        if(n==0){
            return c;
        }
        if(n%10 == 0){
            c++;
        }
        return noOfZeros(n/10);
    }
    private static int noOfZerosAlt(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return noOfZerosAlt(n/10, count+1);
        }
        return noOfZerosAlt(n/10,count);
    }
}
