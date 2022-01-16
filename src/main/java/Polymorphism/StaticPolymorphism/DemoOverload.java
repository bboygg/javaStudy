package Polymorphism.StaticPolymorphism;

public class DemoOverload {

    /*Method overloading simply means that there are a number of methods available in a class that have the same name but different types of order or number of parameters.*/

    public int add(int x, int y){ //method 1
        return x + y;
    }
    public int add(int x, int y, int z){//method 2
        return x + y + z;
    }
    public int add(double x, int y){//method 3
        return (int)x + y;
    }
    public int add(int x, double y){ //method 4
        return x + (int)y;
    }
}
