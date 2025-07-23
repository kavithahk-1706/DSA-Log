import java.util.*;

//binary search (recursive) - for sorted arrays only

/*Basic Algorithm:
 * Start with the middle element
 * Depending on how the middle element compares to the target (>,<,=)
 * Shrink the range of elements to be checked by recursively calling the function wi a left/right subarray
 * If at any point the value of mid happens to be the target, return the index mid
 * Else, return -1 at the end of traversal
*/

public class BinarySearch_Recursive {
    //main binary search logic 
    public static int binSearchRecur(int[] nums, int left, int right, int target){

        //recursively call as long as the array is non-empty
        if(left<=right){

            //compute the mid value
            int mid=(left+right)/2;

            //if the target element is equal to the middle element
            if(target==nums[mid]){

                //return the middle index
                return mid;

            //if the target is less than the middle element
            }else if(target<nums[mid]){

                //recursively call the same binary search function for the lesser half
                //as the array is sorted this narrows down the no. of elements to be searched
                return binSearchRecur(nums,left,mid,target);

            //if the target is greater than the middle element
            }else {

                //recursively call the binary search function for the greater half
                //as the array is sorted this narrows down the no. of elements to be searched
                return binSearchRecur(nums,mid+1,right,target);

            }
        }

        //if the element is not found return -1
        return -1;
    }

    //driver code
    public static void main(String[] args){
        int[] nums={1,2,44,2,11,23,10};
        System.out.println("Array: "+Arrays.toString(nums));
        int target=23;
        int idx=binSearchRecur(nums,0,nums.length-1,target);
        if(idx>0){
            System.out.println(target + " is found at position "+idx);
        }else{
            System.out.println(target+" is not found in array");
        }
        
    }   
}
