package abstract_class_and_interface.thuc_hanh.class_animal_and_interface_edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].makeSound());

            if (animal[i] instanceof Chicken) {
                Edible edibler = (Chicken) animal[i];
                System.out.println(edibler.howToEat());
            }
        }
    }
}
