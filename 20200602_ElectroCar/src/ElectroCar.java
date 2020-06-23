public class ElectroCar {

    private int id;
    private static int motorPower = 200;

    public ElectroCar(int id) {
        this.id = id;
    }

    private class Motor{
        private String motorNumber;

        public Motor(String motorNumber) {
            this.motorNumber = motorNumber;
        }

        private void startMotor(){
            System.out.println("Motor " + id + " is starting");
        }
    }

    public static class Battery{
        public void charge(){
            System.out.println("battery is charging " + motorPower);
        }
    }

    public void start(String string){
        Motor motor = new Motor(string);
        motor.startMotor();
        System.out.println("Electrocar " + id + motor.motorNumber + " is moving");
        int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(id);
                System.out.println(x);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
    }

    private void test(Object object){};
}
