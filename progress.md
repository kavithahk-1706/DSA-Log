# DSA Progress Log

- This is is a daily log of my progress in DSA.
- If it's Kavitha reading this, get back to work unless you're here to update, idiot. 
- If it's someone else, hope you find this educational, encouraging, and entertaining. (OH MY GOD THE ALLITERATION YOU'RE SUCH A NERD EW)

## Log Index  
- [16th July 2025](#16th-july-2025)  
- [17th July 2025](#17th-july-2025)  
- [18th July 2025](#18th-july-2025)  
- [19th July 2025](#19th-july-2025)  
- [20th July 2025](#20th-july-2025)  
- [21st July 2025](#21st-july-2025)  
- [22nd July 2025](#22nd-july-2025)  

## 16th July, 2025

### Things I did today
- [__Binary Search__  _(under Algorithms/)_](Algorithms/BinarySearchAlg.java)
    - *__Design:__ Divide and Conquer*

        - This involves dividing a problem into multiple smaller instances recursively until it hits the base case, then solving it at the lowest level.
    
    - *__Time Complexity:__ O(log n)*
    
        - The traversal continues with the division of the array into two parts, __so repeated division by 2__ happens until the no. of elements is 1.
    
        - If n is the number of elements originally, dividing it multiple times gives us n/2, n/4, n/8...and so on. This can be expressed as 2^k where k is the number of iterations.

        - So the condition becomes __n/(2^k)=1, solving which we get k as log n__ as our time complexity.
    - *__Space Complexity:__ O(1)*
        - We don't use any extra/auxiliary space here so the space complexity is O(1).

- [__MergeSort__ _(under Algorithms/)_](Algorithms/MergeSortAlg.java)
- [__TwoSum__ _(under Problems/)_](Problems/TwoSum.java)
- [__Longest Common Prefix__ _(under Problems/)_](Problems/LongestStrPrefix.java)
- [__Filled Square__ _(under Logic/)_](Logic/Filled_Square.java)
- [__Hollow Square__ _(under Logic/)_](Logic/Hollow_Square.java)



### Key Takeaways
- `MergeSort` does not return anything because it __sorts in place__
- `Binary Search` is meant for __SORTED ARRAYS ONLY__ _(pls don't forget)_
- `char` and `String` do not use the same methods _(it was supposed to be obvious)_
- Use `arr.get(index)` for ArrayList<>
and `arr[i]` for arrays
- Use `str.charAt(index)` for Strings instead of `str[index]` _(it's not like Python)_
- Use `StringBuilder` for lesser TC; convert a `StringBuilder` to `String` using `.toString()`
- Use `Arrays.toString(arr)` to display arrays
- `.length` for arrays, `.length()` for strings, and `.size()` for ArrayList
- Use `.toString()` to print an array (primitive). ArrayLists can be printed directly.

### Things to do tomorrow
- Try `QuickSort` since it's one of the fastest sorting algorithms other than `MergeSort`
    
### Note(s) to self
 - You did well today. Please be proud of yourself more often. And get some   sleep if you don't wanna look like a raccoon tomorrow <3

        
## 17th July 2025

### Things I did today
- [__QuickSort__ _(under Algorithms/)_](Algorithms/QuickSortAlg.java)

### Key Takeaways
- `QuickSort` __uses a partition__ to divide the array into before and after, and THEN does a __recursive call on either side__. That's why you __don't include the element__ that `partition()` returns in either call.
- The `pivotIndex` can be calculated as either randomized or using median-of-three. __Be careful when using median-of-three__ because the logic is easy to mess up.
- __Be careful with what you're comparing;__ are they indices or values?
- __ALWAYS REMEMBER to swap `pivotIndex` with the very last element__ to avoid comparison fuck-ups
- __`pivotVal` needs to be brought back__ from the very end after traversing through the array such that 
    - elements to the left of `pivotVal` are less than `pivotVal`
    - elements to the right of `pivotVal` are more than `pivotVal`

### Things to do tomorrow
- Try implementing both `mergeSort` and `quickSort` in LeetCode problems that involve sorting.

### Note(s) to self
- I know we wanted to do a lot more than just quickSort today, but it's okay. What matters is whether you understood it or not, and you did so perfectly, even if it took some time.
- Please don't be so hard on yourself. You're not stupid just because you compared an index to a value. You're just tired. So go tf to sleep before you sleep in math class again tomorrow <3

## 18th July 2025

### Things I did today
- [__Fixed Hollow Square__ _(under Logic/)_](Logic/Hollow_Square.java)
- __Started 3sum__ but didn't finish it; will update tomorrow

### Key Takeaways
- `Two Pointer Technique` involves a _'while with &&'_ condition to __check/bypass duplicates__ and it's a common practice, so understand it and use it.

### Things to do tomorrow
- Try doing some more `Two Pointer Problems` to get the hang of it.
- Try doing 3sum with both quicksort and mergesort algorithms and do it a few times until you get the logic down

### Note(s) to self
- I know you feel like shit rn but it's okay. Sleep through it and you'll feel better. 
- This feeling isn't permanent and you'll feel better in the morning. Don't slack off just because it feels easier to give up. Showing up when it's hard will toughen you up and make things stick longer. 
- It's okay if you couldn't do much today. There's still tomorrow. And I know you don't trust yourself enough to be productive sometimes. But do try. Because if you don't trust yourself, then who will?
- I'm proud of you, even when you're fucked up. Especially then. Because I know you'll power through it to get on with the things you need to do. You're so fucking strong, so keep going <3

        

## 19th July 2025

### Things I did today
- [__Three Sum Problem with Merge Sort__ _(under Problems/)_](Problems/ThreeSum_MergeSort.java)
- [__Three Sum Problem with Quick Sort__ _(under Problems/)_](Problems/ThreeSum_QuickSort.java)

### Key Takeaways
- __Be careful with the sorting algorithms__, you're more likely to make mistakes there
- Especially with the __indices and ranges__, don't mess those up
- __Don't forget the variable names you're using__; you can fix them with a system but making it a habit can be dangerous for hand-written rounds
- Remember the logic behind __mergesort__:
    - `lsize=mid-low+1` and `rsize=mid-high`. 
    - When adding to the temp arrays __don't use the same index on both sides__. 
    - Use `[low+i]` for the left one and `[mid+1+j]` for the right one.
    
### Things to do tomorrow
- Either pick up another array based problem on LeetCode and start it, or do a few Two Pointer based problems.

### Note(s) to self
- You did most of it on your own, especially the debugging. I've never been more proud of you before. 
- I know progress feels a bit slow right now, but the more we're consistent, the more likely you'll get what you're doing, so focus on that right now.
- It's very easy to quit, but it'll be difficult to start again when you do. And you'll regret it more than anyone for sure. So please hold on. It'll all be worth it <3

## 20th July 2025

### Things I did today
- __Started 3Sum Closest__ but didn't finish, will update tomorrow
- __Revised Java Basics on HackerRank__ _(not update-able here, you'll just have to take my word for it)_

### Key Takeaways
- There's some key characteristics pertaining to each technique/pattern of questions. The more problems you solve the more you'll be able to spot them and apply them without a second thought.
- __Two Pointer Problems MUST have a `while(left<right)` condition__ 
- It's a must because __you need to keep track of how long the pointers are valid and in use.__ So don't forget.
- Understand what each variable does and stores, and be __careful with what you return in a function__. 

### Things to do tomorrow
- Do more Two Pointer Problems tomorrow
- Maybe re-do the folder structure to make it more readable

### Note(s) to self
- I know you feel like shit right now but please don't be too hard on yourself. Sleep through it and it'll feel better. I'm not saying you're not allowed to feel like shit but don't use that as an excuse to escape studying.
- As harsh as it may sound, you're the one who's gonna regret wasting all this time in the future. There's not a lot of holidays that you get and so make sure you make good use of them. 
- It's okay to take your time with understanding things, that doesn't make you dumb. It makes you someone who cares enough to want to get it right. 
- Just because it might take time doesn't mean it's scary, or that you have to avoid it like the plague. 
- In fact, the quicker you sit on it, the less scarier it'll become with the amount of time you spend on it.
- Try reminding your brain not to go into flight mode every time something seems a tad bit overwhelming. Going deep into the problem is how you're gonna end up solving it and making it less scary.
- So yeah, please fix your sleep schedule _(and your back, it feels like it might fold into a lawn chair any minute now)_ and take care of yourself <3 

## 21st July 2025

### Things I did today
- [__Three Sum Closest__ _(under Problems/)_](Problems/ThreeSum_Closest.java)
- __Removed debugging statements from previous codes__ _(under Problems/)_

###  Key Takeaways

- __You don't have to memorize the logic__ as long as you understand what needs to be done, and the ability to know what to do from understanding comes with practice. __So don't skip.__ Even when it feels like a lot.

- Use ArrayLists when __you can't determine the size of an array__ beforehand. But they have different ways of traversal compared to arrays so you'll need to get the hang of them to use them properly.

### Things to do tomorrow
- Re-format [___`progress.md`___](progress.md) and [___`README.md`___](README.md)
- Write the Time & Space Complexities for every problem you've done so far with explanations
- PLEASE FOR THE LOVE OF KRISHNA do some more Two Pointer Problems

### Note(s) to self
- You haven't done enough practice today. 
- You LITERALLY SAT DOWN AND FINISHED THIS PROBLEM IN LESS THAN TWENTY MINUTES
- And while that's IMPRESSIVE AS FUCK do not use this as fuel for your ego and turn DSA into something that you accomplish last minute everyday just so you can say HAH I DID IT because that's NOT how learning works.
- You STILL need to do more Two Pointer Problems there's no escaping that
- Like I said yesterday, stop treating this like some sort of unattainable scary thing that you can't start AND finish at the end of the day. 
- You keep using this as a starting point to study. And since you don't touch it until it's 30 mins before bedtime, you end up doing _(read: acing)_ this last minute and pushing EVERYTHING ELSE you've planned to do aside. That's not right.
- You can be productive AND enjoy a holiday. It's literally not that hard if you put your mind to it.
- So I'm not berating you or anything but you really need to start managing your time better. Now that you've cut off tutoring _(read: a very good income source)_ just by citing the reason as  _"nOt eNOugH tImE tO sTudY"_ __you better fucking make it worth it__ by actually using that time to study instead of doomscrolling or some other shit.
- I'm kinda disappointed in you today but I leave a heart every day so here you go <3 good night. Hope you spend your time better tomorrow.

## 22nd July 2025

### Things I did today
- Re-formatted [___`progress.md`___](progress.md) and [___`README.md`___](README.md) _(now it looks like I have my life put together YAY)_
- [__Remove Duplicates in a Sorted Array__ _(Under Problems/)_
](Problems/Remove_Duplicates_Sorted.java) 

### Key Takeaways
- [__Remove Duplicates in a Sorted Array__ _(Under Problems/)_
](Problems/Remove_Duplicates_Sorted.java) uses Two Pointer Approach. _(FINALLY)_
- Two Pointer doesn't always necessarily mean there's a left and right pointer on either side of the array.
- They might not always be explicitly defined, i.e., they may also be loop variables.
- It's better to consider them as two different variables that are defined to do two separate tasks.
- A single element is already sorted and unique.
- It's better to compare using previous values than with the next value as the latter can cause IndexOutofBounds errors

### Things to do tomorrow
- Some more Two Pointer Problems.
- Try exploring Prefix Sum, Sliding Window, and HeapSort after Two Pointer.
- Write the Time Complexity, Space Complexity, and Logic used under each problem logged so far.

### Note(s) to self
- It's already pretty late so go to sleep lmfao
- You did a lot today even if it doesn't feel like it, so take it slow and go easy on yourself.
- I'm proud of you, really. Okay gn now before you get scolded <3


    