# W1D3Homework
1. Create a function to print the duplicates in a list of strings
public void findDuplicates(List<String> strings){};

I used a Map to store the List into key-value pairs using the strings as keys and using the number of times it shows up as the value. Then I iterated through the Map to find the ones that have duplicates and print them out.




2. Create function to check if the string is a palindrome without using string.reverse() method
public boolean checkPalindrome(String word){};

I used a for loop and a second String Variable to hold the new reversed string then compared the two strings, returning true if it is a palindrome.


3. Create a function that will print:
"fizz" is the number is divisible by 3
"buzz" is the number is divisible by 5
"fizzbuzz" is the number is divisible by both

I used modulus and if else statements sort between the three scenarios so that the calcualtion can be performed. Then it outputs the keywords when appropriate. 



4. Create a function to check if the two strings are Anagrams: Eg COAT and TACO would be anagrams
public boolean checkAnagrams(String word1, String word2){};

I used toCharArray to convert the given strings into character arrays, stripped them of any possible whitespaces and sorted the letters. Then I compared the arrays, returning true if they have the same letters, meaning they are anagrams.


5. Print a multiplication table from 1 to 10 using multidimensional array
Output
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
public void printTables(){};

I used a 2d array and populated the table using two for loops. Then it is printed by another set of
