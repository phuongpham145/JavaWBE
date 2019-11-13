package animal;
import animal.Animal;
import edible.Edible;


public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {

        return "Chicken : O o o o o o o";
    }


    @Override
    public String howtoEat() {
        return "Chicken could fried";
    }
}
