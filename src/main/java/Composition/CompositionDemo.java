package Composition;

public class CompositionDemo {

    public static void main(String[] args){
        Honda h = new Honda();
        h.setColor("Blue");
        h.setWheels(2);
        h.bikeFeatures();
        h.setStart();
        h.stop();
    }
}
