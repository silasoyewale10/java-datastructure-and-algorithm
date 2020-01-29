# AUTHOR: SILAS OYEWALE
## Table of contents
FizzBuzz Tree
### data-structures-and-algorithms

### Challenge
<!-- Description of the challenge -->
Write a function called FizzBuzzTree which takes a tree as an argument.
Without utilizing any of the built-in methods available to your language, 
determine whether or not the value of each node is divisible by 3, 5 or
both. Create a new tree with the same structure as the original, but the 
values modified as follows:

If the value is divisible by 3, replace the value with “Fizz”
If the value is divisible by 5, replace the value with “Buzz”
If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
If the value is not divisible by 3 or 5, simply turn the number into a String.

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Create a nodeString class with 2 constructors. One takes in value, left node and right
node while the other one takes in just value. Set the root of the tree to point to the 
root and create a replace method to replace the strings appropriately. Convert the string
to integer and then divide by 15, 5, and 3. If the remainder of those divisions is 0,
replace with FizzBuzz, BUzz and Fizz respectively. 

## API
<!-- Description of each method publicly available to your Linked List -->
No API needed for this code. 
