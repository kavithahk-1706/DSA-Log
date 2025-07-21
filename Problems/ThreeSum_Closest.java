import java.util.Arrays;

public class ThreeSum_Closest{

    //sorting logic: quickSort
    public static void quickSort(int[] nums, int low, int high){
        if(low<high){
            int point=partition(nums,low,high);
            quickSort(nums, low, point-1);
            quickSort(nums, point+1,high);
        };
    }

    //finding pivot through median-of-three
    public static int findMedian(int nums[], int low, int mid, int high){
        int a=nums[low];
        int b=nums[mid];
        int c=nums[high];

        if((a>b)!=(a>c)) return low;
        else if((b>a)!=(b>c)) return mid;
        else return high;
    }

    //swapping logic
    public static void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    //logic to find the partition point
    public static int partition(int nums[], int low, int high){
        int pivotIndex=findMedian(nums,low,(low+high)/2,high);
        swap(nums,pivotIndex,high);
        int pivotVal=nums[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(nums[j]<pivotVal){
                i++;
                swap(nums,i,j);
            }
            
        }
        swap(nums,i+1,high);
        return i+1;
    }

    //main three sum closest logic
    public static int threeSumClosest(int[] nums, int target){

        //initialize the closest value to target as the highest possible number
        int closest=Integer.MAX_VALUE;

        //sort the array
        quickSort(nums,0,nums.length-1);

        //iterate over a valid range(till nums.length-2 to ensure there's always three elements)
        //the fixed value, the left pointer and the right pointer
        for(int i=0; i<nums.length-2;i++){

            //initialize left pointer
            int left=i+1;

            //initializa right pointer
            int right=nums.length-1;
            
            //iterate as long as left<right
            while(left<right){

                //calculate the current sum
                int curr_sum=nums[i]+nums[left]+nums[right];

                //calculate the current difference between the left and right pointers
                int curr_difference=Math.abs(curr_sum-target);

                //if the current sum is closer to target than the current closest
                if(curr_difference<(Math.abs(closest-target))){
                    //update closest
                    closest=curr_sum;
                }

                //if the current sum is lesser than target
                if(curr_sum<target){

                    //increment the left pointer to increase the sum
                    left++;
                
                //if the current sum is greater than target
                }else if(curr_sum>target){

                    //decrement the right pointer to decrease the sum
                    right--;

                //if the current sum is exactly equal to target
                }else{

                    //return target
                    return target;
                }
                
                
            }
        }

        //return the current value of closest
        return closest;
    }

    //driver code
    public static void main(String[] args){
        int[] nums={2,3,-1,-2,0,-2,4,-6,3};
        System.out.println("Original Array: "+Arrays.toString(nums));
        System.out.println("The closest sum of three numbers for a target of 11 is: "+threeSumClosest(nums,11));


    }
}