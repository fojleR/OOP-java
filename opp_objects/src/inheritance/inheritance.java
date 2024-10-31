package inheritance;

public class inheritance {
    public static void main(String[] args) {
        MountainBike nbike = new MountainBike(10, 20, 30);
        System.out.println("Speed : " + nbike.speed);
        System.out.println("Gear : " + nbike.gear);
        nbike.speedUp(10);
        System.out.println("seatHeight: "+ nbike.seatHeight);
        System.out.println("Speed : " + nbike.speed);
    }
}
