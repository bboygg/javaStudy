package Polymorphism.StaticPolymorphism;

public class Test {
    /*The compiler usually checks the method signature(Combination of hte method name and the parameter list)
    after which it make a desicion on which method to be invoked when compile time comes for a certain method call*/
    public static void main(String[] args){
        DemoOverload demo = new DemoOverload();
        System.out.println(demo.add(2,3)); //invoked method 1
        System.out.println(demo.add(2,3,5)); //invoked method 2
        System.out.println(demo.add(3,2.4)); //invoke method 4
        System.out.println(demo.add(1.3,5)); // invoke method 3
    }
}
