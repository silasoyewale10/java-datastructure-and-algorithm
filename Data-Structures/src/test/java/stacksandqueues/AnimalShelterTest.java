package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionThrow(){
        AnimalShelter test1 = new AnimalShelter();
        test1.dequeuePet("Elephant");
    }


    @Test public void testEnqueue(){
        AnimalShelter test2 = new AnimalShelter();
        Dog mee = new Dog("bingo");

        test2.enqueuePet(mee);

        assertEquals("bingo", test2.dequeuePet("dog").name);
    }
    @Test public void testDequeue(){
        AnimalShelter test2 = new AnimalShelter();
        Dog mee = new Dog("bingo");
        Dog me = new Dog("bin");
        Dog m = new Dog("b");


        test2.enqueuePet(mee);
        test2.enqueuePet(me);
        test2.enqueuePet(m);

        test2.dequeuePet("dog");
        test2.dequeuePet("dog");

        assertEquals("b", test2.dequeuePet("dog").name);

    }
    @Test public void testDequeueCat() {
        AnimalShelter test3 = new AnimalShelter();
        Cat mee = new Cat("bingo");
        Cat me = new Cat("bin");
        Cat m = new Cat("b");

        test3.enqueuePet(mee);
        test3.enqueuePet(me);
        test3.enqueuePet(m);

        test3.dequeuePet("cat");
        test3.dequeuePet("cat");

        assertEquals("b", test3.dequeuePet("cat").name);

    }

    @Test public void testDequeueCatAndDog() {
        AnimalShelter test4 = new AnimalShelter();

        //create cats
        Cat mee = new Cat("bingo");
        Cat me = new Cat("bin");
        Cat m = new Cat("b");

        //enque cats
        test4.enqueuePet(mee);
        test4.enqueuePet(me);
        test4.enqueuePet(m);

        //create dogs
        Dog one = new Dog("bingo");
        Dog two = new Dog("bin");
        Dog three = new Dog("b");

        //enqueue dogs
        test4.enqueuePet(one);
        test4.enqueuePet(two);
        test4.enqueuePet(three);

        //dequeue cat and dog together
        test4.dequeuePet("cat");
        test4.dequeuePet("dog");
        test4.dequeuePet("cat");

        assertEquals("b", test4.dequeuePet("cat").name);
        assertEquals("bin", test4.dequeuePet("dog").name);




    }

}