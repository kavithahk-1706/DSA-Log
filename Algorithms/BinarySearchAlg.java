import java.util.Arrays;
import java.util.ArrayList;

public class BinarySearchAlg{

    public static ArrayList<Integer> binarySearch(ArrayList<Integer> arr, int l, int r, int k){

        //Track indexes in an ArrayList
        ArrayList<Integer> indexes=new ArrayList<>();
        //as long as the left pointer is before the right pointer
        if(l<r){
            //define midpoint to divide the array recursively
            int mid=(l+r)/2;
            if(k==arr.get(mid)){ //use get for ArrayList instead of []
                indexes.add(mid); //use add for ArrayList instead of []
                int i=mid-1; //check for the same element at indices before mid
                while(i>=0 && arr.get(i)==k){
                    indexes.add(i);
                    i--;
                }
                int j=mid+1; //check for the same element at indices after mid
                while(j<arr.size() && arr.get(i)==k){
                    indexes.add(j);
                    j++;
                }
                
            }else if(k<arr.get(mid)){ //if mid is greater than required element
                return binarySearch(arr,l,mid,k); //recursively call the function to the left
            }else{ //if mid is less than required element
                return binarySearch(arr,mid+1,r,k); //recursively call the function to the right
            }
        } 
        return indexes; //return ArrayList of indexes   
        }
    


    public static void main(String[] args){
   
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,2,2,2,3,4,4,4,5,6,12,12,56,56,77,77));
        System.out.println("Original Array: "+ arr);
        int element=2;
        ArrayList<Integer> indexes=binarySearch(arr,0,arr.size()-1,element);
        if(indexes.size()==0){
            System.out.println(element+" not found in array.");
        }else{
            System.out.println(element+" found at "+indexes+" position(s).");
        }
    }
}