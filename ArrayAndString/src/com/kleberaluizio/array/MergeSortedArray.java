package com.kleberaluizio.array;

public class MergeSortedArray {
    public static void main(String[] args){

        //Example 1
//        int [] nums1 = {1,2,3,0,0,0};
//        int [] nums2 = {2,5,6};
//        int m = nums1.length-nums2.length;
//        int n = nums2.length;
//        mergeSecond(nums1,3,nums2,3);

        //Example 2
//        int [] nums1 = {1};
//        int [] nums2 = {};
//        int m = nums1.length-nums2.length;
//        int n = nums2.length;
//        merge(nums1,m,nums2,n);

        //Example 3
//        int [] nums1 = {0};
//        int [] nums2 = {1};
//        int m = nums1.length-nums2.length;
//        int n = nums2.length;
//        merge(nums1,m,nums2,n);

        //Example 4
        int [] nums1 = {1,2,3,3,0,0,0,0,0,0};
        int [] nums2 = {2,2,2,3,4,6};
        int m = nums1.length-nums2.length;
        int n = nums2.length;
        mergeSecond(nums1,m,nums2,n);
    }

    public static void merge(int[] numbers1, int m, int[] numbers2, int n) {
        int lengthOfMergeArray = (m + n);

        for (int i = 0; i < lengthOfMergeArray; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers1[i] == 0 && numbers2[j] != 0) {
                    numbers1[i] = numbers2[j];
                    numbers2[j] = 0;
                } else if (numbers2[j] < numbers1[i] && numbers2[j] != 0) {
                    int a = numbers1[i];
                    numbers1[i] = numbers2[j];
                    numbers2[j] = a;
                }
            }

        }
        for (int j : numbers1) {
            System.out.println(j);
        }
    }

    public static void mergeSecond(int[] numbers1, int m, int[] numbers2, int n) {
        int lengthOfMergeArray = (m + n)-1;
        m = m-1;
        n = n -1;

        for(int i = 0; i < (n+1); i++){
            if(numbers1[m] <= numbers2[n-i]){
                numbers1[lengthOfMergeArray-i] = numbers2[n-i];
            } else {
                int a = numbers1[m];
                numbers1[m] = numbers2[n-i];
                numbers1[lengthOfMergeArray-i] = a;
                m--;
            }
        }
        for (int j : numbers1) {
            System.out.println(j);
        }
    }
}
