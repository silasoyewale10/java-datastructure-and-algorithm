# Trees
<!-- Short summary or background information -->
Binary tree has a node and each node has a value and two children, one child or no child.

## Challenge
<!-- Description of the challenge -->
Write a function called tree_intersection that takes two binary tree parameters.
Without utilizing any of the built-in library methods available to your language, 
return a set of values found in both trees.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Create an arraylist, a hashset, and a stack.Iterate through the node stack , pop the node and store it in temp. Stor the value of the root node in the hash set. Check the left and right node and store their values in the hash set. Add root of second tree to the stack. Loop through the stack, and check if the hash set already contains the value of the node. If it does, put the value inside the arraylist. Check all left and right nodes and return the arraylist.  

## API
<!-- Description of each method publicly available in each of your hashtable -->
No API used for this lab. 

