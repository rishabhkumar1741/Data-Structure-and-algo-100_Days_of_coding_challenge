
# Day 7 Question
Write a program to cyclically rotate an array by one.


## Question Description

Given an array, cyclically rotate the array clockwise by one. 

 - `Examples`:
   - `Input  `: arr[]= {1, 2, 3, 4, 5}
   - `Output`: arr[] = {5, 1, 2, 3, 4}
## Test Cases

- Check For Empty array




## Solution Description 

 **Steps below to solve the given problem**

1) Create a new ARRAY With same elements
2) Shift all elements one position ahead. 
3) Replace first element of array with new ARRAY[LAST-1].


## Time and Space Complexity



```bash
Time Complexity:  O(n), as we need to iterate through all the elements. Where n is the number of elements in the array.
Auxiliary Space:O(n), as we are using constant space.
```

## Screenshots

![Solution Screenshot](/ProgramSS/Solution8.jpg)

