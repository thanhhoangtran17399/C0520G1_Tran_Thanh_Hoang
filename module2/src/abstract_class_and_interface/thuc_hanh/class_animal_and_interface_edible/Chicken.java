package abstract_class_and_interface.thuc_hanh.class_animal_and_interface_edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken: Cục tát";
    }

    @Override
    public String howToEat() {
        return "Gà chiên mắm";
    }
}
