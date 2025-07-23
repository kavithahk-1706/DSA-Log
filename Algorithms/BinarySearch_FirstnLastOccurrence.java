import java.util.*;

/* Binary Search - First and Last Occurrence (sorted arrays only)

 * Basic Algorithm:
 * Carry out the normal procedure of an iterative binary search using divide and conquer
 * Use two functions - one to track the first occurrence and the other to track the last occurrence
 * If at any point nums[mid]==target, don't stop and return; rather, continue searching
 * For first occurrence, search the subarray to the left of mid
 * For last occurrence, search the subarray to the right of mid
 */

public class BinarySearch_FirstnLastOccurrence{

    //first occurrence logic
    public static int binSearchFOcc(int[] nums, int left, int right, int target){

        //initialize the first occurrence index globally as -1;
        //that way, if the element is not found, it can be returned directly
        int ans=-1;

        //continue iterating as long as the range is non-empty
        while(left<=right){

            //compute middle index
            int mid=(left+right)/2;

            //if the element in the middle is equal to the target
            if(target==nums[mid]){

                //track the index where target is found 
                ans=mid;

                //shrink the subarray to the left of mid to continue the search for first occurrence
                right=mid-1;
            
            //if target is less than the middle element
            }else if(target<nums[mid]){

                //shrink the subarray to narrow down the no. of elements to be checked
                //as the array is sorted, target will be to the left of nums[mid]
                right=mid-1;

            //if target is greater than the middle element    
            }else{

                //shrink the subarray to narrow down the no. of elements to be checked
                //as the array is sorted, target will be to the right of nums[mid]
                left=mid+1;
            }

        }

        //return the latest index tracked as the first occurrence
        return ans;
    }

    //last occurrence logic
    public static int binSearchLOcc(int[] nums, int left, int right, int target){

        //initialize the first occurrence index globally as -1;
        //that way, if the element is not found, it can be returned directly
        int ans=-1;

        //continue to iterate as long as the set is non-empty
        while(left<=right){

            //compute the middle index
            int mid=(left+right)/2;

            //if the element in the middle is equal to the target
            if(target==nums[mid]){

                //track the index where target is found 
                ans=mid;

                //shrink the subarray to the right of mid to continue the search for last occurrence
                left=mid+1;
            
            //if target is less than the middle element
            }else if(target<nums[mid]){

                //shrink the subarray to narrow down the no. of elements to be checked
                //as the array is sorted, target will be to the left of nums[mid]
                right=mid-1;

            //if target is greater than the middle element    
            }else{

                //shrink the subarray to narrow down the no. of elements to be checked
                //as the array is sorted, target will be to the right of nums[mid]
                left=mid+1;
            }

        }

        //return the latest index tracked as the last occurrence
        return ans;
    }

    //main logic
    public static void binSearchFLOcc(int[] nums,int left, int right, int target){

        //initialize the first occurrence index
        int fo=binSearchFOcc(nums,left,right,target);

        //initializa the last occurrence index
        int lo=binSearchLOcc(nums,left,right,target);

        //compute the number of occurrences as (lo-fo)+1
        int no_of_occur=(lo-fo)+1;

        //print the original array
        System.out.println("Original Array: "+Arrays.toString(nums));

        //print the indexes
        System.out.println("FO: "+fo+", LO: "+lo);

        //print the exact number of times and positions the target element occurs
        //only if the range and indexes are valid
        if((fo!=-1) && (lo!=-1) && (fo<=lo)){
            System.out.println(target+" occurs "+ no_of_occur+" time(s) from index "+fo+" to index "+lo);
        }else{
            System.out.println("The element was not found.");
        }
    }

    //driver code
    public static void main(String[] args){
        int[] nums={1,2,2,2,4,4,5,6,6,6,8,9,10};
        int target=6;
        binSearchFLOcc(nums,0,nums.length-1,target);
    }
}