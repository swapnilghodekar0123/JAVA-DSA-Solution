import java.util.*;
class ProductOfArray{
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        int [] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] prefix = new int [nums.length];
        prefix[0] = 1;
        int [] suffix = new int[nums.length];
        suffix[suffix.length-1]=1;
        for(int i=1; i<nums.length; i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }
        for(int i=suffix.length-2; i>=0; i--){
            suffix[i] = nums[i+1] * suffix[i+1];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = prefix[i]*suffix[i];
        }

        return nums;
    }
}