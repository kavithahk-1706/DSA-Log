# Problems

### Basically a bunch of LeetCode Stuff and the main logic behind the problems/important notes.

## Index 

- [Two Sum](#two-sum-under-problems)

- [Longest Common Prefix](#longest-common-prefix-under-problems)

- [Remove Duplicates from Sorted Array](#remove-duplicates-from-sorted-array-under-problems)


## [__Two Sum__ _(under Problems/)_](Problems/TwoSum.java)
> ___[Go back to Index](#index)___

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
> ___[Go back to Index](#index)___

### *__Problem Statement__*

- Given an array of strings, return the longest string which is the common prefix for every string in the array.

### *__Design:__ Horizontal Scanning*

- This involves fixing the prefix of the first string and checking the rest of the strings for this prefix as well.

- Other approaches like Vertical Scanning, Divide and Conquer, etc., exist but Horizontal Scanning is the best here for most real-world inputs.

### __Basic Algorithm__
 
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

### Some extra notes

- Use `str.charAt(index)` for Strings instead of `str[index]` _(it's not like Python)_.

- Use `StringBuilder` for lesser TC; convert a `StringBuilder` to `String` using `.toString()`.

## [__Remove Duplicates from Sorted Array__ _(under Problems/)_](Problems/Remove_Duplicates_Sorted.java)
> ___[Go back to Index](#index)___

### *__Problem Statement__*

- Given a sorted array, remove duplicates in place and return the length of the array without it. 

- The elements beyond this index do not matter, as long as before the index the elements are sorted and have no duplicates.

### *__Design:__ Two Pointer Approach*
- The Two Pointer Approach involves two pointers/variables that perform two different functions so as to reduce/optimize the overall traversal to solve the problem.

### *__Basic Algorithm__*
- Use two pointers, one for traversing and one for storing the positions that need to be overwritten.

- Traverse from 1 to end as the first element isn't a duplicate.

- If at any point the current element is not equal to the previous element, the current element is unique, so it needs to be copied into the duplicate's position, stored at overwrite_index.

- Sometimes if both pointers are equal, the element will overwrite itself, but this doesn't affect the rest of the algorithm.

- When duplicates actually exist, the overwrite_index is not incremented. This will ensure that these duplicates are overwritten as well.

- At the end of the traversal, the overwrite_index will store the number of elements which are unique, as all the elements before it are free of duplicates.

- Return overwrite_index.

### *__Time Complexity:__ O(n)*

- The algorithm involves a loop that iterates over the range of elements in the array, and all the overwriting takes place within n iterations only.

- Thus, the time complexity is just __O(n)__.

### *__Space Complexity:__ O(1)*

- There's no auxiliary space used here, except for the indexes which take up constant space. Thus, the space complexity is __O(1)__.

### ___Some extra notes___

- Brute force involves iterating over the array for each element in order to search for duplicates; in other words, a nested loop. This gives a time complexity of __O(n^2)__ which is very slow.

- Two Pointer Approach helps optimize this as there's no need to iterate over the array n number of times for each element when we could just use two variables to store the positions that need to be overwritten.

- There's a lot of cases where a nested loop brute force can be optimized using two pointers.

