public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[20];
        fillArray(numbers);
        printArray(numbers);
        System.out.println();
        /*int evenNumber = evenCount(numbers);
        System.out.println(evenNumber);*/
        System.out.println(evenCount(numbers));
        System.out.println(oddCount(numbers));
        evenCountArray(numbers);
        oddCountArray(numbers);

        System.out.println();

        int[] nums = {1,3,5,8,9};
        System.out.println("************");
        printArray(nums);
        System.out.print("-> ");

        int [] reversedNums = reverseArray(nums);
        printArray(reversedNums);
        System.out.println();

        System.out.print("next variant -> ");
        int [] numbers2 = reverseArray2(nums);
        printArray(numbers2);

        System.out.println();
        int [] numbers3 = {0,3,5,7,4,2,1};
        printArray(numbers3);
        System.out.println();
        int sum = findMissNumber(numbers3);
        System.out.println(sum);

        printOddNum(17);

        printOddNumbers(13);


    }

    public static void fillArray(int[] numbers){
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (int) (10 + Math.random() * (50 - 10 + 1));
        }

    }

   /* public static void fillArray2(int[] numbers){
        int i=0;
        for (int num:numbers) {
            num = (int) (10 + Math.random() * (50 - 10 + 1));
            numbers[i++] = num;
        }
    }*/

   public static void printArray(int[] numbers){
       for (int num:numbers) {
           System.out.print(num + " ");
       }
   }

   public static int evenCount(int[] numbers){
       int count =0;
       for(int num:numbers){
           if(num%2==0)
               count++;
       }
       return count;
   }

   public static int oddCount(int[] numbers){
       return numbers.length - evenCount(numbers);
   }

   public static void evenCountArray(int[] numbers){
       System.out.println("Even Numbers");
       for (int num:numbers) {
            if(num%2==0){
                System.out.print(num + " ");
            }
       }
       System.out.println();
   }

    public static void oddCountArray(int[] numbers){
        System.out.println("Odd Numbers");
        for (int num:numbers) {
            if(num%2!=0){
                System.out.print(num + " ");
            }
        }
    }

    public static int[]reverseArray(int[] nums) {
       int [] numbers = new int[nums.length];
        for (int i = nums.length-1, j=0; i >= 0; i--, j++) {
           numbers[j] = nums[i];
        }
        return numbers;
    }

    public static int[] reverseArray2(int[] nums) {
        int [] numbers2 = new int[nums.length];
        for (int i = nums.length-1; i >=0 ; i--) {
            numbers2 [nums.length - i - 1] = nums[i];
        }
        return numbers2;
    }

    public static int findMissNumber(int [] numbers3){
       int sum = 0, sumI = 0;
        for (int i = 0; i < numbers3.length; i++) {
            sum+=numbers3[i];
            sumI+=(i+1);
        }
        return sumI-sum;
    }

    public static int findMissNum(int [] numbers3){
        int sum = 0, sumI = 0, i = 0;
        while (i < numbers3.length){
            sum += numbers3[i];
            sumI += (i+1);
            i++;
        }
        return sumI-sum;
    }

    public static void printOddNum(int num){
        for (int i = 0; i <= num; i++) {
            if(i%2!=0);
        }
        System.out.println(num);
    }

    public static void printOddNumbers(int num){
       int i = 0;
       while(i <= num){
           if(i % 2 != 0){
               System.out.println(i + " ");
           }
           i++;
       }
    }

}
