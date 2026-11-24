package class6;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    //concrete methods
    public void eat(){
        System.out.println(name + " eats");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    //abstract methods  = zero or more
    public abstract void makeSound();

//    public static void main(String[] args) {
//        Animal h =  new Animal("Jack");// No instance for abstract classes
//        //reference
//        h.eat();
//        h.sleep();
//
//        Bird h1 = (Bird) h;
//        h1.eat();
//
////        h.run();
//        Animal b = new Bird("tweety");
//    }
}
