package Inheritance.StaticMember;

public class ArmoredCar extends Car{

    public static String msg(){
        return "ArmoredCar";
    }


    Car first = new ArmoredCar();

    ArmoredCar second = new ArmoredCar();


}
