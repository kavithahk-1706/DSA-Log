# Problems

### Basically a bunch of LeetCode Stuff and the main logic behind the problems/important notes.

## Index 

- [Two Sum](#two-sum-under-problems)

- [Longest Common Prefix](#longest-common-prefix-under-problems)



## [__Two Sum__ _(under Problems/)_](Problems/TwoSum.java)

### *__Problem Statement__*  

- Given an array of elements and a target value, return an array of indexes of two elements which add up to the target. Only one solution exists, and the same element cannot be used twice.

### *__Design:__ One Lookup Hashing*

- This involves iterating over a range and recording seen elements in an unsorted hash map to enable quick lookup O(1).

- Some implementations use a two-pass hash map, which basically means storing and searching in two different trials. This works but is less efficient and slower than the approach used here (one-pass hash map) as in our case, both storing and searching take place in a single loop.

### ___Basic Algorithm___

- Use a hash map to keep track of elements and indexes.

- For each iteration store the complement of the target value as target-current element.

- Search for complement in the hash map.

- If it exists, return an array of the current element's index and the complement's index.

    
### *__Time Complexity:__ O(n)*

- There's a loop iterating over the given array, and for each element encountered:

    - The element and index are added to the hashmap; __inserting takes O(1) time complexity__.

    - The element's complement (target-element) is searched in the hashmap; __lookup takes O(1) time complexity__.

- Since these two operations take place over a range of n elements in the array, the total time complexity becomes __O(n*(1+1)) which gives O(n) time complexity__.
    
### *__Space Complexity:__ O(n)*

- Though an array of at most two elements/indexes is returned by the function, the hashmap created for fast lookups takes up space.

- In the worst case, if the complement is not found for any of the elements, every element needs to be added to the hashmap, which takes up __n__ units of space.

- Thus, the space complexity becomes __O(n)__.
    
        
## [__Longest Common Prefix__ _(under Problems/)_](Problems/LongestStrPrefix.java)

### *__Problem Statement:__*

- Given an array of strings, return the longest string which is the common prefix for every string in the array.

### *__Design:__ Horizontal Scanning*

- This involves fixing the prefix of the first string and checking the rest of the strings for this prefix as well.

- Other approaches like Vertical Scanning, Divide and Conquer, etc., exist but Horizontal Scanning is the best here for most real-world inputs.

### __Basic Algorithm:__
 
- Iterate over the letters in the first word of the array.
    
- For each such character iterate over the rest of the words of the array. 
    
- Check if the ith character of the first word is equal to the ith character of every other word in the array.
  
- If yes then add that element to the String.

- If there's an inequality at any point/one of the string lengths runs out, return the String to stop adding letters to it.
 
### *__Time Complexity:__ O(mn) (where m is the length of the first string and n is the number of strings in the array)*

- Here we fix the first string of the array whose length is m, and iterate over the rest of the strings in the array (n-1 arrays).

- In the worst case that the first string's length happens to be the longest and the prefix is not returned early, __you'd have to iterate for a total of m*(n-1) times__, which on ignoring the constants gives us a __total time complexity of O(mn)__.

- *__Space Complexity:__ O(m) (where m is the length of the first string)*

- We use minimal auxiliary space, primarily for storing the result prefix.

- In the worst case that __the first string is the prefix to be returned__, the string will be of length m, giving us a __space complexity of O(m)__.

### Some extra notes:

- Use `str.charAt(index)` for Strings instead of `str[index]` _(it's not like Python)_.

- Use `StringBuilder` for lesser TC; convert a `StringBuilder` to `String` using `.toString()`.