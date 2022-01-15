package Interface;
/*What is Interface?
As you've already learned, objects define their interaction with the outside world through the methods that they expose. Methods form the object's interface with the
outside world; the buttons on the front of your telvesion set, for example, are the interface between you and the electircal wiring on hte other side of its plastic casing. You press the
"power" button to turn the television on and off.

In its most common form, an interface is a group of related methods with empty bodies, A bicycle's behavior, if specified as and interface, might appear as follows:

*/

public interface Bicycle {

    //wheel revolutions per minute 분당 바퀴회전

    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrake(int decrement);
}
