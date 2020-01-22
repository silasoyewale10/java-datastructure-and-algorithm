package stacksandqueues;

import java.util.LinkedList;

public class AnimalShelter {
    private Queue<Dog> dogs;
    private Queue<Cat> cats;

    public AnimalShelter() {
        this.dogs = new Queue<>();
        this.cats = new Queue<>();
    }

    public void enqueuePet(Dog dog){
        dogs.enqueue(dog);
    }
    public void enqueuePet(Cat cat){
        cats.enqueue(cat);

    }
    public Animal dequeuePet(String preference){
        switch(preference.toLowerCase()){
            case "dog":
                return this.dogs.dequeue();
            case "cat":
                return this.cats.dequeue();
        }
        throw new IllegalArgumentException();
    }
//    public boolean isEmpty(Animal x){
//        switch(x){
//            case "dog":
//                return
//        }
//        return
//    }
//    @Override
//    public String toString(){
//        StringBuilder holder = new StringBuilder();
//
//    }

}
