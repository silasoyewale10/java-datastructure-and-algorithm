package datastructures.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTTest {

    BinaryT one = new BinaryT();
    BinaryT two = new BinaryT();

    @Before
    public void initial(){



        Node newNode1 = new Node(5);
        Node newNode2 = new Node(15);
        Node newNode3 = new Node(52);
        Node newNode4 = new Node(25);
        Node newNode5 = new Node(85);
        Node newNode6 = new Node(33);
        Node newNode7 = new Node(12);
        Node newNode8 = new Node(7);
        Node newNode9 = new Node(5);
        Node newNod10 = new Node(5);
        Node newNode11 = new Node(5);

        one.root = newNode1;

        newNode1.leftOffSpring =newNode2;
        newNode1.rightOffSpring =newNode3;

        newNode1.leftOffSpring.leftOffSpring =newNode4;
        newNode1.leftOffSpring.rightOffSpring =newNode5;

        newNode1.rightOffSpring.leftOffSpring =newNode6;
        newNode1.rightOffSpring.rightOffSpring =newNode7;

        newNode1.rightOffSpring.rightOffSpring.leftOffSpring =newNode8;
        newNode1.rightOffSpring.rightOffSpring.rightOffSpring =newNode9;

        newNode1.leftOffSpring.rightOffSpring.leftOffSpring =newNod10;
        newNode1.leftOffSpring.rightOffSpring.rightOffSpring =newNode11;


        Node twonewNode1 = new Node(6);
        Node twonewNode2 = new Node(16);
        Node twonewNode3 = new Node(9);
        Node twonewNode4 = new Node(3);
        Node twonewNode5 = new Node(22);
        Node twonewNode6 = new Node(5);
        Node twonewNode7 = new Node(8);
        Node twonewNode8 = new Node(1);
        Node twonewNode9 = new Node(11);

        two.root = twonewNode1;

        twonewNode1.leftOffSpring =twonewNode2;
        twonewNode1.rightOffSpring =twonewNode3;

        twonewNode1.leftOffSpring.leftOffSpring =twonewNode4;
        twonewNode1.leftOffSpring.rightOffSpring =twonewNode5;

        twonewNode1.rightOffSpring.leftOffSpring =twonewNode6;
        twonewNode1.rightOffSpring.rightOffSpring =twonewNode7;

        twonewNode1.rightOffSpring.rightOffSpring.leftOffSpring =twonewNode8;
        twonewNode1.rightOffSpring.rightOffSpring.rightOffSpring =twonewNode9;

        System.out.println(BinaryT.intersect(one, two));

    }
    @Test public void intersectMethod() {
        ArrayList<Integer> expected = new ArrayList<>(5);
        expected.add(5);
        System.out.println("expected = " + expected);
        assertTrue(expected.equals(BinaryT.intersect(one, two)));
    }
    @Test public void intersectMethodMultipleRepeats() {
        Node newNode1 = new Node(5);
        Node newNode2 = new Node(15);
        Node newNode3 = new Node(6);
        Node newNode4 = new Node(25);

        one.root = newNode1;
        newNode1.leftOffSpring =newNode2;
        newNode1.rightOffSpring =newNode3;
        newNode1.leftOffSpring.leftOffSpring =newNode4;


        Node twonewNode1 = new Node(6);
        Node twonewNode2 = new Node(6);
        Node twonewNode3 = new Node(6);
        Node twonewNode4 = new Node(3);
        Node twonewNode5 = new Node(2);
        Node twonewNode6 = new Node(5);

        two.root = twonewNode1;
        twonewNode1.leftOffSpring =twonewNode2;
        twonewNode1.rightOffSpring =twonewNode3;
        twonewNode1.leftOffSpring.leftOffSpring =twonewNode4;
        twonewNode1.leftOffSpring.rightOffSpring =twonewNode5;
        twonewNode1.rightOffSpring.leftOffSpring =twonewNode6;
        System.out.println("BinaryT.intersect(one,two) = " + BinaryT.intersect(one,two));

        ArrayList<Integer> expected = new ArrayList<>(5);
        expected.add(6);
        expected.add(5);
        System.out.println("expected = " + expected);
        assertTrue(expected.equals(BinaryT.intersect(one, two)));
    }

    @Test public void intersectMethodEmptyTree() {
        Node newNode1 = new Node(5);
        Node newNode2 = new Node(15);
        Node newNode3 = new Node(6);
        Node newNode4 = new Node(25);

        one.root = newNode1;
        newNode1.leftOffSpring = newNode2;
        newNode1.rightOffSpring = newNode3;
        newNode1.leftOffSpring.leftOffSpring = newNode4;

        Node twonewNode1 = new Node(6);
        two.root = twonewNode1;


        ArrayList<Integer> expected = new ArrayList<>(5);
        expected.add(6);
        assertTrue(expected.equals(BinaryT.intersect(one, two)));
    }

    }