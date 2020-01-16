
# AUTHOR: SILAS OYEWALE
## Table of contents
LinkedList Implementation
### data-structures-and-algorithms

### Linked List Implementation
<!-- Short summary or background information -->
linked list is a popular data structure in java. It is a link of many nodes. Each node has a value and the memory location of the next node. The first node is called ther head and automatically has a memory location of null since its next node doesn't exist.

### Challenge
<!-- Description of the challenge -->
Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 Declare a methopd called kth and start int i at 0.
 find list length and append node to linked list. while next is not null, loop through the list and when k equals list lenght -count - 1, return current.data.  
## API
<!-- Description of each method publicly available to your Linked List -->
#### toString
Prints out the content of the list in the format . "{ a } -> { b } -> { c } -> NULL"
#### Append
Adds strings to the list.
#### insert
adds to the head or resets the head
#### includes
checks if a certain node value is in the list. RTeturns true if its in the list returns false if not in the list.
### Insert Before: 
Takes in 2 things. The current value in the node and the value to be inserted before the node
### Insert After
Takes 2 things. The current value in the node and the value to be inserted after the node.

# Image for whiteboard
![](assets/code-challenge-7.png)

