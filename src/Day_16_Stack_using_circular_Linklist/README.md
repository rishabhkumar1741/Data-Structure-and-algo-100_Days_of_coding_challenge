
# Day 16 Question
Implement a stack using Circular Linked List


## Question Description
To implement a stack using the Circular Linked List,
follow a simple rule in the implementation of a stack which is last in first out and all the operations can be performed with the help of a top variable.

# Sample Input :
- obj.push(10);
- obj.push(20);
- obj.push(30);
- obj.push(40);
- obj.push(50);
- obj.display();
- obj.pop();
-  obj.display();
# Sample Output: 
- ==> 50 ==> 40 ==> 30 ==> 20 ==> 10
- ==> 40 ==> 30 ==> 20 ==> 10

# Explanation:
In the stack Implementation, a stack contains a top pointer which is the “head” of the stack where pushing and popping items happens at the head of the list And the last node contain the address of the first node.

The main advantage of using a linked list over arrays is that it is possible to implement a stack that can shrink or grow as much as needed. Using an array will put a restriction on the maximum capacity of the array which can lead to stack overflow. Here each new node will be dynamically allocated. so overflow is not possible.

# Stack Operations: 
- push(): Insert a new element into the stack i.e just insert a new element at the beginning of the linked list.
- pop(): Return the top element of the Stack i.e simply delete the first element from the linked list.
- display(): Print all elements in Stack.



## Screenshots

![Solution Screenshot](/ProgramSS/Solution16.jpg)

