//pow(x,n)[EFFICIENT SOLUTION]

package DSA.Practice;

public class Leet14 {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        // if(n<0){
        //     return (1/x) * myPow(x,n+1);
        // }
        // return x * myPow(x,n-1);
        double temp = myPow(x,n/2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            if (n > 0) {
                return x * temp * temp;
            } else {
                return (1 / x) * temp * temp;
            }
        }
    } //efficient solution(halves n each time, hence for very large n values the stack doesn't overflow)
}
