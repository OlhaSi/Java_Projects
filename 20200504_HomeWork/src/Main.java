import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] numbers = {1,3,3,5,7,7,9,9,9,9};
        //printRepeatNumber(numbers);

//        changeNumberToEven(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        printRepeatedNums(numbers);
//        System.out.println();
//        int[] numbers2 = getOddArray(numbers);
//        for (int num:numbers2) {
//            System.out.print(num + " ");
//        }

        //printRepeatNumber2(numbers);

        char[] chars = {'a', 'a', 'a', 'b', 'b', 'c', 'w', 'w', 'w', 'w'};
        printRepeatedChars(chars);

        System.out.println(getRepeatedChars(chars));


//        int [] numbers2 = getSwipedArray(numbers);
//
//        for (int num:numbers2) {
//            System.out.print(num + " ");
//        }

        ///////////////

//        int[] nums ={2,4,5,6,9};
//        System.out.println(Arrays.toString(nums));
//        int[] nums2 = changeArray(nums);
//        System.out.println(Arrays.toString(nums2));
//

    }

    private static String getRepeatChars(String input) {
        StringBuffer fin = new StringBuffer();
        fin.append(input.charAt(0));
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i-1) == input.charAt(i)) {
                count++;
            } else {
                fin.append(count).append(input.charAt(i));
                count = 1;
            }
        }
        fin.append(count);
        return fin.toString();
    }

    private static String getRepeatedChars(String input){
        int count = 1;
        String res = input.charAt(0) + "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i-1) == input.charAt(i))
                count++;
            else {
                res = res + count + " " + input.charAt(i);
            }
        }
        res = res + count;
        return  res;
    }

    // home work 11.05.2020

    private static void printRepeatedChars(char[] chars){
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if(chars.length-1 == chars[i]){
                count++;
            } else{
                if(count > 1){
                    System.out.println(chars[i-1] + "\t" + count + " times");
                    count = 1;
                }
            }
        } if(count > 1)
            System.out.println(chars[chars.length -1] + "\t" + count + " times");
    }

    private static String getRepeatedChars(char[] chars){
        //String str = String.valueOf(chars);
        String result = "";

        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i-1] == chars[i]){
                count++;
            }else{
                if(count >= 1){
                    result = result + chars[i-1] + count;
                    count = 1;
                }
            }
        }if(count > 1)
            result = result + chars[chars.length - 1] + count;
        //System.out.println(chars[chars.length-1] + "\t" + count + " times");

        return result;
    }

    private static void printRepeatNumber(int[] numbers){
        boolean[] checkArray = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(checkArray[i]){
                continue;
            }
            int count = 0;
            for (int j = i; j < numbers.length; j++) {
                if(numbers[j] == numbers[i]){
                    checkArray[j] = true;
                    count++;
                }
            }
            if(count > 1){
                while (count > 0){
                    System.out.print(numbers[i] +" ");
                    count--;
                }
            }
        }
    }

    private static void printRepeatNumber2(int[] numbers){
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] == numbers[i]){
                count++;
            }else{
                if(count > 1){
                    System.out.println(numbers[i-1] + "\t" + count + " times");
                    count = 1;
                }
            }
        }
        if(count > 1)
            System.out.println(numbers[numbers.length - 1] + "\t" + count + " times");
    }


    public static void printRepeatedNums(int[] numbers){
        System.out.println("Repeated numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    System.out.print(numbers[i] + ", ");
                }
            }
        }
    }

    private static void changeNumberToEven(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                numbers[i]++;
            }
        }
    }

    public static int[] getOddArray(int[] numbers){
        int[] oddArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
           oddArray[i] = numbers[i] + 1;
        }
        return oddArray;
    }


    public static int[] getSwipedArray(int[] numbers){
        int[] swiped = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            swiped[i] = numbers[i];
            swiped[0] = numbers[numbers.length -1];
            swiped[numbers.length -1] = numbers[0];
        }
        return swiped;
    }

    ////////////////

    private static  int[] changeArray(int[] nums){
        int[] newNumArray = new int[nums.length];
        newNumArray[0] = nums[nums.length-1];
        newNumArray[nums.length-1] = nums[0];
        for (int i = 1; i <nums.length-1 ; i++) {
            newNumArray[i] = nums[i];
        }
        return newNumArray;
    }

    private static void changeArray2(int[] numbers){
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = temp;
    }
}
