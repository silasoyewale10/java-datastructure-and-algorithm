
# Hashtables
<!-- Short summary or background information -->
Hashtables are key value pairs data structure and have O of 1 look up if implemented properly. It uses a hashing algorithm to generate a number which corresponds to the location of the key in the array. 

## Challenge
<!-- Description of the challenge -->
Implement a Hashtable with the following methods:

add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get: takes in the key and returns the value from the table.
contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Create a map array which holds linkedlist. Each object in the array is a linkedlist and in each linked list is an ObjectInTable to avoid collision. 
hash function hashes between 0 and the szie of the hashtable. So there is no way the hash value is going to exceed the table size. Add adds a key to the map, get returns the corresponding value of a key and contains retursn true or false depnding on whether the key is contained in the map array. 

## API
<!-- Description of each method publicly available in each of your hashtable -->
No API used for this lab. 
