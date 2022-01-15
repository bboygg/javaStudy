package Inheritance.InheritanceWithInterfaces;

public class ArmoredCar extends Car implements Floatable, Flyable{

    public void floatOnWater() {
        System.out.println(" I Can float!");
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
