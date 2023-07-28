public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,0,2,3,0,4,5,0};
//        int[] arr = {1,2,3};
          int[] arr = {2,5,1,3,4,7};


        suffle(arr, 3);


    }

    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int j = arr.length - 1;
                while (i < j) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                i++;
            }
        }
    }

    public static int[] suffle(int [] nums, int n ){
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++){
            x[i] = nums[i];
            y[i] = nums[i+n];
        }
        int a = 0;
        int b = 0;

        for(int i = 0; i < 2*n; i++){
            if(i%2 == 0){
                nums[i] = x[a];
                a++;
            } else {
                nums[i] = y[b];
                b++;
            }
        }

        for (int i : nums) {
            System.out.println(i);
        }
        System.out.println("---");
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println("---");

        for (int i : y) {
            System.out.println(i);
        }
        return nums;
    }
}