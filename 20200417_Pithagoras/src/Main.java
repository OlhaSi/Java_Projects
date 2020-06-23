public class Main {

    public static void main(String[] args) {
        int[][] pythagorasArray = fillTwoDimensionalArray(10,10);
        // pythagoras();
        // print2DimensionalArray(pythagorasArray);

        int [][] arrays = {{3,4,5},{5,7,8}, {6,8,9}, {1,2,3}};
        print2DimensionalArray(arrays);

        // checkInt (int a, in b)
        // checkInt(9,1)->true; checkInt(10,5)->true; checkInt(3,10)->true; checkInt(9,5)->false;

        checkInt(6, 4);
        System.out.println(checkInt(10,4));

        int [] numbers = {1,2,3,4,5};
        int [] cubeOfNums = cubeOfNumbers(numbers);
        printArray(cubeOfNums);

        System.out.println();
        int sum = arithmeticMean(numbers);
        System.out.println(sum);

    }

    // [][][][][]
    //[[][][]]  [[][][]]  [[][][]]

    public static void pythagoras(){
        int i,j;
        for (i = 1; i <= 10 ; i++) {
            for (j = 1;  j <= 10 ; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] fillTwoDimensionalArray(int rows, int column){
        int[][] table= new int[rows][column];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = (i+1)*(j+1);
            }
        }
        return table;
    }

    public static void print2DimensionalArray(int [][] array){
        int rows = array.length;
        int column = array[0].length;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");

        }
    }

    public static boolean checkInt (int a, int b) {
        return (a + b == 10 || a == 10 || b == 10);
        //return false;
    }

    public static int[] cubeOfNumbers (int[] numbers) {
        int[] cubes = new int[numbers.length];
        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = numbers[i]*numbers[i]*numbers[i];
        }
        return cubes;
    }

    public static int arithmeticMean (int [] numbers){
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            sum = sum + num;
            count++;
        }
        return sum / count;
    }

    public static void printArray(int[] numbers){
        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}
