package Lap_3.Th2;

import Lap_3.Th1.Edible;

public class Cat extends Animal implements Edible, Lap_3.Th2.Edible {
    @Override
    public String makeSound() {
        return "Cat: meow meow!";
    }
    @Override
    public String howToEat() {
        return "mouth";
    }

}
