import java.util.Arrays;

/*Problem Statement:
 * Given a sorted array, remove duplicates in place and return the length of the array without it.
 * The elements beyond this index do not matter, as long as before the index the elements are sorted and have no duplicates.
 */

/*Basic Algorithm:
 * Use two pointers, one for traversing and one for storing the positions
 * that need to be overwritten
 * Traverse from 1 to end as the first element isn't a duplicate
 * If at any point the current element is not equal to the previous element, the current element is unique
 * So it needs to be copied into the duplicate's position, stored at overwrite_index
 * Sometimes if both pointers are equal, the element will overwrite itself
 * But this doesn't affect the rest of the algorithm
 * When duplicates actually exist, the overwrite_index is not incremented
 * This will ensure that these duplicates are overwritten as well.
 * At the end of the traversal, the overwrite_index will store the number of elements which are unique
 * As all the elements before it are free of duplicates
 * So return overwrite_index
 */

public class Remove_Duplicates_Sorted{

    //main removing duplicates function
    public static int remove_duplicates_sorted(int[] nums){

        //specify a pointer to keep track of 
        //indices that need to be overwritten
        int overwrite_index=1;

        //another pointer is used in the for loop 
        //to traverse the array
        for(int read_index=1; read_index<nums.length;read_index++){

            //if the traversal pointer encounters a unique element
            //(current index not equal to previous in a sorted array)
            if(nums[read_index]!=nums[read_index-1]){

                //overwrite the current duplicate value at overwrite_index
                //with the first unique element encountered through read_index
                nums[overwrite_index]=nums[read_index];

                //increment overwrite_index
                overwrite_index++;
            }
        }

        //as we increment overwrite_index every time we overwrite
        //a duplicate with a unique element, its value
        //will give us the number of unique elements in the array
        return overwrite_index;
    }

    //driver code
    public static void main(String[] args){
        int[] nums={1,2,4,4,5,5,7,7,8,10,11,11};
        System.out.println("Original Array: "+Arrays.toString(nums));

        int no_of_unique=remove_duplicates_sorted(nums);

        int[] unique_nums=Arrays.copyOf(nums,no_of_unique);
        System.out.println("Array with removed duplicates: "+Arrays.toString(unique_nums));
        System.out.println("Total no. of elements in array: "+nums.length);
        System.out.println("No. of unique elements in the array: "+no_of_unique);
    }
}