DSA Progress Log

-> 16th July, 2025
    - Binary Search (under Algorithms/)
    - MergeSort (under Algorithms/)
    - TwoSum (under Problems/)
    - Longest Common Prefix (under Problems/)
    - Filled Square (under Logic/)
    - Hollow Square (under Logic/)

    - Important Points:
        - MergeSort does not return anything because it sorts in place
        - Binary Search is meant for SORTED ARRAYS ONLY (pls don't forget)
        - Char and String do not use the same methods 
        - Use arr.get(index) for ArrayList<> and arr[i] for arrays
        - Use str.charAt(index) for strings instead of str[index]
        - Use StringBuilder for lesser TC -> convert to String using .toString()
        - Use Arrays.toString(arr) to display arrays
        - .length for arrays, .length() for strings, and .size() for ArrayList
    
    - Note(s) to self:
        - You did well today. Please be proud of yourself more often. And get some   sleep if you don't wanna look like a raccoon tomorrow <3

        
-> 17th July 2025
    - QuickSort (under Algorithms/)

    - Important Points:
        - QuickSort uses a partition to divide the array into before and after, and THEN does a recursive call on either side. That's why you don't include the element that partition() returns in either call.
        - The pivotIndex can be calculated as either randomized or using median-of-three. Be careful when using median-of-three because the logic is easy to mess up.
        - Be careful with what you're comparing; are they indices or values?
        - ALWAYS REMEMBER to swap pivotIndex with the very last element to avoid comparison fuck-ups
        - pivotVal needs to be brought back from the very end after traversing through the array such that 
            - elements to the left of pivotVal are less than pivotVal
            - elements to the right of pivotVal are more than pivotVal

    - Note(s) to self:
        - Try implementing both mergeSort and quickSort in LeetCode problems that involve sorting.
        - I know we wanted to do a lot more than just quickSort today, but it's okay. What matters is whether you understood it or not, and you did so perfectly, even if it took some time. Please don't be so hard on yourself. You're not stupid just because you compared an index to a value. You're just tired. So go tf to sleep before you sleep in math class again tomorrow <3

        

        