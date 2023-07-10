package DSA.Practice;

public class Leet9 {
    int c = 0;
    public int numberOfSteps(int n) {
        if(n==0){
            return c;
        }
            c++;
            if(n%2==0){
                return numberOfSteps(n/2);
            }
            else{
                return numberOfSteps(n-1);
            }
    }
}
