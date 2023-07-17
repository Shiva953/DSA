package DSA.src.neutron.shiva;

import java.util.Scanner;

public class Condl {
    public static void main(String[] args) {
        //fibonacci
        int a=0, b=1, i=3;
        int temp=0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //finding the nth fibonacci number
        while(i<=n){
            temp = b;
            b += a;
            a = temp;
            i++;
        }
        System.out.println("Nth fibonacci number : " + b);

        //number of occurences
        System.out.println("Enter the number.");
        int no = input.nextInt();
        System.out.println("Enter the digit whose occurences have to be found");
        int k = input.nextInt();
        int d, c=0, no_c = no;
        while(no>0){
            d = no%10;
            if(d==k){
                c+=1;
            }
            no/=10;
        }
        System.out.println("No of occurences of " +k+ "in" +no+ "is" +c);
        d = 0;
        int s = 0;
        //REVERSE A NUMBER(PURE NOSTALGIA)
        while(no_c>0){
            d = no_c%10;
            s = s*10 + d;
            no_c/=10;
        }
        System.out.println(s);
        input.close();
    }
}
