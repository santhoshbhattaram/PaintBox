
public class ShapeState {
    private static Shape shapes;

    public ShapeState(){}

    public Shape getShape(){
        return this.shapes;
    }

    public Shape setShape(Shape shape){
        shapes = shape;
        return shapes;
    }
}

