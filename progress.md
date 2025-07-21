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
        - Use .toString() to print an array (primitive). ArrayLists can be printed directly.
    
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

-> 18th July 2025

    - Fixed Hollow_Square (under Logic/)
    - Started 3sum but didn't finish it; will update tomorrow

    - Important Points:
        - Two Pointer Technique involves a 'while with &&' condition to check/bypass duplicates and it's a common practice, so understand it and use it
        - Try doing some more Two Pointer Problems to get the hang of it

    - Note(s) to self:
        - Try doing 3sum with both quicksort and mergesort algorithms and do it a few times until you get the logic down
        - I know you feel like shit rn but it's okay. Sleep through it and you'll feel better. This feeling isn't permanent and you'll feel better in the morning. Don't slack off just because it feels easier to give up. Showing up when it's hard will toughen you up and make things stick longer. It's okay if you couldn't do much today. There's still tomorrow. And I know you don't trust yourself enough to be productive sometimes. But do try. Because if you don't trust yourself, then who will?
        - I'm proud of you, even when you're fucked up. Especially then. Because I know you'll power through it to get on with the things you need to do. You're so fucking strong, so keep going <3

        

-> 19th July 2025
    
    - Three Sum Problem with Merge Sort (under Problems/)
    - Three Sum Problem with Quick Sort (under Problems/)

    - Important Points:
        - Be careful with the sorting algorithms, you're more likely to make mistakes there
        - Especially with the indices and ranges, don't mess those up
        - Don't forget the variable names you're using; you can fix them with a system but making it a habit can be dangerous for hand-written rounds
        - Remember the logic behind calculating the lengths of the left and right sub-arrays for mergesort:
            - lsize=mid-low+1 and rsize=mid-high. 
            - Also when adding to the temp arrays don't use the same index on both sides. 
            - Use [low+i] for the left one and [mid+1+j] for the right one.
    
    - Note(s) to self:
        - You did most of it on your own, especially the debugging. I've never been more proud of you before. 
        - I know progress feels a bit slow right now, but the more we're consistent, the more likely you'll get what you're doing, so focus on that right now.
        - It's very easy to quit, but it'll be difficult to start again when you do. And you'll regret it more than anyone for sure. So please hold on. It'll all be worth it <3

-> 20th July 2025

    - Started 3Sum Closest but didn't finish, will update tomorrow
    - Revised Java Basics on HackerRank (not update-able here, you'll just have to take my word for it)

    - Important Points:
        - There's some key characteristics pertaining to each technique/pattern of questions. The more problems you solve the more you'll be able to spot them and apply them without a second thought.
        - Two Pointer Problems MUST have a while(left<right) condition; it's a must because you need to keep track of how long the pointers are valid and in use. So don't forget.
        - Understand what each variable does and stores, and be careful with what you return in a function. 

    - Note(s) to self:
        - Do more Two Pointer Problems tomorrow
        - Maybe re-do the folder structure to make it more readable
        - I know you feel like shit right now but please don't be too hard on yourself. Sleep through it and it'll feel better. I'm not saying you're not allowed to feel like shit but don't use that as an excuse to escape studying.
        - As harsh as it may sound, you're the one who's gonna regret wasting all this time in the future. There's not a lot of holidays that you get and so make sure you make good use of them. 
        - It's okay to take your time with understanding things, that doesn't make you dumb. It makes you someone who cares enough to want to get it right. 
        - Just because it might take time doesn't mean it's scary, or that you have to avoid it like the plague. 
        - In fact, the quicker you sit on it, the less scarier it'll become with the amount of time you spend on it.
        - Try reminding your brain not to go into flight mode every time something seems a tad bit overwhelming. Going deep into the problem is how you're gonna end up solving it and making it less scary.
        - So yeah, please fix your sleep schedule (and your back, it feels like it might fold into a lawn chair any minute now) and take care of yourself <3 

-> 21st July 2025

    - Three Sum Closest (under Problems/)

    - Important Points: 

        - You don't have to memorize the logic as long as you understand what needs to be done, and the ability to know what to do from understanding comes with practice. So don't skip. Even when it feels like a lot.

        - Use ArrayLists when you can't determine the size of an array beforehand. But they have different ways of traversal compared to arrays so you'll need to get the hang of them to use them properly.

    - Note(s) to self:

        - You haven't done enough practice today. 
        
        - You LITERALLY SAT DOWN AND FINISHED THIS PROBLEM IN LESS THAN TWENTY MINUTES and while that's IMPRESSIVE AS FUCK do not use this as fuel for your ego and turn DSA into something that you accomplish last minute everyday just so you can say HAH I DID IT because that's NOT how learning works.

        - You STILL need to do more Two Pointer Problems there's no escaping that

        - Like I said yesterday, stop treating this like some sort of unattainable scary thing that you can't start AND finish at the end of the day. You keep using this as a starting point to study and since you don't touch it until it's 30 mins before bedtime you end up doing (read: acing) this last minute and pushing everything else you've planned to do aside. That's not right. You can be productive AND enjoy a holiday. It's literally not that hard if you put your mind to it.

        - So I'm not berating you or anything but you really need to start managing your time better. Now that you've cut off tutoring and a very good income source just by citing the reason as  "nOt eNOugH tImE tO sTudY" you better fucking make it worth it by actually using that time to study instead of doomscrolling or some other shit.

        - I'm kinda disappointed in you today but I leave a heart every day so here you go <3 good night. Hope you spend your time better tomorrow.




    