
# Day 7 Question

Move all negative numbers to beginning and positive to end with constant extra space

## Question Description

An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

 - `Examples`:
   - `Input`: -12, 11, -13, -5, 6, -7, 5, -3, -6
   - `Output`: -12 -13 -5 -7 -3 -6 11 6 5
## Test Cases

- Check For Empty array
- Check If Array contain only 1 Element
- Check If Array contain only 2 Element
- Check For More then two element present in Array
- Only positive Element present
- Only Negative Element present



## Solution Description 

The idea is to solve this problem with constant space and linear time is by using a [two-pointer  approach](https://www.geeksforgeeks.org/two-pointers-technique/)
where we simply take two variables like left and right which hold the 0 and N-1 indexes. Just need to check that :

 **Steps below to solve the given problem**

- Keep Four indices start = 0, mid = 0, end = N-1 and lengthOfArray = N
- Traverse the array from start to end and mid is less than end indexes
- If arr[mid] > 0 then swap the element with the element at index  end and update end--
- If arr[mid] < 0 then swap the element with the element at index start and update start++ and mid++
- Print the array


## Screenshots

![Solution Screenshot](/ProgramSS/Solution7.jpg)

