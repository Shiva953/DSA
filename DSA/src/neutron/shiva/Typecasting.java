package DSA.src.neutron.shiva;

public class Typecasting {
    //Type Conversion
    public static void main(String[] args) {
        //EXPLICIT TYPE CASTING["NARROWING DOWN" the higher data type to lower data type]
        int num = (int)(314.721); 
        // in this case, we are converting a bigger type(float) -> smaller type(int)[EXPLICIT TYPE CASTING]
        System.out.println(num);

        //IMPLICIT/AUTOMATIC TYPE CASTING["WIDENING" the lower data type to higher data type]
        int i = 42; 
        double d = i;  // Implicitly cast int to double(done automatically by assigning the variable with higher data type)
        // in this case, we are converting a lower type(int) -> higher type(double)[IMPLICIT TYPE CASTING]
        System.out.println(d);

        //EX1
        int x = 257;
        byte b = (byte)(x); //making value that can be stored in byte is 256, since x>256 its automatically converted to 
        System.out.println(b);

        //EX2
        byte a = 50;
        byte p = 70;
        byte q = 20;
        int v = p * q / a ; //p*q = 1400, which goes beyond the range of byte. So java performs type conversion already and changes it to int
        System.out.println(v); 

        //EX3
        int numchar = 'S';
        System.out.println(numchar); //automatically converts CHAR to INT[ITS ASCII VALUE]

        //JAVA ALSO SUPPORTS UNICODE
        //EX 
        System.out.println("よジャバノスタルガよジャバノスタルガ");
    }
}
