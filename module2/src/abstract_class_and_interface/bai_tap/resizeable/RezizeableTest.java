package abstract_class_and_interface.bai_tap.resizeable;

public class RezizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4, "yellow", false);
        shapes[1] = new Rectangle(5, 6, "red", true);
        shapes[2] = new Square(7, "blue", true);
        System.out.println("befor");
        for (Shape arr : shapes) {
            System.out.println(arr);
        }
        System.out.println("apter");
        for (Shape arr : shapes){
            if(arr instanceof Circle){
                ((Circle) arr).resize(20);
                System.out.println(arr);
            }
            else if (arr instanceof Rectangle){
                ((Rectangle) arr).resize(30);
                System.out.println(arr);
            }
        }
    }
}
