import java.util.*;
public class BubbleSortRecurstion{
    public static void main(String [] args){
        int [] arr = {4,1,3,2};
        sorting(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int [] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = ar[c+1];
                arr[c+1] = temp;
            }
            sorting(arr, r, c+1);
        }
        else{
            sorting(arr, r-1, 0);
        }
    }
}