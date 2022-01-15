package Encapsulation;

public class Animal {

    private String animalName;
    private String animalType;
    private int height;
    private String color;

    public Animal(String animalName, String animalType) {
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public void hunt(){
        //implementation of hunt
    }

    public void run(){
        //implementation of run
    }

    public void mate(){
        //implementation of mate
    }
    public void eat() {
        //implementation of eat
    }

    public void age() {
        //implementation of age
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalType(){
        return animalType;
    }

    public void setAnimalType(String animalType){
        this.animalType = animalType;
    }

    //Note: there is a line of differene between encapsulation and abstraction. You'll understand that easily with a simple example and the next tutorial on abstraction will give you
    //a better insight into that. Just make sure to practice encapsulation as you design the classes.
}
