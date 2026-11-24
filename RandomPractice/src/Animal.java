public class Animal {
    String name;
    public void eat(){
        System.out.println("It can eat");
    }
    {
        System.out.println("IIB");
    }
    Animal(String name){
        this.name = name;
        System.out.println("Constructor01");
    }
    static{
        System.out.println("static block");
    }
    public void sound(){
        System.out.println("meow");
    }
}
class cat extends Animal{
    public void eat(){
        System.out.println("It eats cat food");
    }
    public void name(){
        System.out.println("The name of the cat is MiNi");
    }
    cat(){
        super("m");
        super.eat();
    }

}

class Main{
    public static void main(String[] args) {
      Animal m = new cat();
      cat c = new cat();
        m.eat();
       // m.name();
        m.sound();

    }
}
