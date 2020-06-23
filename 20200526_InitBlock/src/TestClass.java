public class TestClass {

    public static void main(String[] args) {

        int[] array = {1,7,3,6,8,9};

        System.out.println(bubbleSort(array));
        //selectionSort();




    }

    public static String str = "Hello!";

    {
        System.out.println("Non-static initializer");
    }

    static {
        System.out.println("static initializer");
    }

    public void call(){
        System.out.println("call method");
    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                   // sorted = false;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }


    int [] array = {FileInputStream("C://Users//User//Desktop//Структуры и алгоритмы//лаб3.txt")};
    int max = array[0] ;
        for (int i=0; i<array.length; i++)
    {
        if(max<array[i])
            max = array[i];
    }
        System.out.println("Max: "+max);
}

}



