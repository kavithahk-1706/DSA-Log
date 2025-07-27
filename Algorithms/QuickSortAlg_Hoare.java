import java.util.*;

/*Basic Algorithm:
 * Pick a pivot element
 * Use two pointers, one for traversing from the left (i) and the other from right (j)
 * Traverse as long as the range is valid, i.e, while(i<j)
 * If any element at i>=pivot or any element at j<=pivot, it means it's not where it's supposed to be
 * So while the range is still valid, swap the two elements
 * Once the range becomes invalid, i.e, i==j or i>j, return right as the point of partition
 * Recursively call quickSort for the left sub array and the right sub array INCLUDING point of partition
 * Continue the recursion until the base case is hit, i.e., the number of elements is 1
 */

 public class QuickSortAlg_Hoare{

    //main quicksort logic
    public static void quickSort(int[] nums, int left, int right){

        //continue recursive calls until there's one element left in each sub array
        if(left<right){

            //compute the point of partition
            int point=partition(nums, left,right);

            //include it in one of the recursive calls unlike Lomuto's method
            quickSort(nums,left,point); //left recursive call
            quickSort(nums,point+1,right); //right recursive call

        }
    }

    //median logic
    public static int findMedian(int[] nums, int left, int mid, int right){
        int a=nums[left];
        int b=nums[mid];
        int c=nums[right];

        if((a>b)!=(a>c)) return left;
        if((b>c)!=(b>a)) return mid;
        else return right;
    }

    //swapping logic
    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    //partition logic
    public static int partition(int[] nums, int left, int right){

        //find the pivot using median-of-three
        int pivot=findMedian(nums,left,(left+right)/2,right);

        //move it to the beginning so that it doesn't mess with the traversal
        swap(nums,left,pivot);

        //find the pivot index's value
        int pivotVal=nums[left];
        
        //initialize left and right pointers for traversal
        int i=left-1;
        int j=right+1;

        //iterate as long as the range is valid (i<j)
        while(true){

            //use a dowhile loop to traverse from the left
            //to make sure the pointer is increased at least once
            //to avoid infinite recursion 
            //caused by the same range being returned in the main function
            do{

                //continue traversal as long as the element at i is less than the pivot
                i++;

            //if it's not, then it exists out of the loop after executing at least once
            }while(nums[i]<pivotVal);

            //use a dowhile loop to traverse from the right
            //to make sure the pointer is decreased at least once
            //to avoid infinite recursion 
            //caused by the same range being returned in the main function            
            do{

                //continue traversal as long as the element at j is greater than the pivot
                j--;

            //if it's not, then it exists out of the loop after executing at least once
            }while(nums[j]>pivotVal);

            //if at any point the range is invalid, return j as the point of partition
            if(i>=j) return j;

            //if the elements at i and j are not where they're supposed to be
            // i.e, nums[i]>=pivotVal or nums[j]<=pivotVal,
            //swap them to bring them back to their right places
            swap(nums,i,j);

        }

    }

    //driver code
    public static void main(String[] args){
        int[] arr={20,30,10,50,33,40};
        System.out.println("Original Array: "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
 }