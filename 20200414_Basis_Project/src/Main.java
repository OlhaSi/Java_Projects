public class Main {

    public static void main(String[] args) {
        int a1 = 50;
        int a2 = 50;

        Integer b1 = 200;
        Integer b2 = 200;

        System.out.println(a1 == a2);
        System.out.println(b1 == b2);

        int[] nums = {50, 10, 20, 50};
        System.out.println(a1 + "===========");
        changeNumber(a1);
        System.out.println(a1 + "===========");
        a1 = 100;
        System.out.println(a1);
        System.out.println();
        System.out.println(nums[0] + "======");
        changeNumber(nums);
        System.out.println(nums[0]);

        System.out.println(a1 > a2 ? b1 : b2);

        if (a1 > a2) {
            System.out.println(a1);
        } else {
            System.out.println(a2);
        }

        while (a1 > 10) {
            System.out.println("a is " + a1);
            a1 -= 10;                    //a1 = a1-10;
        }

        do {
            System.out.println("a is new " + a1);
            a1 -= 10;
        } while (a1 > 50);

        for (int i = 50; i > 10; i -= 10) {
            System.out.println("i is " + i);
        }


        for (int a = 10, b = 0; b != a; b++, a--) {
            System.out.println("a is " + a);
            System.out.println("b is " + b);
            System.out.println();
        }


        for (int number : nums) {
            System.out.println(number);
        }

        /*for (int number:nums){
            number = number*2;
        }*/

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2;
        }

        System.out.println();
        for (int number : nums) {
            System.out.println(number);
        }

    }

    public static void changeNumber(int num) {
        num = num * 2;
    }

    public static void changeNumber(int[] numbers) {
        numbers[0] = numbers[0] * 2;
    }

}
