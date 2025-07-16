import java.util.Arrays;

public class MergeSortAlg{

    public static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int lsize=mid-left+1;
        int rsize=right-mid;

        int[] L= new int[lsize];
        int[] R=new int[rsize];

        for(int i=0;i<lsize;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<rsize;j++){
            R[j]=arr[mid+1+j];
        }

        int i=0, j=0, k=left;

        while(i<lsize && j<rsize){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i+=1;
            }
            else{
                arr[k]=R[j];
                j+=1;
            }
            k+=1;
        }

        while(i<lsize){
            arr[k]=L[i];
            i+=1;
            k+=1;
        }   

        while(j<rsize){
            arr[k]=R[j];
            j+=1;
            k+=1;
        }

    }

    public static void main(String[] args){
        int[] arr={43,44,22,1,23,33,55,6,33,24,65};
        System.out.println("Original Array: "+Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        
    }
}