public class Math {
    public static class Factorial{
        private int result;
        private int number;

        public Factorial(int number, int result){
            this.result = result;
            this.number = number;
        }

        public int getResult() {
            return result;
        }

        public int getNumber() {
            return number;
        }

        public static Factorial getFactorial(int number){
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return new Factorial(number, result);
        }
    }
}
