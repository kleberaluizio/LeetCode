package com.kleberaluizio.array;

import java.util.HashMap;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
    int[] nums = {1,2,3,1};
    int[] nums1 = {1,2,3,4};
    int[] nums2 = {1,1,1,3,3,4,3,2,4,2};

    System.out.println(containsDuplicate(nums));
    System.out.println(containsDuplicate(nums1));
    System.out.println(containsDuplicate(nums2));

    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicate1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
