package Inheritance.MultipleInheritance;

public class ArmoredCar extends Car implements Flyable,Floatable{

    //This won't be compile, if use 'default' methods in the interface.

    public void aMethod(){
        //System.out.println(duration); //won't compile
        System.out.println(Floatable.duration); //outputs 10
        System.out.println(Flyable.duration); //outputs 20
    }
}
