public class Main {

    public static void main(String[] args) {

//        numberRangeReverse(10, 5);
//
//        numberRange(5, 10);
//
//        printRange(5);
//        System.out.println();
//
//        printNumberRange(5, 10);
//
//        System.out.println(printNumber(5));

        printWordsInBraces("I like code");
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

    ////////////

    public static void printNumberRange(int a, int b){
        if(a == b){
            System.out.print(b + " ");
        } else if (a < b){
            System.out.print(a + ", ");
            printNumberRange(a + 1, b);
        } else{
            System.out.print(a + ", ");
            printNumberRange(a - 1, b);
        }
    }

    public static String printNumber(int num){
        if(num == 1){
            return num + "";
        } else {
            return printNumber(num - 1) + ", " + num;
        }
    }

    public static void printWordsInBraces(String str){
        int i = 0;
        while (i < str.length()) {
            if(str.charAt(i) == ' ') {
                System.out.println();
                i++;
            } else {
                System.out.print("[");
                while (i < str.length() && str.charAt(i) != ' ') {
                    System.out.print(str.charAt(i));
                    i++;
                }
                System.out.print("]");
            }
        }
    }
}
