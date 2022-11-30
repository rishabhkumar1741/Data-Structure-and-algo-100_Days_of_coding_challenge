
# Day 30   Check if given strings are rotations of each other or not


## Example 1:

````
Input: S1 = ABCD, S2 = CDAB
output =>   true
````
## Example 2:

````
Input: S1 = ABCD, S2 = ACBD
output=>    false
````

````
Follow the given steps to solve the problem

If the size of both strings is not equal, then it can never be possible.
Push the original string into a queue q1.
Push the string to be checked inside another queue q2.
Keep popping q2‘s and pushing it back into it till the number of such operations is less than the size of the string.
If q2 becomes equal to q1 at any point during these operations, it is possible. Else not.
````











## Screenshots

![Solution Screenshot](/ProgramSS/Solution30.png)







