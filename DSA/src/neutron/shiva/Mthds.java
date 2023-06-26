package neutron.shiva;

import java.util.Arrays;

public class Mthds {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Shiva";
        changeName(name);
        System.out.println(name);
    }

    static void change(int[] nums) {
        //CHANGING THE OBJECT AND MODYFING IT, now nums and arr(of the main method) point to the same object(modified)
        nums[0] = 99; // if you make a change to the object via this ref variable, SAME object will be changed
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // CREATING A NEW OBJECT[NOT MODIFYING THE ORIGINAL ONE TO WHICH name was pointing to], and CHANGING THE REFERENCE OF THIS VARIABLE TO THIS NEW OBJECT
    }
    
}
