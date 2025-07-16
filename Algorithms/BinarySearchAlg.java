import java.util.Arrays;
import java.util.ArrayList;

public class BinarySearchAlg{

    public static ArrayList<Integer> binarySearch(ArrayList<Integer> arr, int l, int r, int k){
        ArrayList<Integer> indexes=new ArrayList<>();
        if(l<r){
            int mid=(l+r)/2;
            if(k==arr.get(mid)){
                indexes.add(mid);
                int i=mid-1;
                while(i>=0 && arr.get(i)==k){
                    indexes.add(i);
                    i--;
                }
                int j=mid+1;
                while(j<arr.size() && arr.get(i)==k){
                    indexes.add(j);
                    j++;
                }
                
            }else if(k<arr.get(mid)){
                return binarySearch(arr,l,mid,k);
            }else{
                return binarySearch(arr,mid+1,r,k);
            }
        } 
        return indexes;          
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