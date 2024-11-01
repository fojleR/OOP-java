package Interface;

import abstraction.GraphicalShape;

public class Circle extends GraphicalShape {
    public Circle(){
        System.out.println("Circle Constructor is looding...");
    }
    public void Draw(){
        System.out.println("Drawing");
    }
    public void resize(){
        System.out.println("Resizing ");
    }
}
