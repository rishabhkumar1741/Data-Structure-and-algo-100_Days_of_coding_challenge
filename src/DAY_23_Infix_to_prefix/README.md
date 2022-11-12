
# Day 23 Question
### Convert Infix To Prefix Notation



## Question Solution
- Step 1: Reverse the infix expression i.e A+B*C will become C*B+A. Note while reversing each ‘(‘ will become ‘)’ and each ‘)’ becomes ‘(‘.
- Step 2: Obtain the “nearly” postfix expression of the modified expression i.e CB*A+.
- Step 3: Reverse the postfix expression. Hence in our example prefix is +A*BC.


## Example 1:


````
Input : A * B + C / D
Output : + * A B/ C D 

Input : (A - B/C) * (A/K-L)
Output : *-A/BC-/AKL

````










## Screenshots

![Solution Screenshot](/ProgramSS/Solution23.png)







