package datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class HashTable {
    int size;
    LinkedList<ObjectInTable> [] map;

    public HashTable(int size) {
        this.size = size;
        this.map = new LinkedList[size];
    }
public class ObjectInTable {
        String key;
        String value;

    public ObjectInTable(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

    public int hash(String key){
        int hashValue = 0;
        for(int i = 0; i < key.length(); i++){
            hashValue += (int) key.charAt(i);
        }
        return (hashValue * 745) % this.size;
    }


    public void add(String key, String value){
        ObjectInTable vv ;
        int hashKey = hash(key);
        if(map[hashKey] == null){ // no linkedlist yet
            LinkedList<ObjectInTable> xx = new LinkedList<>();
            ObjectInTable pp = new ObjectInTable(key, value);
            xx.add(pp);
            map[hashKey] = xx;
//            xx.add(objectInTable);
        }
        else{
            vv = new ObjectInTable(key, value);
            map[hashKey].add(vv);
        }
    }
//    @Override
    public String get(String key){
        if(map[hash(key)] == null){
            return null;
        }
        else {
            LinkedList<ObjectInTable> listOfLists = map[hash(key)];
            for(ObjectInTable list : listOfLists){
                if(list.key.equals(key)){
                    return list.value;
                }

            }
            return null;
        }
//        return null;
    }
    public boolean contains(String key){
        int hash = hash(key);
//        System.out.println("map[hash] != null = " + map[hash] != null);
        if(map[hash] == null){
            return false;
        }
        else {
            LinkedList<ObjectInTable> listOfLists = map[hash(key)];
            for(ObjectInTable list : listOfLists){
                if(list.key.equals(key)){
                    return true;
                }
            }
            return false;
        }
    }
}

