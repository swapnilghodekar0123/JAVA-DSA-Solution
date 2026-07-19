// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class QuickSort {
    public static void main(String[] args) {
        int [] arr = {7,5,2,1,3,4,6};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr, int low, int high){
        if(low>=high){
            return;
        }
        
        int start = low;
        int end = high;
        int mid = start+(end-start)/2;
        int pivote = arr[mid];
        
        while(start<=end){
            
            while(arr[start]<pivote){
                start++;
            }
            while(arr[end]>pivote){
                end--;
            }
            
            if(start<=end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
            
        }
        
        sort(arr, low, end);
        sort(arr, start, high);
    }
}