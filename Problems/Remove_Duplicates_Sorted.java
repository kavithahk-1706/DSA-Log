import java.util.Arrays;

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
                nums[overwrite_index]=nums[read_index];
                overwrite_index++;
            }
        }
        return overwrite_index;
    }

    public static void main(String[] args){
        int[] nums={1,2,2,4,5,5,7,7,8,10,11,11};
        System.out.println("Original Array: "+Arrays.toString(nums));

        int no_of_unique=remove_duplicates_sorted(nums);

        int[] unique_nums=Arrays.copyOf(nums,no_of_unique);
        System.out.println("Array with removed duplicates: "+Arrays.toString(unique_nums));
        System.out.println("Total no. of elements in array: "+nums.length);
        System.out.println("No. of unique elements in the array: "+no_of_unique);
    }
}