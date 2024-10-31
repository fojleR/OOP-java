package inheritance;

public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear){
        gear = startGear;
        speed = startSpeed;
    }

    public void setGear(int newGear){
        gear = newGear;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }
}
