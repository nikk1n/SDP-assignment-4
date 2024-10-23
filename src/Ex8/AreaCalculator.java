package Ex8;
//Concrete Visitor
public class AreaCalculator implements Visitor{
    @Override
    public void calculateCircleArea(Circle circle) {
        System.out.println("Area of a circle: "+Math.PI*Math.pow(circle.getRadius(),2));
    }

    @Override
    public void calculateRectangleArea(Rectangle rectangle) {
        System.out.println("Area of a rectangle: "+rectangle.getLength()*rectangle.getWidth()) ;
    }

    @Override
    public void calculateTriangleArea(Triangle triangle) {
        float a=triangle.getSide1();
        float b= triangle.getSide2();
        float c= triangle.getSide3();
        float p=(a+b+c)/2;
        System.out.println("Area of a triangle: "+Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
