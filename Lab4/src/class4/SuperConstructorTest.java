package class4;

public class SuperConstructorTest {
    public static void main(String[] args) {
        Pizza p = new Pizza();
    }
}

class Food{
    String name;
    public Food(String name){
        this.name = name;
        System.out.println("Cooking food in the stove");
    }
}

class Pizza extends Food{
    String flavor;
    Pizza(){
        super("Pepperoni pizza");  //explicit call
        System.out.println("Cooking pizza in the oven");
    }

}

