package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test public void testEnqueueAValue(){
        Queue<Integer> test1 = new Queue<>();
        test1.enqueue(150);
        assertFalse(test1.isEmpty());

    }
    @Test public void testEnqueueMultipleValues() {
        Queue<Integer> test2 = new Queue<>();

//        Queue test2 = new Queue();
        test2.enqueue(150);
        test2.enqueue(200);
        test2.enqueue(90);
        test2.enqueue(18);
        assertEquals((Integer)150, test2.peek());

    }
    @Test public void testDequeueAValue() {
        Queue<Integer> test3 = new Queue<>();

        test3.enqueue(150);
        test3.enqueue(200);
        test3.enqueue(90);
        test3.enqueue(18);

        test3.dequeue();
        test3.dequeue();
        test3.dequeue();

        assertEquals((Integer)18, test3.peek());
    }
    @Test public void testPeekMethod() {
        Queue<Integer> test4 = new Queue<>();

        test4.enqueue(90);
        test4.enqueue(18);
        assertEquals((Integer)90, test4.peek());
    }
    @Test public void testEmptyAQueue() {
        Queue<Integer> test5 = new Queue<>();
        test5.enqueue(150);
        test5.enqueue(200);
        test5.enqueue(90);
        test5.enqueue(18);

        test5.dequeue();
        test5.dequeue();
        test5.dequeue();
        test5.dequeue();

        assertTrue(test5.isEmpty());
    }
    @Test public void testInstantiateEmptyAQueue() {
        Queue<Integer> test6 = new Queue<>();
        assertTrue(test6.isEmpty());
    }
}