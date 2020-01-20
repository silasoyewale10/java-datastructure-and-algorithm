package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test public void testPush(){
        Stack test1 = new Stack();
        Node t = new Node (5);
        test1.push(5);

        assertEquals(29, test1.peek());
    }
    @Test public void testPushMultiplePushes() {
        Stack test2 = new Stack();

        test2.push(12);
        test2.push(120);
        test2.push(80);
        assertEquals(80, test2.peek());
    }
    @Test public void testPop() {
        Stack test3 = new Stack();
        test3.push(12);
        test3.push(120);
        test3.push(80);
        test3.pop();
        assertEquals(120, test3.peek());
    }
    @Test public void testEmptyAfterMultiplePops() {
        Stack test4 = new Stack();
        test4.push(12);
        test4.push(120);
        test4.push(80);
        test4.pop();
        test4.pop();
        test4.pop();
        assertEquals(true, test4.isEmpty());
    }
    @Test public void testEmptyStack() {
        Stack test5 = new Stack();
        assertEquals(true, test5.isEmpty());

    }

    }