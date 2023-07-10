package DSA.Practice;

public class Leet10 {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        else if(n<1){
            return false;
        }
        else if(n%3==0){
            return isPowerOfThree(n/3);
        }
        return false;
    }
}
