package com.kleberaluizio.array;

public class RunningSumOf1dArray_1480 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);

        for (int num : nums) {
            System.out.print(num + " ");

        }
    }
    public static int[] runningSum(int[] nums){
        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(i==0){
                output[i] = nums[i];
            }else{
                for(int j = i; j >= 0 ; j--){
                    output[i] = output[i] + nums[j];
                }
            }
        }
        return output;
    }
}
