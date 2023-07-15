package DSA.Practice;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println(findNMagic(1000));
    }
    private static int findNMagic(int n){
        int s = 0;
        int i=0;
        while(n!=0){
            i+=1;
            s += (n&1) * (int)Math.pow(5, i);
            n = n >> 1;
        }
        return s;
    }
}
