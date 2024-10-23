package Ex8;
//Visitor interface
public interface Visitor {
    void calculateTriangleArea(Triangle triangle);
    void calculateCircleArea(Circle circle);
    void calculateRectangleArea(Rectangle rectangle);
}
