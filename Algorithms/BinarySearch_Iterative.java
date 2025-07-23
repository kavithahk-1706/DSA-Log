import java.util.*;

//binary search (iterative) - for sorted arrays only

/*Basic Algorithm:
 * Start with the middle element
 * Depending on how the middle element compares to the target (>,<,=)
 * Shrink the range of elements to be checked by modifying the left and right pointers
 * If at any point the value of mid happens to be the target, return the index mid
 * Else, return -1 at the end of traversal
*/

public class BinarySearch_Iterative {

    //main binary search logic 
    public static int binSearchIter(int[] nums, int left, int right, int target){

        //iterate as long as the range is valid and length>=1
        while(left<=right){

            //compute the middle element's value
            int mid=(left+right)/2;

            //if the target is equal to the middle element's value
            if(target==nums[mid]){

                //return the middle index
                return mid;

            //if the target is less than the middle element's value
            }else if(target<nums[mid]){

                //shift the right pointer to be 1 less than the mid 
                //to narrow/shrink the range of elements down to the left of mid
                //as the array is sorted this reduces the number of elements that need to be checked
                right=mid-1;
            

            //if the target is greater than the middle element's value    
            }else {

                //shift the left pointer to be 1 more than the mid
                //to narrow/shrink the range of elements down to the right of mid
                //as the array is sorted this reduces the number of elements that need to be checked
                left=mid+1;

            }
        }

        //if the element is not found, return -1
        return -1;
    }

    //driver code
    public static void main(String[] args){
        int[] nums={1,2,44,2,11,23,10};
        System.out.println("Array: "+Arrays.toString(nums));
        int target=23;
        int idx=binSearchIter(nums,0,nums.length-1,target);
        if(idx>0){
            System.out.println(target + " is found at position "+idx);
        }else{
            System.out.println(target+" is not found in array");
        }
        
    }   
}
