import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = new int[getSizeArray()];
        fillArray(numbers);
        printArray(numbers);
        int deleteNumber = getNumberToDelete();
        boolean check = isDeleteNumberInArray(deleteNumber, numbers);
        printResult(deleteNumber, numbers, check);

    }

    public static int getSizeArray() {
        System.out.println("Enter size of array, please");
        return scanner.nextInt();
    }

    public static int[] fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }


    public static int getNumberToDelete() {
        System.out.println("Enter number to delete");
        return scanner.nextInt();

    }

    public static boolean isDeleteNumberInArray(int number, int[] numbers) {
        for (int num : numbers) {
            if (num == number)
                return true;
        }
        return false;
    }

    public static int[] getArrayWithoutDeleteNumber(int[] numbers, int deletednum) {
        int index = 0;
        int[] newArray = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (deletednum != numbers[i]) {
                newArray[index] = numbers[i];
                index++;
            }
        }
        return newArray;
    }

    public static void printResult(int number, int[] numbers, boolean check) {
        if (check) {
            System.out.println("Yes!!!");
            printArray(getArrayWithoutDeleteNumber(numbers, number));
        } else {
            System.out.println("Number not found(((");
        }

    }
}
