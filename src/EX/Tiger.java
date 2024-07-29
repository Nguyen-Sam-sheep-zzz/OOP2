package EX;

public class Tiger extends Animal {
    Tiger() {

    }

    @Override
    public String eat() {
        return "eating...";
    }

    public String eat(String food) {
        return "Tiger eating : " + food;
    }

    @Override
    public void makeSound() {
        System.out.println(" WHARRRRRRRRRRRR !!!");
    }
}
