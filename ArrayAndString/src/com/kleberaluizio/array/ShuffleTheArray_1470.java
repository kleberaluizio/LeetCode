package com.kleberaluizio.array;

import java.util.Arrays;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        shuffle(nums, n);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static int[] shuffle(int[] nums, int n) {


        int[] arr = Arrays.copyOf(nums,nums.length);
        int a = 0;

        for(int i = 0; i < nums.length; i+=2){
            nums[i] = arr[a];
            nums[i+1] = arr[n];
            a++;
            n++;
        }
        return nums;
    }
}
