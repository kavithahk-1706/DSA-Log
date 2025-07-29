# Algorithms

### The main algorithms/designs/techniques I come across while solving shit and the logic behind them/notes.

## Index

- [Merge Sort](#merge-sort-under-algorithms)

- [Binary Search (Recursive)](#binary-search-recursive-under-algorithms)

- [Binary Search (Iterative)](#--binary-search-iterative-under-algorithms)

- [Binary Search - First & Last Occurrence](#binary-search---first--last-occurrence-iterative-under-algorithms)



## [__Merge Sort__ _(under Algorithms/)_](Algorithms/MergeSortAlg.java)

### *__Design:__ Divide and Conquer*

- This involves dividing a problem into multiple smaller instances recursively until it hits the base case, then solving it at the lowest level.

### ___Basic Algorithm:___
    
-  Use two functions, mergeSort and merge

- To handle the dividing and merging parts of the technique respectively

- The mergeSort function recursively calls itself for the left and right halves of the array

- Each half is recursively divided into subsequent halves until there is one element left

- Then the merge function is executed to merge the two sub arrays obtained at every level after comparing elements

- Temp arrays are used to store the left and right sorted sub arrays, but the final array is sorted in the same variable

- Since we're using auxiliary space, it is not inplace
    
### *__Time Complexity:__ O(n log n)*

- The `mergeSort` logic uses a `log n` time complexity to recursively divide the array into two halves until the number of elements is 1

- The `merge` logic iterates `n` times to combine the two sorted sub arrays after comparison

- Since the array is divided `log n` times and the divisions are merged `n` times at each level, the total time complexity becomes __O(n log n).__

### *__Space Complexity__: O(n)*

- Every _divide and conquer_ problem involves recursively dividing a larger instance of the problem into smaller halves, meaning that there's a recursive stack that takes up a space of `log n` for every such problem.

- Apart from this, mergeSort makes use of two temp arrays, the left and right sub arrays, to store elements and merge them back up the recursive stack. 

- These sub arrays, though created at each recursive level, are then freed once the function is executed, and at every level, their total space adds up to `O(n)`.

- As in the asymptotic notation, we consider only the greater element of the time/space complexity, __the actual space complexity of O(n + log n) gets reduced to O(n) as n>log n.__

## [__Binary Search (Recursive)__ _(under Algorithms/)_](Algorithms/BinarySearch_Recursive.java)

### *__Design:__ Divide and Conquer*

### *__Basic Algorithm:__*

- Given a __sorted array__.

- Start with the middle element.

- If `(target==arr[mid]):`

    - If the target is equal to the middle element, return the index mid.

- If `(target<arr[mid]):` 

    - Since the array is sorted, `target<arr[mid]` implies that the target will be to the left of mid. 
        
    - This is why we use `return binSearch(array, low, mid-1)` to recursively call the function on the portion of the array which contains elements that are less than the middle element.
        
- If `(target>arr[mid]):` 
            
    - Since the array is sorted, `target>arr[mid]` implies that the target will be to the right of mid. 
            
    - This is why we use `return binSearch(array, mid+1, high)` to recursively call the function on the portion of the array which contains elements that are greater than the middle element.
        
- Continue to recursively call either the left/right portions of the array according to the value of the target with respect to the element, until the target is found.

- If the target is not found at the end of all recursive calls, return -1.
    
### *__Time Complexity:__ O(log n)*
    
- The traversal continues with the division of the array into two parts, __so repeated division by 2__ happens until the no. of elements is 1.
    
- If n is the number of elements originally, dividing it multiple times gives us n/2, n/4, n/8...and so on. This can be expressed as 2^k where k is the number of iterations.

- So the condition becomes __n/(2^k)=1, solving which we get k as log n__ as our time complexity.

### *__Space Complexity:__ O(log n)*

- Recursion involves a stack of function calls that are called in pre-order and executed in post-order. 

- As a result, __at each recursive level a new set of indices is used to check half the length of the current sub array__ ,and the function is executed upon it.

- The number of such arrays generated follows a similar logic as the time complexity, i.e., __continuously divides the length of the array by 2__ until there is one element left. 

- Following the same logic, we get the space complexity as __O(log n)__.


## [__Binary Search (Iterative)__ _(under Algorithms/)_](Algorithms/BinarySearch_Iterative.java)

### *__Design:__ Divide and Conquer*

### *__Basic Algorithm:__*

- Given a __sorted array__.

- Start with the middle element.

- If `(target==arr[mid]):` 

    - If the target is equal to the middle element, return the index mid.

- If `(target<arr[mid]):`

    - Since the array is sorted, `target<arr[mid]` implies that the target will be to the left of mid. 
    
    - This is why we use `right=mid-1` to shrink the portion of the array we'll be checking, so that it only contains elements that are less than the middle element.
        
- If `__(target>arr[mid]):__` 
    
    - Since the array is sorted, `target>arr[mid]` implies that the target will be to the right of mid. 
    
    - This is why we use `left=mid+1` to shrink the portion of the array we'll be checking, so that it only contains elements that are greater than the middle element.
        
- Continue to shrink the left/right portions of the array being checked according to the value of the target with respect to the element, until the target is found.

- If the target is not found at the end of all recursive calls, return -1.
   

### *__Time Complexity:__ O(log n)*
    
- Same as [Binary Search (Recursive)](#time-complexity-olog-n).

### *__Space Complexity:__ O(1)*

- We don't use any extra/auxiliary space here  since we only use two pointers and modify them throughout; so the space complexity is O(1).

    

## [__Binary Search - First & Last Occurrence (Iterative)__ _(under Algorithms/)_](Algorithms/BinarySearch_FirstnLastOccurrence.java)

### *__Design:__ Divide and Conquer*

### *__Basic Algorithm:__*

- Given a __sorted array__.

- Carry out the normal procedure of an iterative binary search using divide and conquer.

- Use two functions - one to track the first occurrence and the other to track the last occurrence.
    
- If at any point `arr[mid]==target`, don't stop and return; rather, continue searching.

- For first occurrence, search the subarray to the left of mid iteratively: 
        
    - i.e, do `(right=mid-1)` so that the portion to be searched is now from left to mid-1, for any instances of target before mid.

- For last occurrence, search the subarray to the right of mid iteratively:

    - i.e, do `(left=mid+1)` so that the portion to be searched is now from mid+1 to right, for any instances of target after mid.
    
- If the target is greater than the mid element, change left to mid+1 to search the right portion of the array for greater elements.

- If the target is less than the mid element, change right to mid-1 to search the left portion of the array for smaller elements.

- If after all the iteration, target is not found, return -1.


### *__Time Complexity:__ O(log n)*

- Same as [Binary Search (Recursive)](#time-complexity-olog-n).

### *__Space Complexity:__ O(1)*

- As this uses the iterative approach, there's no recursive function stack constantly generating new sub arrays

- Whenever we need to shrink the range of search, we simply modify the left and right pointers as per requirement, which take up constant space.

- Thus, as a whole, this algorithm takes up O(1) space complexity.

### Some extra notes:

- Usually for real world cases, __iterative__ binary search is preferred over recursive because of how it saves space due to the absence of memory-eating recursive stack functions.


## [__Quick Sort with Lomuto's Division__](Algorithms/QuickSortAlg_Lomuto.java)

### *__Design:__ Divide and Conquer*

### *__Basic Algorithm:__*

- Pick a pivot element (usually the last element).

- If the pivot is not the last element, swap it with the last element and traverse from low to high-1.

-  Use two pointers, one for traversing through the array (j) and the other to keep track of positions to the left of the pivot (i).

-  Every time an element is less than the pivot, increment i and swap the element's position with i.

-  At the end of all the swapping, swap the pivot at the end with the element at i+1 to return pivot to its original position.

-  Return i+1 as the point of partition.

-  Recursively call quickSort for the left sub array and the right sub array EXCLUDING point of partition.

- Continue the recursion until the base case is hit, i.e., the number of elements is 1.

### *__Time Complexity:__ O(n log n) for good pivot and O(n^2) for bad pivot*

- *__O(n log n)__ (When the pivot choice is good):*

    - The Lomuto partition logic under `partition()` is non-recursive, but takes place n number of times under the `if(left<right)` condition

    - The recursive calls of the left and right sub arrays (excluding the pivot element) take place log n times due to recursive division.

    - Thus the overall time complexity becomes __O(n log n).__
    
- *__O(n^2)__ (When the pivot choice is bad):*

    - In case the pivot choice is either the largest/smallest element, it results in all the other elements being on its left/right side and the division will be completely uneven.

    - As a result the iterations will go up to n-1 recursively, which means the time complexity can be approximated to __O(n^2)__, since there are n recursive levels and a length of traversal of n at each.

    - Thus, it becomes very important to choose the right pivot. To avoid choosing a bad pivot, some techniques include:

        - __Randomized:__ Select a random element from the array. Efficient since the chances are lowered, but they're never zero.

        - __Median-of-three:__ Selects the middle value out of the first, middle, and last elements. A bit more efficient since there's no chance of either the largest/smallest element

### *__Space Complexity:__ O(log n) for good pivot and O(n) for bad pivot*

- *__O(log n)__ (When the pivot choice is good):*

    - Quick Sort is an in-place algorithm as it does not use any auxiliary space to sort the array.

    - The only space taken up is the space of the recursive stack, which has log n recursive calls stored in it, considering the pivot choice is good.

    - Thus, the total space complexity is __O(log n)__.
    
- *__O(n)__ (When the pivot choice is bad):*

    - If the pivot choice is bad, i.e, either the largest/smallest element, then the number of recursive calls will be extended to n, as you'd approximately be executing n number of functions just to get to the base case, i.e, the length of elements being 1.

    - Thus, in the worst case, the space complexity becomes __O(n)__.

### Some extra note(s):

- There are two main techniques used in Quick Sort to perform divisions/partitions based on the pivot element: Lomuto's method (the above) and [Hoare's method](#quick-sort-with-hoares-division).

- Both lead to the same time and space complexity (given above), but the latter is considered more efficient.

- While Lomuto's method is easy to implement, it performs unnecessary swaps at every step where the current element is less than the pivot, leading to reduced efficiency.

- In practice, [__Hoare's Method of Division__](#quick-sort-with-hoares-division) is preferred due to its reduced number of swappings, as it only performs swaps when necessary.

## [__Quick Sort with Hoare's Division__](Algorithms/QuickSortAlg_Hoare.java)

### *__Design:__ Divide and Conquer*

### *__Basic Algorithm:__*

- Pick a pivot element.
    
- Use two pointers, one for traversing from the left (i) and the other from right (j).
    
- Traverse as long as the range is valid, i.e, `while(i<j)`.
    
- If any element at i is greater than pivot or any element at j is less than pivot, it means the element is not where it's supposed to be.
    
- So while the range is still valid, swap the two elements to ensure that:

    - All elements to the left of pivot are less than or equal to it.
        
    - All elements to the right of pivot are greater than or equal to it.
    
- Once the range becomes invalid, i.e, `i==j` or `i>j`, return right as the point of partition.
    
- Recursively call quickSort for the left sub array and the right sub array INCLUDING point of partition.
    
- Continue the recursion until the base case is hit, i.e., the number of elements is 1.

### *__Time Complexity:__ O(n log n) for good pivot and O(n^2) for bad pivot*

- Same as above.

- *__Space Complexity:__ O(log n) for good pivot and O(n) for bad pivot*

    - Same as above

- ___Some extra note(s)___

    - Hoare's method typically fixes the pivot at the beginning, but it doesn't bring it to its final position.

    - Unlike Lomuto's method where the returned element is the pivot's final position, Hoare's method doesn't guarantee that the index returned is the pivot; it's just a point of partition.

    - That's why Lomuto's method doesn't include the point of partition in recursive calls; because it's already in its final position. In contrast, Hoare's method includes the point of partition in recursive calls.

    - Lomuto's method __also guarantees that each the base case is reached__, i.e, the number of elements in the array being sorted becomes 1 at some point. Because we exclude the point of partition in both the left and right recursive calls, __effectively reducing the sub arrays' length at each level__.

    - However, Hoare's method __doesn't guarantee that the sub arrays decrease in length__ because the pivot isn't brought to its final position in this method. This means the function could very likely perform the recursive calls with the same sub array length at every level.
    
    - Thus, not being careful with the conditions __could lead to a stack overflow error__ caused by the recursive function never hitting the base case.

    - To prevent this, __we use do-while loops__ to ensure that __even if the conditions are false to begin with__, the pointers shorten the range of elements to be sorted __at least once__. 
    
    - This makes sure that the length of the sub arrays in the recursive calls is never the same.

    - As __do-while is an exit loop__, it makes sure to __execute the statements at least once__ before checking the condition. Then if it happens to be false, it exits after

    - This __cannot be achieved with while loops__ since they're entry loops and check the condition before entering the block of statements, thereby __skipping the increment/decrement functions entirely__ if the condition is false from the beginning.

    - This makes __do-while loops very very important and crucial__ in situations like this.


    - While Hoare's partition doesn't bring the actual time complexity down, it does save time by preventing unnecessary swaps.

    - In __[Lomuto's Division](Algorithms/QuickSortAlg_Lomuto.java)__, we have two pointers: one traverses (j) while the other keeps track of elements less than the pivot (i). This means that for half the array, both the pointers are concentrated in the left half only, effectively increasing the time spent there.
    
    - We also do this:

            for(int j=low; j<high-1; j++){
                if(arr[j]<pivotValue){
                    i++;
                    swap(arr,i,j);
                }
            }
    
    - This means that even if there are instances where `i==j`, the swapping will still happen even when totally unnecessary.

    - It also doesn't work well when there are many duplicates of a single element.

    - In __[Hoare's Division](Algorithms/QuickSortAlg_Hoare.java)__, the two pointers start from two different ends of the array _(i from the left and j from the right)_, meaning the checking and traversal is well distributed. 
    
    - Also, we do this:

            while(true){

                do{
                    i++;
                }while(arr[i]<pivotVal);

                do{
                    j++;
                }while(arr[j]>pivotVal);

                if(i>=j){
                    return j;
                }

                swap(arr,i,j);
            }
    
    - As a result, you'll notice that the swapping takes place __only when i and j come out of the do-while loops__ _(responsible for their respective increments/decrements)_, __provided the range is still valid__ _(i<j)_. 
    
    - In other words, __the swapping will only happen if__

        - `arr[i]>pivotVal`, i.e, the left pointer finds an element greater than pivotVal

        - `arr[j]<pivotVal`, i.e, the right pointer finds an element less than pivotVal

        - `i<j`, i.e, the range is still valid 
    
    - This __eliminates the possibility for the same element to be swapped with itself__ just because it happens to be less than the pivot, thus saving time and making the partition logic a lot more elegant.

    - This also makes it great with handling multiple duplicates of the same element.

    - The reason why the time complexity isn't affected by this efficiency is because on the whole, __the partition logic still happens to be non-recursive__ in both cases. It's used in by each recursive call, but that doesn't make the partition function itself recursive.

    - Also, the asymptotic notation is a gross approximation of all the operations that take place in an algorithm. 
    
    - For example, n operations and 1000*n operations on the same level are both treated as a time complexity of O(n).
    
    - So the swaps saved by Hoare's method get hidden due to this approximation.

    - As a result the time complexity it takes up is still on average O(n) for both cases, while the recursive calls take up an O(log n).

    - Thus, the total time complexity is still O(n log n) for both.

    - Lomuto's division is preferred when simplicity of logic is prioritized, while Hoare's division is preferred when efficiency and elegance in real-world scenarios is preferred.

     





 