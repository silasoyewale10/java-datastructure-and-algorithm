
## AUTHOR: SILAS OYEWALE
# Max value in an unsorted Tree
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->
Write an instance method called find-maximum-value. Without utilizing any of the built-in methods available to your language, return the maximum value stored in the tree.

## Approach and Efficiency
import Queue class and ArrayList class.
create an instance of arraylist and queue.
if the root is empty, return the empty arraylist.
if not, add it to the queue. While the queue is not empty, remove from the queue and set it in temp.
add temp to the arraylist. if left of the temp is not null, put the node in the queue amd if the right is also not null, put it in the queue. 
Inirialize a varibale called max which takes in an initial value of Integer_Min_Value.
Loop through the arraylist and convert the objects into a string and convert the string into an integer. If the integer is greater that the max, max becomes the interger. Return max.

## Big O
Big O of space is O of N
Big O of time is O of N.
## API
<!-- Description of each method publicly available in each of your trees -->
No API needed.
