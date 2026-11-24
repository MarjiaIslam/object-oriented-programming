package class6;

public class Duck extends Animal implements Flyable, Floatable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("quack");
    }

    @Override
    public void swim() {
        System.out.println(name + "(Duck)  is swimming");
    }

    @Override
    public void fly() {
        System.out.println(name + "(Duck)  is Flying");
    }
}
