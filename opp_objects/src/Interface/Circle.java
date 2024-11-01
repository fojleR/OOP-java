package Interface;

public class Circle implements GraphicalShape {

    public Circle(){
        System.out.println("Circle constructor is loading.....");
    }
    public void Draw(){
        System.out.println("Drawing");
    }
    public void resize(){
        System.out.println("Resizing ");
    }
}
