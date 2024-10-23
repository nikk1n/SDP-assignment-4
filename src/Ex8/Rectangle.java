package Ex8;
//Concrete element
public class Rectangle implements Shape {
    private final float width;
    public final float length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculateRectangleArea(this);
    }
}
