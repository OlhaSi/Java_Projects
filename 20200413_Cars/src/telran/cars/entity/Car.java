package telran.cars.entity;

import java.util.Objects;
import java.util.Scanner;

public class Car {

    private String brand;
    private String color;
    private String model;
    private int year;
    private static int wheel = 4;

    public Car() {
    }

    ;

    public Car(String brand, String color, String model, int year) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public static void setWheel(int wheel) {
        Car.wheel = wheel;
    }

    public static int getWheel() {
        return wheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getModel() == car.getModel() &&
                getYear() == car.getYear() &&
                getBrand().equals(car.getBrand()) &&
                getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getColor(), getModel(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand:'" + brand + '\'' +
                ", color:'" + color + '\'' +
                ", model:" + model +
                ", year:" + year +
                ", wheel:" + wheel +
                '}';
    }

    public void display() {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
        System.out.println("yearOfProduction: " + year);
        System.out.println("number of wheel is " + wheel);
        System.out.println();

    }

    public static Car getCarFromUser(Scanner scanner) {
        Car userCar = new Car();
        System.out.println("Enter name of brand");
        userCar.brand = scanner.nextLine();
        System.out.println("Enter name of model");
        userCar.model = scanner.nextLine();
        System.out.println("Enter color");
        userCar.color = scanner.nextLine();
        System.out.println("Enter year of production");
        userCar.year = scanner.nextInt();

        return userCar;
    }

    public int compareToCar(Car car){
        if(this.year == car.year){
            return 0;
        } else if(this.year > car.year){
            return 1;
        }else {
            return -1;
        }
    }

//    public int compareToCar(Car car) {
//        return this.year == car.year ? 0 : ((this.year > car.year) ? 1 : -1);
//    }

    public int compareBrandYear(Car car){
        int result = this.brand.compareTo(car.brand);
        if(result == 0){
            result = compareToCar(car);
        }
        return result;
    }


}

