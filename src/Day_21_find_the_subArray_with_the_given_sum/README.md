
# Day 21 Question
### Find the SubArray with the given sum 



## Question Description
Given an array arr[] of  integers and an integer sum, find a subarray that adds to a given sum.



## Example 1:


````
Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.

````
## Example 2:
````
Input: 
n = 2, arr1[] = [10, 12] 
m = 3, arr2[] = [5 18 20]
Output: 
arr1[] = [5 10]
arr2[] = [12 18 20]
Explanation:
After merging two sorted arrays 
we get 5 10 12 18 20.
````







# Constraints:

````
1 <= n, m <= 105
0 <= arr1i, arr2i <= 10^7
````

# Time And space Complexity
Expected Time Complexity:  O((n+m) log(n+m))
Expected Auxilliary Space: O(1)


## Screenshots

![Solution Screenshot](/ProgramSS/Solution20.png)







