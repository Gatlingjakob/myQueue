import static org.junit.Assert.*;

/**
 * Created by Jakob on 04-10-2016.
 */
public class myQueueTest {

    myQueue<Integer> q = new myQueue<Integer>();
    myQueue<Integer> kjoo = new myQueue<Integer>();


    @org.junit.Before
    public void setUp() throws Exception {
        q.add(1);
        q.add(2);
        q.add(3);
    }

    @org.junit.Test
    public void add() throws Exception {
        kjoo.add(1);
        int i = kjoo.peek();
        assertEquals(i,1);


    }

    @org.junit.Test
    public void remove() throws Exception {
        q.remove();
        int i = q.peek();
        assertEquals(i,2);
    }

    @org.junit.Test
    public void peek() throws Exception {

        int i = q.peek();
        assertEquals(i, 1);

    }

    @org.junit.Test
    public void empty() throws Exception {
    boolean troo = kjoo.isEmpty();
        assertEquals(troo, true);
    }

}