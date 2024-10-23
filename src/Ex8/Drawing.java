package Ex8;

//Usage
import java.util.ArrayList;
import java.util.List;

public class Drawing {
    public static void main(String[] args) {
        List<Shape> shapes=new ArrayList<>();
        Visitor calculator=new AreaCalculator();
        shapes.add(new Circle(6));
        shapes.add(new Rectangle(6,7));
        shapes.add(new Triangle(3,4,5));
        for(Shape shape:shapes){
            shape.accept(calculator);
        }
    }
}
