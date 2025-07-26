import java.util.Arrays;

/*Basic Algorithm:
 * Pick a pivot element (usually the last element)
 * If the pivot is not the last element, swap it with the last element and traverse from low to high-1
 * Use two pointers, one for traversing 
 * And the other to keep track of elements that should be to the left of the pivot
 * Every time an element is less than the pivot, increment i and swap the element's position with i
 * At the end of all the swapping, swap the pivot at the end with the element at i+1 to return pivot to its original position
 * Return i+1 as the point of partition
 * Recursively call quickSort for the left sub array and the right sub array EXCLUDING point of partition
 * Continue the recursion until the base case is hit, i.e., the number of elements is 1
 */

public class QuickSortAlg_Lomuto{

    //main sorting function
    public static void quickSort(int[] arr,int low,int high){

        //as long as the number of elements > 1
        if(low<high){ 

            //returns the partition point to divide the array (NOT INCLUDED IN RECURSIVE CALLS)
            int point=partition(arr,low,high); 

            //recursively call for left side
            quickSort(arr,low,point-1);

            //recursively call for right side
            quickSort(arr,point+1,high);
        }
    }

    //swapping logic
    public static void swap(int[] arr,int i, int j){

        //temporary variable
        int temp=arr[i];

        //swap 
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //finding the pivot through median-of-three
    public static int findMedian(int[] arr,int left, int right, int mid){

        //initialize the values at left, mid and right indices
        int a=arr[left];
        int b=arr[right];
        int c=arr[mid];

        //logic to return the middle value's index
        if((a>b) != (a>c)) return left;
        else if((b>a) != (b>c)) return right;
        else return mid;
    }

    //partition function
    public static int partition(int[] arr, int low, int high){

        //find the pivotIndex
        int pivotIndex=findMedian(arr,low,high,(low+high)/2);

        //send it to the end of the array to avoid iterating over the pivot
        swap(arr,high,pivotIndex);

        //find the value of pivotIndex (now at high)
        int pivotVal=arr[high];

        //initialize i as low-1 (before the array starts)
        int i=low-1;

        //traverse through the array until the second last element, as arr[high] is the pivot
        //and we don't want to include it in our traversal
        for(int j=low;j<high;j++){

            //if an element is less than the pivot's value 
            //then increment i and swap arr[i] with current element
            //this makes sure all elements < pivotValue are to its left
            if(arr[j]<=pivotVal){
                i++;
                swap(arr,i,j);
            }

        }

        //bring the pivot to its actual position
        // so that all values to pivot's left are less than it
        // and all values to its right are greater
        swap(arr,i+1,high);

        //return the index which serves as the element of partition
        return i+1;
    }

    //driver code
    public static void main(String[] args){
        int[] arr={20,30,10,50,33,40};
        System.out.println("Original Array: "+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}