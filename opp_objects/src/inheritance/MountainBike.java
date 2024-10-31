package inheritance;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int speed, int gear, int seatHeight){
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newHeight){
        seatHeight = newHeight;
    }
}
