package accessmodifier_staticmethod_staticproperty.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        final double PI =  3.14;
        double Area =  Math.pow(radius, 2) * PI;
        return Area;
    }
}
    class Testcircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0,"blue");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());
    }
}

