package Ex8;
//Concrete element
public class Triangle implements Shape{
    private final float side1;
    private final float side2;
    private final float side3;

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    public float getSide3() {
        return side3;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.calculateTriangleArea(this);
    }
}
