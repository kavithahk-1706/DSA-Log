import java.util.*;

public class ThreeSum_MergeSort{
    //sorting logic: mergeSort

    //main mergeSort function
    public static void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid=(low+high)/2;
            
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    //merge logic
    public static void merge(int[] arr, int low, int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0; i<n1;i++){
            L[i]=arr[low+i];
        }

        for(int j=0; j<n2;j++){
            R[j]=arr[mid+1+j];
        }

        int i=0, j=0;
        int k=low;


        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }

    }

    //return an array of lists for threeSum's main function
    public static ArrayList<List<Integer>> threeSum(int[] arr){
        //initialise array of lists
        ArrayList<List<Integer>> triplets=new ArrayList<>();

        //sort the array
        mergeSort(arr,0,arr.length-1);
        
        //iterate over the valid range so that there's at least two elements after i for the pointers
        for(int i=0;i<arr.length-2;i++){

            //skip over the duplicates of i
            if(i>0 && arr[i]==arr[i-1]) continue;

            //initialise left pointer
            int left=i+1;

            //initialise right pointer
            int right=arr.length-1;

            //while the range is valid
            while(left<right){

                //compute the sum as the elements at i, left and right
                int sum=arr[i]+arr[left]+arr[right];

                //if the sum is 0
                if(sum==0){

                    //add the elements as a list to the array of lists
                    triplets.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    //increment left pointer
                    left++;

                    //decrement right pointer
                    right--;

                    //skip over duplicates for the left pointer
                    while(left<right && arr[left]==arr[left-1]) left++;

                    //skip over duplicates for the right pointer
                    while(left<right && arr[right]==arr[right+1]) right--;
                }
                //if the sum is greater than 0, it means the right pointer is pointing
                // to a number larger than necessary
                else if(sum>0){
                    //decrement the right pointer to decrease the value of the element
                    right--;
                //if the sum is less than 0, it means the left pointer is pointing
                // to a number lesser than necessary
                }else{
                    //increment the left pointer to increase the value of the element
                    left++;
                }
            }
            
    
        }

        //return the array of lists
        return triplets;
    }

    //driver code
    public static void main(String[] args){
        int[] nums={2,3,-1,-2,0,-2,4,-6,3};
        System.out.println("Original Array: "+Arrays.toString(nums));
        mergeSort(nums,0,nums.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(nums));
        System.out.println("Triplets: "+threeSum(nums));

    }

}