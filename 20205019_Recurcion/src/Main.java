public class Main {

    public static void main(String[] args) {
        // 4! -> 1*2*3*4

        System.out.println(factorial(4));

        numberRangeReverse(10, 5);

        numberRange(5, 10);

        printRange(5);
    }

    public static int factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialWithRecursion(int num){
        if(num > 1){
            num = factorialWithRecursion(num - 1) * num;
        }
        return num;
    }

    public static void numberRangeReverse (int a, int b){
        if (a == b){
            System.out.println(b);
        }else{
            System.out.print(a + " ");
            numberRangeReverse(a - 1, b);
        }
    }

    public static void numberRange (int a, int b){
        if (a == b){
            System.out.println(b);
        }else{
            System.out.print(a + " ");
            numberRange(a + 1, b);
        }
    }

    public static void printRange (int n){
        if (n > 0){
            printRange(n - 1);
            System.out.print(n + " ");
        }
    }
}


