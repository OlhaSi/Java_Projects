public class ElectroCarApp {

    public static void main(String[] args) {

//        ElectroCar car = new ElectroCar(23);
//        car.start("ID-24");
//
//        ElectroCar car1 = new ElectroCar(24){
//           @Override
//           public void start(String string){
//               System.out.println("Electrocar is moving");
//           }
//        };
//
//        car1.start("ID-44");

        ElectroCar.Battery battery = new ElectroCar.Battery();
        battery.charge();
    }
}
