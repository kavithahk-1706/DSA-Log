import java.util.*;

public class ThreeSum_QuickSort {
    //sorting logic: using quickSort

    //main quickSort function
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int point=partition(arr,low,high);
            quickSort(arr,low,point-1);
            quickSort(arr,point+1,high);
        }
    }

    //finding pivot through median-of-three
    public static int findMedian(int[] arr, int low, int mid, int high){
        int a=arr[low];
        int b=arr[mid];
        int c=arr[high];

        if((a>b)!=(a>c)) return low;
        else if((b>a)!=(b>c)) return mid;
        else return high;
    }

    //swapping logic
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //partition logic
    public static int partition(int[] arr, int low, int high){
        int pivotIndex=findMedian(arr,low,(low+high)/2,high);
        swap(arr,pivotIndex,high);
        int pivotVal=arr[high];

        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivotVal){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
        
    }

    //main threeSum logic - return an array of lists
    public static ArrayList<List<Integer>> threeSum(int[] arr){

        //initialise the array of lists to be returned
        ArrayList<List<Integer>> triplets=new ArrayList<>();

        //sort the array given
        quickSort(arr,0,arr.length-1);

        //iterate over the valid range (until i=arr.length-3) for the fixed number arr[i]
        //to maintain a valid window for left and right
        //because you need to have at least 3 elements remaining at each point after
        for(int i=0; i<arr.length-2;i++){

            //skip over duplicates of the fixed element arr[i]
            if(i>0 && arr[i]==arr[i-1]) continue;

            //left pointer points to the element after arr[i]
            int left=i+1;

            //right pointer points to the last element
            int right=arr.length-1;

            //while the range is valid (left to right)
            while(left<right){

                //compute the sum of the fixed element and the elements at the pointers
                int sum=arr[i]+arr[left]+arr[right];

                //if the sum is 0
                if(sum==0){

                    //add the three elements to the array of arrays
                    triplets.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    //move the left pointer to the right
                    left++;

                    //move the right pointer to the left
                    right--;

                    //skip over duplicates of the left pointer's element, if any
                    //if the left pointer points to the same element as the one to its left (arr[left-1]),
                    //increase the left pointer to prevent another duplicate triplet
                    while(left<right && arr[left]==arr[left-1]) left++;

                    //skip over duplicates of the right pointer's element, if any
                    //if the right pointer points to the same element as the one to its right (arr[right+1]),
                    //decrease the right pointer to prevent another duplicate triplet
                    while(left<right && arr[right]==arr[right+1]) right--;

                //if the sum>0, the sum is too big
                }else if(sum>0){
                    //to to decrease it we decrease the right pointer
                    //since the right pointer is pointing to a larger element than necessary
                    right--;

                //if the sum<0, the sum is too small
                }else{
                    //to increase it we increase the left pointer
                    //since the left pointer is pointing to a smaller element than necessary
                    left++;
                }
            }
        }
        //return the final array of lists
        return triplets;
    }

    //driver code
    public static void main(String[] args){
       int[] arr={-2,0,1,1,-2,2,4,3,-3};
       System.out.println("Original Array: "+Arrays.toString(arr));
       quickSort(arr,0,arr.length-1);
       System.out.println("Sorted Array: "+Arrays.toString(arr));
       System.out.println("Triplets returning sum 0: "+threeSum(arr));
    }

}
