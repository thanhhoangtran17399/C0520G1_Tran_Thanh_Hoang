package abstract_class_and_interface.bai_tap.colorable;

import abstract_class_and_interface.bai_tap.resizeable.Circle;
import abstract_class_and_interface.bai_tap.resizeable.Rectangle;
import abstract_class_and_interface.bai_tap.resizeable.Shape;
import abstract_class_and_interface.bai_tap.resizeable.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 6, "red", true);
        shapes[1] = new Square(5, "yellow", true);

        for (Shape elementShape : shapes) {
            if (elementShape instanceof Square) {
                System.out.println("Square:");
                Square s1 = (Square) elementShape;
                s1.HowtoColor();
                System.out.println(s1);
            }
            else {
                System.out.println("Retangle: \nnot color all four sides..");
                System.out.println(elementShape);
                System.out.println("------------------------------------------------");
            }
        }
    }
}
