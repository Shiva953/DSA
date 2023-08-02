package DSA.src.neutron.shiva;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(7);
        stack.push(46);
        stack.push(4346);
        stack.push(434);
        stack.push(27);
        stack.push(95);
        stack.push(753);
        stack.push(634);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); //throws exception because stack becomes empty
    }
}
