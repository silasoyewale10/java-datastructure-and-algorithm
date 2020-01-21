package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test public void testEnqueueAValue(){
        Queue test1 = new Queue();
        test1.enqueue(150);
        assertEquals(false, test1.isEmpty());

    }
    @Test public void testEnqueueMultipleValues() {
        Queue test2 = new Queue();
        test2.enqueue(150);
        test2.enqueue(200);
        test2.enqueue(90);
        test2.enqueue(18);

        assertEquals(150, test2.peek());

    }
    @Test public void testDequeueAValue() {
        Queue test3 = new Queue();
        test3.enqueue(150);
        test3.enqueue(200);
        test3.enqueue(90);
        test3.enqueue(18);

        test3.dequeue();
        test3.dequeue();
        test3.dequeue();

        assertEquals(18, test3.peek());
    }
    @Test public void testPeekMethod() {
        Queue test4 = new Queue();

        test4.enqueue(90);
        test4.enqueue(18);
        assertEquals(90, test4.peek());
    }
    @Test public void testEmptyAQueue() {
        Queue test4 = new Queue();
        test4.enqueue(150);
        test4.enqueue(200);
        test4.enqueue(90);
        test4.enqueue(18);

        test4.dequeue();
        test4.dequeue();
        test4.dequeue();
        test4.dequeue();

        assertEquals(true, test4.isEmpty());
    }
    @Test public void testInstantiateEmptyAQueue() {
        Queue test5 = new Queue();
        assertEquals(true, test5.isEmpty());
    }
}