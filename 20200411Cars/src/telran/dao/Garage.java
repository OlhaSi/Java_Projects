package telran.dao;

import telran.entity.Car;

public class Garage {
    private Car[] cars;
    private int currentSize;

    public Garage(int capacity){
        cars=new Car[capacity];
        currentSize=0;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    public Car[] getCars() {
        return cars;
    }


    public boolean addCar(Car car) {
        if (currentSize < cars.length) {
            cars[currentSize] = car;
            currentSize++;
            return true;
        }
        return false;
    }
      public boolean removeCar(Car car){
            for (int i = 0; i <cars.length; i++) {
                if (cars[i].equals(car)) {
                    cars[i] = cars[currentSize - 1];
                    currentSize--;
                    return true;
                }
            }
            return false;

        }

        public Car findCarByModel(String model){
            Car car = null;
            for (int i = 0; i < currentSize ; i++) {
                if(cars[i].getModel().equalsIgnoreCase(model)){
                    car = cars[i];
            }
            }
            return car;
        }



      public void display(){
            System.out.println("***************");
            for (int i = 0; i <currentSize ; i++) {
                cars[i].display();
            }
            System.out.println("***************");
        }
    }


