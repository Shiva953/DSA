package DSA.src.neutron.shiva;

import java.util.Stack;


public class Stacks {
    public static void main(String[] args) {
        //STACK
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(25);
        stack.push(24);
        System.out.println(stack.pop()); //returns the last element of the stack(Integer)
        System.out.println(stack);
        System.out.println();

    } 
}
