package Inheritance;

public class ArmoredCar extends Car{

    int bulletProofWindows;

    void remoteStartCar(){

        //this vehicle can be started by using a remote control
    }

    public String registerModel() {
        return model;
    }



    /* Members In The Hidden Base Class Instance
    *
    * What if the bas class and the derive class both define a method or variable that has a similar name?
    *
    * You can access both two by prefixing the the method or variable with the 'super', and 'this' keywords.
    * */


    private String model;

    public String getAValue(){
        return super.model; // returns value of model defined in base class Car

        //return this.model; //will return value of model defined in ArmoredCar

        //return model; //will return value of model defined in ArmoredCar
    }
}
