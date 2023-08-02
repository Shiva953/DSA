package DSA.src.neutron.shiva;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(43);
        queue.add(35);
        queue.add(333);
        queue.add(453);
        queue.add(7);
        queue.add(536);
        queue.add(69);
        System.out.println(queue.remove()); //the first element is the first one removed

        //DEQUEUE
        Deque deque = new ArrayDeque<>();
    }
}
