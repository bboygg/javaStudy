package Polymorphism.DynamicPolymorphism;

public class Test {
    public static void main(String[] args){
        Vehicle vh = new MotorBike();
        vh.move();

        vh = new Vehicle();
        vh.move();

    }
}

/*Recap
* In Java, an object that passes multiple IS-A tests is automatically polymorphic by nature
*
* In Java, all objects pass a minimum of two IS-A tests that is one for the object class and one for itself
*
* In Java, static polymorphism is done through method overloading
*
* In Java, Dynamic polymorphism is attained through method overriding.
* */
