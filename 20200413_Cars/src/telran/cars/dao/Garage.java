package telran.cars.dao;

import telran.cars.entity.Car;

public class Garage {

    private Car[] cars;
    private int currentGarageSize;

    public Garage(int size) {
        cars = new Car[size];
        currentGarageSize = 0;
    }

    public void getSortedCarsbyBrand(){
        for (int i = 1; i < currentGarageSize; i++) {
            for (int j = i; j > 0; j--) {
//                Car previousCar = cars[j - 1];
                if (cars[j].compareBrandYear(cars[j - 1]) <= -1) {
                    Car currentCar = cars[j];
                    cars[j] = cars[j -1];
                    cars[j - 1] = currentCar;
                }
            }
        }
    }


    public void getSortedCarsbyYear() {
        for (int i = 1; i < currentGarageSize; i++) {
            for (int j = i; j > 0; j--) {
//                Car previousCar = cars[j - 1];
                if (cars[j].compareToCar(cars[j - 1]) == -1) {
                    Car currentCar = cars[j];
                    cars[j] = cars[j -1];
                    cars[j - 1] = currentCar;
                }
            }
        }
    }

//    public void getSortedCars() {
//        for (int i = 1; i < currentGarageSize; i++) {
//            for (int j = i; j > 0; j--) {
//                Car c1 = cars[j];
//                Car c2 = cars[j - 1];
//                if (cars[j].getYear() < cars[j - 1].getYear()) {
//                    cars[j] = c2;
//                    cars[j - 1] = c1;
//                }
//            }
//        }
//    }


    public boolean paintCar(Car car, String color) {
        for (int i = 0; i < currentGarageSize; i++) {
            if (cars[i].equals(car)) {
                cars[i].setColor(color);
                return true;
            }

        }
        return false;
    }

    public int numberOfSameBrand(String brand) {
        int counter = 0;
        for (int i = 0; i < currentGarageSize; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brand)) {
                counter++;
            }
        }
        return counter;
    }

    public Car[] getArrayCarsByBrand(String brand) {
        Car[] carsByBrand = new Car[numberOfSameBrand(brand)];
        int index = 0;
        for (int i = 0; i < currentGarageSize; i++) {
            if(cars[i].getBrand().equalsIgnoreCase(brand)){
                carsByBrand[index] = cars[i];
                index ++;
            }
        }
        return carsByBrand;
    }

    public int numberOfCarsByColor(String color){
        int counter = 0;
        for (int i = 0; i < currentGarageSize; i++) {
            if(cars[i].getColor().equalsIgnoreCase(color))
                counter++;
        }
        return counter;
    }

    public Car[] ArrayCarsByColor(String color){
        Car[] carsByColor = new Car[numberOfCarsByColor(color)];
        int index = 0;
        for (int i = 0; i < currentGarageSize; i++) {
            if(cars[i].getColor().equalsIgnoreCase(color)){
                carsByColor[index] = cars[i];
                index++;
            }
        }
        return carsByColor;
    }


    public Car findCarByModel(String model) {
        Car car = null;
        for (int i = 0; i < currentGarageSize; i++) {
            if (cars[i].getModel().equalsIgnoreCase(model)) {
                car = cars[i];
            }
        }
        return car;
    }

    public boolean addCar(Car car) {
        if (currentGarageSize < cars.length) {
            cars[currentGarageSize] = car;
            currentGarageSize++;
            return true;
        }
        return false;

    }

    public boolean removeCar(Car car) {
        for (int i = 0; i < currentGarageSize; i++) {
            if (cars[i].equals(car)) {
                cars[i] = cars[currentGarageSize - 1];
                currentGarageSize--;
                return true;
            }
        }
        return false;
    }

    public int oldestCar() {
        int oldest = cars[0].getYear();
        for (int i = 0; i < currentGarageSize; i++) {
            if (cars[i].getYear() < oldest) {
                oldest = cars[i].getYear();
            }
        }
        System.out.println(oldest);
        return oldest;
    }

    public void display() {
        for (int i = 0; i < currentGarageSize; i++) {
            System.out.println(cars[i]);
        }
    }


}
