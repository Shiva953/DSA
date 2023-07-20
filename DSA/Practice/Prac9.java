package DSA.Practice;

public class Prac9 {
    public static void main(String[] args) {
        // pattern1(5);
        pattern1Alt(5, 0);
    }
    private static void pattern1(int n){
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
        System.out.print('*');
        }
        System.out.println();
        pattern1(n-1);
    }

    private static void pattern1Alt(int r,int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            pattern1Alt(r, c+1);
        } else {
            System.out.println();
            pattern1Alt(r-1, 0);
        }
    }
}
