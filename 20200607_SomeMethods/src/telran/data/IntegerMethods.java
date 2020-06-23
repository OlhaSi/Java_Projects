package telran.data;

import java.util.Arrays;

public class IntegerMethods {

    public static void main(String[] args) {

        int[] numbers = {1,3,5,7,3};
        System.out.println(Arrays.toString(shiftLeft(numbers)));

        int [] a = {3,4,5,6};
        int [] b = {3,2,2,1,0};

        System.out.println(isCommonFirstOrLastElement(a,b));

        int[] nums = new int[10];
        System.out.println(Arrays.toString(nums));
        fillArrayWith0And1(nums);
        System.out.println(Arrays.toString(nums));

        int[ ] arr = new int[5];
        fillArray1(3,2, arr);
        System.out.println(Arrays.toString(arr));

        int[] array = {0, 1, 0};
        System.out.println(Arrays.toString(zeroMax(array)));

    }

    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                int max = 0;
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] % 2 != 0 && nums[j] > max){
                        max = nums[j];
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }

    public static void fillArray1(int n, int a, int[]arr){
        arr[0] = n;
        for (int i = 1; i < arr.length; i++) {
             arr[i] = arr[i - 1] + a;
        }
    }

    public static void fillArrayWith0And1(int arr[]) {
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 1;
        }
    }

    public static int[] shiftLeft(int[] nums){
        if(nums.length <= 1){
            return nums;
        }
        int[] res = new int[nums.length];
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            res[i] = nums[i + 1];
        }
        res[nums.length - 1] = temp;

        return res;
    }

    public static boolean isCommonFirstOrLastElement(int[] a, int[] b){
        return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
    }
}
