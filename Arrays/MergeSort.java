
import java.util.*;
class mergeSort {
    public static void main(String[] args) {
        int [] arr = {7,5,2,1,3,4,6};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int [] arr, int start, int end){
        if(start>=end){
            return ;
        }
        int mid = start+(end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        
        sort(arr, start, mid, end);
    }
    static void sort(int [] arr, int start, int mid, int end){
            int [] mix = new int[end-start+1];
            int i = start;
            int j = mid+1;
            int k = 0;
            while(i<=mid && j<=end){
                if(arr[i]>arr[j]){
                    mix[k++] = arr[j];
                    j++;
                }
                else{
                    mix[k++] = arr[i];
                    i++;
                }
            }
            while(i<=mid){
                mix[k++] = arr[i];
                i++;
            }
            while(j<=end){
                mix[k++] = arr[j];
                j++;
            }
            
            for(int m=0; m<mix.length; m++){
                arr[start+m] = mix[m];
            }
            
    }
}