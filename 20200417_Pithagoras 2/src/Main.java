public class Main {

    public static void main(String[] args) {
        int[][] pythagorasArray = fillTwoDimensionalArray(10,10);
       // pythagoras();
       // print2DimensionalArray(pythagorasArray);

        int [][] arrays = {{3,4,5},{5,7,8}, {6,8,9}, {1,2,3}};
        //print2DimensionalArray(arrays);

        int[] numbers = {1,2,3};
        int[] numbers2 = getCubeArrays(numbers);
        for (int num:numbers2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(arithmeticMean(numbers2));

        // checkInt (int a, in b)
        // checkInt(9,1)->true; checkInt(10,5)->true; checkInt(3,10)->true; checkInt(9,5)->false;
        // {1,2,3}->{1,8,27}
        //
    }

    // [][][][][]
    //[[][][]]  [[][][]]  [[][][]]

    public boolean checkInt(int a, int b){
        return (a==10 || b==10  || a+b ==10);
    }

    public static int[] getCubeArrays(int [] numbers ){
        int[] cubes = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            cubes[i] = power3(numbers[i]);              // cubes[i] = powerNumber(numbers[i], 3)
        }
        return cubes;
    }

    public static int power3(int num){
        return num*num*num;
    }

    public static int powerNumber(int num, int power){
        int number =1;
        for (int i=1; i<=power; i++){   
            number *= num;
        }
        return number;
    }

    public static double arithmeticMean(int[] numbers){
        int sum =0;
        for (int num:numbers) {
            sum += num;
        }
        //System.out.println(sum);
        return sum/numbers.length;
    }



    public static void pythagoras(){
        int i,j;
        for (i = 1; i <=10 ; i++) {
            for (j = 1;  j<=10 ; j++) {
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

}
