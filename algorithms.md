# Algorithms

### The main algorithms/designs/techniques I come across while solving shit and the logic behind them/notes.

## Index

- [Merge Sort](#merge-sort-under-algorithms)

- [Binary Search (Recursive)](#binary-search-recursive-under-algorithms)

- [Binary Search (Iterative)](#--binary-search-iterative-under-algorithms)

- [Binary Search - First & Last Occurrence](#binary-search---first--last-occurrence-iterative-under-algorithms)

- [Quick Sort with Lomuto's Division](#quick-sort-with-lomutos-division-under-algorithms)


## [__Merge Sort__ _(under Algorithms/)_](Algorithms/MergeSortAlg.java)

- *__Design:__ Divide and Conquer*

    - This involves dividing a problem into multiple smaller instances recursively until it hits the base case, then solving it at the lowest level.

- ___Basic Algorithm:___
    
    -  Use two functions, mergeSort and merge

    - To handle the dividing and merging parts of the technique respectively

    - The mergeSort function recursively calls itself for the left and right halves of the array

    - Each half is recursively divided into subsequent halves until there is one element left

    - Then the merge function is executed to merge the two sub arrays obtained at every level after comparing elements

    - Temp arrays are used to store the left and right sorted sub arrays, but the final array is sorted in the same variable

    - Since we're using auxiliary space, it is not inplace
    
- *__Time Complexity:__ O(n log n)*

    - The `mergeSort` logic uses a `log n` time complexity to recursively divide the array into two halves until the number of elements is 1

    - The `merge` logic iterates `n` times to combine the two sorted sub arrays after comparison

    - Since the array is divided `log n` times and the divisions are merged `n` times at each level, the total time complexity becomes __O(n log n).__

- *__Space Complexity__: O(n)*

    - Every _divide and conquer_ problem involves recursively dividing a larger instance of the problem into smaller halves, meaning that there's a recursive stack that takes up a space of `log n` for every such problem.

    - Apart from this, mergeSort makes use of two temp arrays, the left and right sub arrays, to store elements and merge them back up the recursive stack. 

    - These sub arrays, though created at each recursive level, are then freed once the function is executed, and at every level, their total space adds up to `O(n)`.

    - As in the asymptotic notation, we consider only the greater element of the time/space complexity, __the actual space complexity of O(n + log n) gets reduced to O(n) as n>log n.__

## [__Binary Search (Recursive)__ _(under Algorithms/)_](Algorithms/BinarySearch_Recursive.java)

- *__Design:__ Divide and Conquer*

- *__Basic Algorithm:__*

    - Given a __sorted array__

    - Start with the middle element

    - Depending on how the middle element compares to the target (>,<,=)

    - Shrink the range of elements to be checked by modifying the left and right pointers using recursive left and right subarray calls

    - If at any point the value of mid happens to be the target, return the index mid

    - Else, return -1 at the end of traversal
    
- *__Time Complexity:__ O(log n)*
    
    - The traversal continues with the division of the array into two parts, __so repeated division by 2__ happens until the no. of elements is 1.
    
    - If n is the number of elements originally, dividing it multiple times gives us n/2, n/4, n/8...and so on. This can be expressed as 2^k where k is the number of iterations.

    - So the condition becomes __n/(2^k)=1, solving which we get k as log n__ as our time complexity.

- *__Space Complexity:__ O(log n)*

    - Recursion involves a stack of function calls that are called in pre-order and executed in post-order. As a result, __at each recursive level a new set of indices is used to check half the length of the current sub array__ ,and the function is executed upon it.

    - The number of such arrays generated follows a similar logic as the time complexity, i.e., __continuously divides the length of the array by 2__ until there is one element left. 

    - Following the same logic, we get the space complexity as __O(log n)__.


## [__Binary Search (Iterative)__ _(under Algorithms/)_](Algorithms/BinarySearch_Iterative.java)

- *__Design:__ Divide and Conquer*

- *__Basic Algorithm:__*
   
    - Same as above

- *__Time Complexity:__ O(log n)*
    
    - Same as above

- *__Space Complexity:__ O(1)*

    - We don't use any extra/auxiliary space here  since we only use two pointers and modify them throughout; so the space complexity is O(1).

    

## [__Binary Search - First & Last Occurrence (Iterative)__ _(under Algorithms/)_](Algorithms/BinarySearch_FirstnLastOccurrence.java)

- *__Design:__ Divide and Conquer*

- *__Basic Algorithm:__*
    - Given a __sorted array__

    - Carry out the normal procedure of an iterative binary search using divide and conquer

    - Use two functions - one to track the first occurrence and the other to track the last occurrence
    
    - If at any point nums[mid]==target, don't stop and return; rather, continue searching

    - For first occurrence, search the subarray to the left of mid

    - For last occurrence, search the subarray to the right of mid

- *__Time Complexity:__ O(log n)*

    - Same as above 

- *__Space Complexity:__ O(1)*

    - As this uses the iterative approach, there's no recursive function stack constantly generating new sub arrays

    - Whenever we need to shrink the range of search, we simply modify the left and right pointers as per requirement, which take up constant space.

    - Thus, as a whole, this algorithm takes up O(1) space complexity.

- Some extra notes:

    - Usually for real world cases, __iterative__ binary search is preferred over recursive because of how it saves space due to the absence of memory-eating recursive stack functions.


## [__Quick Sort with Lomuto's Division__](Algorithms/QuickSortAlg_Lomuto.java)

- *__Design:__ Divide and Conquer*

- *__Basic Algorithm:__*

    - Pick a pivot element (usually the last element)

    - If the pivot is not the last element, swap it with the last element and traverse from low to high-1

    -  Use two pointers, one for traversing through the array (j) and the other to keep track of positions to the left of the pivot (i).

    -  Every time an element is less than the pivot, increment i and swap the element's position with i

    -  At the end of all the swapping, swap the pivot at the end with the element at i+1 to return pivot to its original position

    -  Return i+1 as the point of partition

    -  Recursively call quickSort for the left sub array and the right sub array EXCLUDING point of partition

    - Continue the recursion until the base case is hit, i.e., the number of elements is 1

- *__Time Complexity:__ O(n log n) (average case) or O(n^2) (worst case)*

    - *__O(n log n)__ (When the pivot choice is good):*

        - The Lomuto partition logic is non-recursive, but takes place n number of times under the `if(left<right)` condition

        - The recursive calls of the left and right sub arrays (excluding the pivot element) take place log n times due to recursive division.

        - Thus the overall time complexity becomes __O(n log n).__
    
    - *__O(n^2)__ (When the pivot choice is bad):*

        - In case the pivot choice is either the largest/smallest element, it results in all the other elements being on its left/right side and the division will be completely uneven.

        - As a result the iterations will go up to n-1 recursively, which means the time complexity can be approximated to __O(n^2)__, since there are n recursive levels and a length of traversal of n at each.

        - Thus, it becomes very important to choose the right pivot. To avoid choosing a bad pivot, some techniques include:

            - Randomized: Select a random element from the array. Efficient since the chances are lowered, but they're never zero.

            - Median-of-three: Selects the middle value out of the first, middle, and last elements. A bit more efficient since there's no chance of either the largest/smallest element

- *__Space Complexity:__ O(log n) (average case) or O(n)*

    - *__O(log n)__ (When the pivot choice is good):*

        - Quick Sort is an in-place algorithm as it does not use any auxiliary space to sort the array.

        - The only space taken up is the space of the recursive stack, which has log n recursive calls stored in it, considering the pivot choice is good.

        - Thus, the total space complexity is __O(log n)__.
    
    - *__O(n)__ (When the pivot choice is bad):*

        - If the pivot choice is bad, i.e, either the largest/smallest element, then the number of recursive calls will be extended to n, as you'd approximately be executing n number of functions just to get to the base case, i.e, the length of elements being 1.

        - Thus, in the worst case, the space complexity becomes __O(n)__.

- Some extra note(s):

    - There are two main techniques used in Quick Sort to perform divisions/partitions based on the pivot element: Lomuto's method (the above) and Hoare's method.

    - Both lead to the same time and space complexity (given above), but the latter is considered more efficient.

    - While Lomuto's method is easy to implement, it performs unnecessary swaps at every step where the current element is less than the pivot, leading to reduced efficiency.

    - In practice, __Hoare's Method of Division__ is preferred due to its reduced number of swappings, as it only performs swaps when necessary.

   
