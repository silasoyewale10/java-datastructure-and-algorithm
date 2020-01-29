
## AUTHOR: SILAS OYEWALE
# BREADTHFIRST Trees
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->
Write a breadth first traversal method which takes a Binary Tree as its unique input.
Without utilizing any of the built-in methods available to your language, traverse 
the input tree using a Breadth-first approach, and return a list of the values 
in the tree in the order they were encountered.


## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
import Queue class and ArrayList class.
create an instance of arraylist and queue.
if the root is empty, return the empty arraylist.
if not, add it to the queue. While the queue is not empty, remove from the queue and set it in temp.
add temp to the arraylist. if left of the temp is not null, put the node in the queue amd if the right is also not null, put it in the queue. Then return the arraylist.

## Big O
Big O of space is O of N
Big O of time is O of N.
## API
<!-- Description of each method publicly available in each of your trees -->
No API needed.
