package DesignPatternsPackage;

import java.awt.*;

/**
 * Main class demonstrating multiple design patterns:
 * - Singleton pattern (Thread-safe)
 * - Factory pattern
 * - Abstract Factory pattern
 */
public class DesginPatterns {

    public static void main(String[] args) {

        // ------------------- Singleton Design Pattern -------------------
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton d1 = Singleton.getInstance();  // Both threads are creating same object
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton d1 = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start();

        // ------------------- Factory Design Pattern -------------------
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle

        Shape shape2 = factory.getShape("SQUARE");
        shape2.draw(); // Output: Drawing a Square

        // ------------------- Abstract Factory Design Pattern -------------------
        ToyFactory redFactory = new RedToyFactory();
        Cary redCar = redFactory.createCar();
        Doll redDoll = redFactory.createDoll();
        redCar.assemble();  // Output: Assembling a Red Car
        redDoll.assemble(); // Output: Assembling a Red Doll

        ToyFactory blueFactory = new BlueToyFactory();
        Cary blueCar = blueFactory.createCar();
        Doll blueDoll = blueFactory.createDoll();
        blueCar.assemble();  // Output: Assembling a Blue Car
        blueDoll.assemble(); // Output: Assembling a Blue Doll
    }
}
