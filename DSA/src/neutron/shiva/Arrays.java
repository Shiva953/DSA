package neutron.shiva;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //collection of data types
        // ALL ELEMENTS IN ARRAY SHOULD HAVE SAME DATA TYPE IN JAVA
        int fucbois[] = {43,234,324,1,4}; //type of data stored inside array should be int[DEFINING THE DATA TYPE OF THE ELEMENTS IN THE ARRAY]
        //fucbois(ref variable)[in stack] is pointing to this array object[ in heap memory ]

        int ros[] ; //ros ref variable is defined in the stack
        ros = new int[5]; //object is being created the HEAP
        ros[0] = 24;
        ros[1] = 124;
        ros[2] = 2;
        ros[3] = 532;
        ros[4] = 678669;
        String[] sws = new String[5]; //defualt value of each element is null
        //null is the default VALUE of a reference variable
        System.out.println(ros);
        System.out.println(sws[6]);
        System.out.println(fucbois);

        // 2D Array
        int[][] twodarr = new int[5][2]; //assign row size is neccessary beforehand, column size can vary
        int[][] exarr = {{2,5,9},{143,12,20},{3,3,8}};
        Scanner sc = new Scanner(System.in);
        // Taking 2D-Array as Input
        for(int row=0;row<twodarr.length;row++){
            for(int column=0; column<twodarr[row].length;column++){
                twodarr[row][column] = sc.nextInt();
            }
        }

        for(int row=0;row<twodarr.length;row++){
            for(int column=0; column<twodarr[row].length;column++){
                System.out.print(twodarr[row][column] + " ");;
            }
            System.out.println("");
        }

        //ArrayLists[When size need not be specified]
        ArrayList<Integer> list = new ArrayList<>(15); //we add wrapper class Integer instead of the primitive data type int 
        //even tho the initial capacity is 15, we can very well go beyond it in ArrayList
        list.add(8734);
        list.add(24);
        list.add(934);
        System.out.println(list);
        list.set(0, 9823); //changes element at a index
        list.remove(1); //element at 1st index is removed
        System.out.println(list);

        //input
        for(int k=0;k<3;k++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        //N-dimensional arrays
        ArrayList<ArrayList<Integer>> nlist = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            nlist.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nlist.get(i).add(sc.nextInt());
            }
        }
        System.out.println(nlist);

    }
    
}
