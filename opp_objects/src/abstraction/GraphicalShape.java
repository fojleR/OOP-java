package abstraction;

public abstract class GraphicalShape {
    int x, y;
    public GraphicalShape(){
        System.out.println("base abstract class");
    }

    abstract void Draw();
    abstract void resize();


}
