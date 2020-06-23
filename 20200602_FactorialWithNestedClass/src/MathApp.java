public class MathApp {

    public static void main(String[] args) {

        Math.Factorial factorial = Math.Factorial.getFactorial(5);
        System.out.println(Math.Factorial.getFactorial(4).getResult());

        System.out.println(factorial.getResult());

        int a = 5;
        int b;
        if(a == 2) b = 3;
        else b = 2;

        int c = 10;
        c++;

        final int[] array = {1,2,3,4,5};
        array[0] = 9;
        //array = new int[5];

    }
}
