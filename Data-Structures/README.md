# AUTHOR: SILAS OYEWALE
## Table of contents
LinkedList Implementation
### data-structures-and-algorithms

### Linked List Implementation
<!-- Short summary or background information -->
linked list is a popular data structure in java. It is a link of many nodes. Each node has a value and the memory location of the next node. The first node is called ther head and automatically has a memory location of null since its next node doesn't exist.

### Challenge
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"
### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Create a node class and a linked list class. Name the linked list seperatedly from java inbuilt LinkedList class to avoid overwritten class. I created a function to add things into the array, another method to add to the head, andother method to print out the list, and another method to find things in the list. 
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
<img src="./resources/code-challenege-06.jpeg"
     alt="White Board Picture"
     style="width: 200px;" />

