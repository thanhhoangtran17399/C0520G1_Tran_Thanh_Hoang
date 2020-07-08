package abstract_class_and_interface.bai_tap.colorable;

import abstract_class_and_interface.bai_tap.resizeable.Circle;
import abstract_class_and_interface.bai_tap.resizeable.Rectangle;
import abstract_class_and_interface.bai_tap.resizeable.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4, "yellow", false);
        shapes[1] = new Rectangle(5, 6, "red", true);
        shapes[2] = new Square(5, "yellow", true);

        for (Shape arr : shapes) {
            if (arr instanceof Square) {
//Từ đoạn này trở xuống em được bày mà ko hiểu
                Colorable abc = (Square) arr;
                abc.HowtoColor();
                System.out.println(((Square) arr).getArea());
            }
        }
    }
}
