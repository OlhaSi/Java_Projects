package telran.entity;

import java.util.Objects;

public class Car {


    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;
    private static int wheel = 4;


    public Car(){};

    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }


    public static void setWheel(int wheel) {
        Car.wheel = wheel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }



   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYearOfProduction() == car.getYearOfProduction() &&
                Objects.equals(getBrand(), car.getBrand()) &&
                Objects.equals(getModel(), car.getModel()) &&
                Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getColor(), getYearOfProduction());
    }*/

    @Override
    public String toString() {
        return "Car: " + brand +
                ", " + model +
                ", color: " + color +
                ", yearOfProduction: " + yearOfProduction;
    }

    public void display(){
        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("color: "+color);
        System.out.println("yearOfProduction: "+yearOfProduction);
        System.out.println("number of wheel is " + wheel);
        System.out.println();
   }
}
