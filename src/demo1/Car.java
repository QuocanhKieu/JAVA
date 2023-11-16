package demo1;

import java.sql.SQLOutput;

public class Car {

    String color = "red";

    Owner ownerOfCar = new Owner();

    void run() {
        System.out.println("Car is running...");
    }

    void clearCar() {
        System.out.println("cleaning the car...");
    }

    void printColor() {
        clearCar();
        System.out.println("My color: " + color);
    }


}
