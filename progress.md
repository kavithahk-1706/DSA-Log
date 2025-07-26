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

- [23rd July 2025](#23rd-july-2025)  

- [24th July 2025](#24th-july-2025)

- [25th July 2025](#25th-july-2025)

- [26th July 2025](#26th-july-2025)

## 16th July, 2025

### Things I did today

- [__MergeSort__ _(under Algorithms/)_](Algorithms/MergeSortAlg.java)

     - [_**Notes:** algorithms.md/Merge Sort_](algorithms.md/#merge-sort-under-algorithms)

- [__Two Sum__ _(under Problems/)_](Problems/TwoSum.java)

    - [_**Notes:** problems.md/Two Sum_](problems.md/#two-sum-under-problems)

- [__Longest Common Prefix__ _(under Problems/)_](Problems/LongestStrPrefix.java)

    - [_**Notes:** problems.md/Longest Common Prefix_](problems.md/#longest-common-prefix-under-problems)
    

### Key Takeaways

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

- [__QuickSort with Lomuto's Division__ _(under Algorithms/)_](Algorithms/QuickSortAlg_Lomuto.java)

    - [_**Notes:** algorithms.md/Quick Sort with Lomuto's Division_](algorithms.md/#quick-sort-with-lomutos-division)


### Key Takeaways
- `QuickSort` with Lomuto's division __uses a partition__ to divide the array into before and after, and THEN does a __recursive call on either side__. That's why you __don't include the element__ that `partition()` returns in either call.

- The `pivotIndex` can be calculated as either randomized or using median-of-three. __Be careful when using median-of-three__ because the logic is easy to mess up.

- __Be careful with what you're comparing;__ are they indices or values?

- __ALWAYS REMEMBER to swap `pivotIndex` with the very last element__ to avoid comparison fuck-ups

- __`pivotVal` needs to be brought back__ from the very end after traversing through the array such that 
    - elements to the left of `pivotVal` are less than `pivotVal`
    - elements to the right of `pivotVal` are more than `pivotVal`

- Lomuto's version is cool for understanding BUT swaps everything like an idiot and sucks with duplicates. There's a better version called Hoare's method which optimizes Quick Sort's division mechanism.

### Things to do tomorrow
- Try implementing both `mergeSort` and `quickSort` in LeetCode problems that involve sorting.

### Note(s) to self
- I know we wanted to do a lot more than just quickSort today, but it's okay. What matters is whether you understood it or not, and you did so perfectly, even if it took some time.

- Please don't be so hard on yourself. You're not stupid just because you compared an index to a value. You're just tired. So go tf to sleep before you sleep in math class again tomorrow <3

## 18th July 2025

### Things I did today
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

## 23rd July 2025

### Things I did today

- Fixed/added the following:

- [__Binary Search (Recursive)__ _(under Algorithms/)_](Algorithms/BinarySearch_Recursive.java)

    - [*__Notes:__ algorithms.md/Binary Search (Recursive)*](algorithms.md/#binary-search-recursive)

- [__Binary Search (Iterative)__ _(under Algorithms/)_](Algorithms/BinarySearch_Iterative.java)

    - [*__Notes:__ algorithms.md/Binary Search (Iterative)*](algorithms.md/#binary-search-iterative)

- [__Binary Search - First & Last Occurrence (Iterative)__ _(under Algorithms/)_](Algorithms/BinarySearch_FirstnLastOccurrence.java)

    - [*__Notes:__ algorithms.md/Binary Search - First & Last Occurrence (Iterative)*](algorithms.md/#binary-search---first--last-occurrence-iterative-under-algorithms)

### Key Takeaways
- `Binary Search` is meant for __SORTED ARRAYS ONLY__ _(pls don't forget)_

- The Binary Search Algorithm you did earlier (on 16th) was essentially pointless since you implemented it with recursion to find the first/last occurrence AND used an extra ArrayList (WHY)

- Iterative approaches save time and space complexity; while recursion is cool and fancy, the function stack takes up more space so might not be preferred in instances where you can use the iterative approach

- Searching algorithms use the base case as `if(left<right)` because `left==right` implies that there's one element, and that one element is sorted by default so doesn't need extra checking. Besides, when you return back to the recursive case, you start with a single element and for that this condition is perfect.

- HOWEVER, searching algorithms NEED to have an equality (`if(left<=right)` or `while(left<=right)`) because you need to account for __single element arrays__. Blindly using the same base case as in sorting will lead to this edge case failing.

### Things to do tomorrow
- Design, Basic Algorithm, Time & Space Complexity for the problems done so far

- Two Pointer Problems

### Note(s) to self 
- You understood where you went wrong and corrected it, proud of you <3

- The more mistakes you make, the better the concepts will stick because you'll know exactly WHY the other things won't work, so don't beat yourself up over mistakes or call yourself stupid.

- Try to get things done earlier tomorrow so you won't have to stay up so late

- Goodnight sleeptight <3

## 24th July 2025

### Things I did today

- Revised [__MergeSort__ _(under Algorithms/)_](Algorithms/MergeSortAlg.java)

- Updated [__Notes on Merge Sort__ _(under 16th July 2025, progress.md)_](#things-i-did-today)

- Nothing other than that, honestly. Not to give excuses but the net isn't working and my back is broken- also the laptop's hanging and it's pretty late already.

- I did do a bit on recurrence relations though, and cleared up some doubts caused by today's very confusing class in college

### Key Takeaways
- Any auxiliary space used that is NOT given implies that the problem is solved out of place

- A recursive stack using Divide and Conquer takes up space O(log n)

- If two __separate things take place on the same level/simultaneously, multiply their TCs/SCs__

- If they're __independent actions, add their TCs/SCs and only express in terms of the greater term__

### Things to do tomorrow
- Update the rest of the TCs and SCs
- Some more Two Pointer Problems

### Note(s) to self
- I know you didn't do much today but there wasn't much you could do about it. You still managed to clear up some good doubts/confusions that would've made things worse if you chose to skip. 

- Some progress >>>>>> none. So good job. Proud of you.
- Sleep early tonight <3

## 25th July 2025

### Things I did today

- Refactored structure to include important notes like TC, SC, and algorithms in separate files (___[algorithms.md](algorithms.md)___ and ___[problems.md](problems.md)___)

- Updated ___[README.md](README.md)___

- Updated [__Notes on Two Sum__ _(under 16th July, 2025, progress.md)_](#things-i-did-today)

- Updated [__Notes on Longest Common Prefix__ _(under 16th July, 2025, progress.md)_](#things-i-did-today)

- Updated [__Notes on Binary Search (Recursive)__ _(under 23rd July, 2025, progress.md)_](#things-i-did-today-7)

- Updated [__Notes on Binary Search (Iterative)__ _(under 23rd July, 2025, progress.md)_](#things-i-did-today-7)

- Updated [__Notes on Binary Search - First & Last Occurrence (Iterative)__ _(under 23rd July, 2025, progress.md)_](#things-i-did-today-7)

### Key Takeaways

- Markdown is cool when you have less to edit but SUCKS when you've an obsessive compulsion to format everything to the dot T__T

- The use of `Map<Integer, Integer>` or `List<Integer>` is a classic example of Data Structure Polymorphism; so yes, it's not just animal sounds and barking and oinking all the time T__T why doesn't anyone tell me this kinda stuff

- Time and Space Complexity are very intuitive when you don't second-guess yourself every 2 seconds

- The key to cracking TC is to check two things:

    - What's the basic TC of the operation itself?

    - How many times is the operation being run?

- The key to cracking SC is to differentiate between what space is given and what space is being created.

- Organization SUCKS i liked YOLO-ing my way through 28947 tabs better

- But this'll stick better so I'll put up with it

### Things to do tomorrow

- Continue refactoring & reformatting

- Do some more Two Pointer Problems

### Note(s) to self:

- I like how you're revising while refactoring and reformatting, but also make sure to learn new things along with revising old things

- Remember that messy but real understanding >>> organized but surface-level retention

- Also I don't know how you're still vertical right now because your back is literally on the verge of comitting crimes rn

- Pls go to sleep i beg u <3

## 26th July 2025

### Things I did today

- Updated [__Notes on Quick Sort with Lomuto's Division__ _(under 17th July, 2025, progress.md)_](#things-i-did-today-1)

### Key Takeaways

- The quickSort method I worshipped till now (Lomuto) is not the best, apparently

- The recursive relation includes steps with T(some n term) which denote recursive calls, and O(some n term) which denote non-recursive calls.

- You can't always guarantee that the worst case for quick sort won't creep up in the recursive calls, but what you can do at best is make sure that it doesn't start with the worst case, because that makes it worse.


### What I should do tomorrow

- Finish Re-factoring and Re-formatting

- Do Quick Sort with Hoare's Division

- Two Pointer Problems (yes you've been postponing this for ages pls do something at least)

### Note(s) to self

- There's none because the battery is about to die and OH SHIT HIMMAT KILLED ANITA sorry wrong place to rant

- PLS PLS commit asap

- Also focus on understanding things and noting them down rather than simply going quickly for the hell of it

- That said you can reformat and revise AND visit new problems at the same time you don't have to be like Changbin and be bad at multitasking

- Okay goodnight it's 1 AM your sleep schedule is so fucked atp but honestly who cares it's Sunday tomorrow (or today- yeah because tomorrow is today) <3

