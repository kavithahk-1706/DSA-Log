import java.util.*;

/*Basic Algorithm
 * Use two pointers, one for traversal (i) and one for keeping track of where to overwrite (j).
 * Traverse the array.
 * If current element is not the value to be removed, overwrite with this value at the index where the value is present.
 * Increment both pointers.
 * Return j as it now stores the number of elements which aren't equal to the value specified.
 * This method preserves the order of elements in the array.
 */

public class Remove_Element_Unsorted {
    
    public static int removeElement(int[] nums, int val) {
        //initialize two pointers, one for traversal (i) and one for keeping track of elements to be overwritten (j)
        int i=0, j=0;

        //traverse the array
        while(i<nums.length){
            //if an element is not equal to the value
            if(nums[i]!=val){

                //overwrite it at the place where value is currently present(j)
                nums[j]=nums[i]; 

                //increment j to check the next position
                j++;
            }
            i++;
        }

        //j stores the number of non-val elements, so return it
        return j;
    }

    //driver code
    public static void main(String[] args){
        int[] nums={1,5,3,5,7,2,5,9,10,5};
        int val=5;
        System.out.println("Original Array: "+Arrays.toString(nums));

        int no_of_non_val=removeElement(nums,val);

        int[] non_val_nums=Arrays.copyOf(nums,no_of_non_val);
        System.out.println("Array without "+val+": "+Arrays.toString(non_val_nums));
        System.out.println("Total no. of elements in array: "+nums.length);
        System.out.println("No. of elements in the array excluding "+val+": "+no_of_non_val);
    }
}