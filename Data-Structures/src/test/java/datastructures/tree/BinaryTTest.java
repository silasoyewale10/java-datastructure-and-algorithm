package datastructures.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTTest {
    @Test public void intersectMethod(){}
    BinaryT one = new BinaryT();
    BinaryT two = new BinaryT();




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

    Node root = newNode1;

    newNode1.leftOffSpring = newNode2;
    newNode1.rightOffSpring = newNode3;

    newNode1.leftOffSpring.leftOffSpring = newNode4;
    newNode1.leftOffSpring.rightOffSpring = newNode5;

    newNode1.rightOffSpring.leftOffSpring = newNode6;
    newNode1.rightOffSpring.rightOffSpring = newNode7;

    newNode1.rightOffSpring.rightOffSpring.leftOffSpring = newNode8;
    newNode1.rightOffSpring.rightOffSpring.rightOffSpring = newNode9;

    newNode1.leftOffSpring.rightOffSpring.leftOffSpring = newNod10;
    newNode1.leftOffSpring.rightOffSpring.rightOffSpring = newNode11;

}