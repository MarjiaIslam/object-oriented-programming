package class6;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    public void run(){
        System.out.println(name+ "(horse) is running" );
    }

    //overriding parent and child class same method
    public void sleep(){
        System.out.println(name + "(horse) is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Neeeeeeh");
    }

//    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.sleep();
//    }
}
