package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    @Test
    public void testEnqueueAValue() {
        PseudoQueue test1 = new PseudoQueue();

        test1.enqUeUe(10);
        test1.enqUeUe(15);
        test1.enqUeUe(20);

        assertEquals(20, test1.peek());
    }

    @Test
    public void testDequeue() {
        PseudoQueue test2 = new PseudoQueue();
        test2.enqUeUe(10);
        test2.enqUeUe(15);
        test2.enqUeUe(20);

        assertEquals(10,test2.DequeUe() );
    }
    @Test
    public void testMultipleDequeue() {
        PseudoQueue test3 = new PseudoQueue();

        test3.enqUeUe(10);
        test3.enqUeUe(15);
        test3.enqUeUe(20);
        test3.enqUeUe(10);
        test3.enqUeUe(15);
        test3.enqUeUe(20);

        test3.DequeUe();
        test3.DequeUe();
        test3.DequeUe();
        test3.DequeUe();
        test3.DequeUe();

        assertEquals(20, test3.DequeUe());
    }
}