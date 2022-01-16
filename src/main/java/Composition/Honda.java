package Composition;

public class Honda extends Bike {
    //inherits all properties of bike class

    public void setStart(){
        HondaEngine e = new HondaEngine();
        e.start();
    }
    public void stop(){
        HondaEngine e = new HondaEngine();
        e.stop();
    }
}
