import java.util.Arrays;

/*Basic Algorithm:
 * Use two functions, mergeSort and merge
 * To handle the dividing and merging parts of the technique reespectively
 * The mergeSort function recursively alls itself for the left and right halves of the array
 * Each half is recursively divided into subsequent halves until there is one element left
 * Then the merge function is executed to merge the two subarrays obtained at every level after comparing elements
 * Temp arrays are used to store the left and right sorted subarrays, but the final array is sorted in the same variable
 * Since we're using auxiliary space, it is not inplace
 */

public class MergeSortAlg{

    //main mergeSort function
    public static void mergeSort(int[] arr, int left, int right){

        //recursively call until there is one element, as one element is already sorted
        if(left<right){

            //compute the middle element to divide the array based on it
            int mid=(left+right)/2;

            //recursively call mergeSort for the left subarray
            //passing the original array by reference
            mergeSort(arr,left,mid);

            //recursively call mergeSort for the right subarray
            //passing the original array by reference
            mergeSort(arr,mid+1,right);

            //call the merge function to merge the sorted subarrays obtained in above two function calls (in place)
            //passing the original array by reference
            merge(arr,left,mid,right);
        }
    }

    //merge logic
    public static void merge(int[] arr, int left, int mid, int right){
        
        //define the size of the left temp subarray
        //(add 1 as the indexes are 0 based)
        int lsize=mid-left+1;

        //define the size of the right temp subarray
        int rsize=right-mid;

        //initializa the left temp subarray
        int[] L= new int[lsize];

        //initializa the right temp subarray
        int[] R=new int[rsize];

        //iterate over the range of elements of the left subarray (from original array)
        for(int i=0;i<lsize;i++){

            //append elements of the left subarray's range to L (from the original array)
            L[i]=arr[left+i];

        }
    
        //iterate over the range of elements of the right subarray (from original array)
        for(int j=0;j<rsize;j++){

            //append elements of the left subarray's range to L (from the original array)
            R[j]=arr[mid+1+j];
        }

        //initialise pointers for the left, right subarrays, and the original array respectively
        int i=0, j=0, k=left;

        //compare corresponding elements from left and right subarrays
        while(i<lsize && j<rsize){

            //if the element from the left subarray is smaller
            if(L[i]<=R[j]){

                //modify the array to store L[i]
                arr[k]=L[i];

                //increment the left subarray's pointer
                i+=1;
            }

            //if the right subarray's element is lesser
            else{

                //modify the array to store R[j] at that index
                arr[k]=R[j];

                //increment the right subarray pointer
                j+=1;
            }

            //increment the original array's pointer
            k+=1;
        }

        //copy remaining elements of the left subarray to the original array
        //(the elements remaining after corresponding comparison)
        while(i<lsize){
            arr[k]=L[i];
            i+=1;
            k+=1;
        }   

        //copy remaining elements of the right subarray to the original array
        //(the elements remaining after corresponding comparison)
        while(j<rsize){
            arr[k]=R[j];
            j+=1;
            k+=1;
        }

    }

    //driver code
    public static void main(String[] args){
        int[] arr={43,44,22,1,23,33,55,6,33,24,65};
        System.out.println("Original Array: "+Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        
    }
}