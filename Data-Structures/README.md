# AUTHOR: SILAS OYEWALE
## Table of contents
Binary Search
### data-structures-and-algorithms

### Binary Search
<!-- Short summary or background information -->
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. 
Without utilizing any of the built-in methods available to your language, return the index of the array’s
 element that is equal to the search key, or -1 if the element does not exist.

### Challenge
<!-- Description of the challenge -->
Use the most efficient way to find the index of a number in an array that is sorted.
### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
The bigo is linear. Get the middle number each time and compare the number you are looking for with 
the middle number. If number of unknown index is greater than the middle number, set the first index 
to be next index after the middle index. Repeat for if unknown index is less than middle index in which 
case, you will change the last index to be the mddle index - 1. If you find your number, return 1, else 
return -1. This is a very efficient way to do binary search.
