
# Day 24 Question
Java Anagrams


## Question Description
Two strings, a  and b , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

# Input
string a: the first string
string b: the second string
# output
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

# Sample Input :
- anagram
- margana
# Sample Output: 
- Anagrams

# Explanation:
The two strings contain all the same letters in the same frequencies, so we print "Anagrams"

# Sample Input 2  :
- Hello
- hello
# Sample Output: 
- Anagrams

# Explanation:
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

# Expected Time Complexity: 
`O(n)`
# Expected Auxiliary Space: 
`O(log(n))`
# Constraints:

- 1 <=length(a),length(b)<= 50
- Strings a and b consist of English alphabetic characters.
- The comparison should NOT be case sensitive.



## Screenshots

![Solution Screenshot](/ProgramSS/Solution24.png)

