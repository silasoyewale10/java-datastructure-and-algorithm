package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashTable {
    int size;
//    ArrayList<Integer> map;
    String [] map;


    public HashTable(int size) {
        this.size = size;
        this.map = new String [size];
    }

    public int hash(String key){
        int hashValue = 0;
        for(int i = 0; i < key.length(); i++){
            hashValue += (int) key.charAt(i);
            System.out.println(hashValue);
        }
        System.out.println("hashValue = " + hashValue);

        return (hashValue * 599) % this.size;
    }
    public void add(String key, String value){
        int hashKey = hash(key);

        this.map[hashKey] = value;

    }
//    @Override
    public int get(String key){
        System.out.println("this.size is " + this.size);
        for(int i = 0; i < this.size; i++){

            if(map[i] == key){
                System.out.println("i in get test");

                System.out.println(" map of i is  = " + map[i]);
            }

            return hash(map[i]);

        }
        return -1;
    }


    @Override
    public String toString() {
        return "HashTable{" +
                "map=" + Arrays.toString(map) +
                '}';
    }
}
