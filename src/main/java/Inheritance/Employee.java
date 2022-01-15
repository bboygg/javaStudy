package Inheritance;

public class Employee {
    private String name;
    private Car car;

    //standard constructor

    public Employee(String name, Car carType) {
        Employee e1 = new Employee("Shreya", new ArmoredCar());

        Employee e2 = new Employee("Paul", new SpaceCar());

        Employee e3 = new Employee("Pavni", new BMW());

    }
}
