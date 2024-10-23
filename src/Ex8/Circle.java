package Ex8;
//Concrete element
public class Circle implements Shape{
    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculateCircleArea(this);
    }
}
