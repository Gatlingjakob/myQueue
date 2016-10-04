/**
 * Created by Jakob on 02-10-2016.
 */
import java.util.*;


public class myQueue<E> {
    private LinkedList<E> list;

    public myQueue() {
        list = new LinkedList<E>();
    }

    public void add(E element) {
        list.add(list.size(), element);
    }

    public E remove() {
        return list.remove(0);
    }

    public E peek() {
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        myQueue<Integer> q = new myQueue<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);

        System.out.println("peek: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}