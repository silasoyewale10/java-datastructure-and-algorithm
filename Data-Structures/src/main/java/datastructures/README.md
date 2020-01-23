
# AUTHOR: SILAS OYEWALE
## Table of contents
LinkedList Implementation
### data-structures-and-algorithms

### Linked List Implementation
<!-- Short summary or background information -->
linked list is a popular data structure in java. It is a link of many nodes. Each node has a value and the memory location of the next node. The first node is called ther head and automatically has a memory location of null since its next node doesn't exist.

### Challenge
<!-- Description of the challenge -->
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Return false if the opening is a closing char and if the closing is an openng char. Get the number of each char and check if they march, if they don't return false. If they do, check if what you have marches and then if they don't return false, else, return true. 
## API
<!-- Description of each method publicly available to your Linked List -->


# Image for whiteboard
![](src/main/resources/assets/whiteboard-code-challenege-13.jpeg)

