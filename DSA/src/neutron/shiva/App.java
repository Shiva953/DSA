package neutron.shiva; //package -  the folder inside src[assuming the typical java project directory structure] where your java file lies
// neutron.shiva === going inside the shiva package of the root package neutron
// . -> subfolder(subpackage)

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hehe boii");
        //System - default class included in the java.lang package on which the out method is called
        // It provides access to various system resources, such as standard input, standard output, 
        // error output, and the current time. 
        // It contains several static methods and fields that can be used to interact with the system environment.
        // out is a STATIC field of the System class, System.out is an object referencing the Printstream class
        // System.out.println finally calls the println method of the prinstream class object (System.out) which logs the string to the console
        Scanner sci = new Scanner(System.in); //input object of the Scanner class("Standard" Input stream)
        int x = sci.nextInt();
        System.out.println(x);

        //DATA TYPES - 
        //PRIMITIVE and REFERENCE DATA Types
        // Primitive Data Type CANNOT be broken into other Data Types
        //String is NOT Primitive[it can be broken into char or int]

        //REFERENCE DATA TYPES[String,Class,interface,enum]
        String st = sci.next();
        System.out.println(st);
        //SOME PRIMITVE DATA TYPES
        float y = 254.25f; //y is ann identifier, 254.25f is a Literal
        double lg = 355255426.43;
        long li = 463786397463646334L;
        boolean check = true;
        float z = sci.nextFloat();
        System.out.println(y+z);

    }
}
