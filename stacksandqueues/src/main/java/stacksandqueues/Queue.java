package stacksandqueues;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> numeros = new LinkedList<>();
    private int frontNumero = 0;
    private int backNumero = 0;
    private int numberOfItems = 0;

    public Queue(LinkedList<Integer> numeros, int numberOfItems) {
        this.numeros = numeros;
        this.numberOfItems = numberOfItems;
    }
}
