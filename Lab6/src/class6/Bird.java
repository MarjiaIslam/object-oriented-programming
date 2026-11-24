package class6;

public class Bird extends Animal implements Flyable{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    public void fly(){
        System.out.println(name+ "(Bird) is flying" );
    }
}
