# AUTHOR: SILAS OYEWALE
## Table of contents
Animal Shelter
### JAVA-data-structures-and-algorithms

### Stacks and Queues
Stacks is first in last out and queue is first in first out. 
## Challenge
<!-- Description of the challenge -->
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I implemented a generic class for Queue, Node, and Stack. I used dry, making each method take care of particular task. The big o for most methods is either O of 1 or at worst O(n). 
For the Stack, the reference is always pointing to the top Node and for the Queue, the reference is always pointing to the front node. I didn't use node in this code challenge, instead, I used stacks. So the queue was a queue of stacks. 
The data type returned on dequeue is animal which could be dog or cat. 

## API
<!-- Description of each method publicly available to your Stack and Queue-->
No API needed. 



# Image for whiteboard
![](resources/assets/whiteboard-code-challenge-12.JPG)
