public class PizzaShop {
    private int pizza_price = 300;
    private int drink_price = 70;
    private int fries_price = 180;

    public PizzaShop() {
        System.out.println("Welcome to the Pizza Shop.");
    }

    public void order(int pizza) {
        System.out.println("you ordered " + pizza + "pizza.");
        int n1 = pizza_price * pizza;
        System.out.println("Total Bill: " + n1 + "taka");
    }

    public void order(int pizza, int drinks) {
        System.out.println("you ordered " + pizza + "pizza," + drinks + " drinks.");
        int n1 = pizza_price * pizza;
        int n2 = drink_price * drinks;
        int sum = n1 + n2;
        System.out.println("Total Bill: " + sum + "taka");
    }

    public void order(int pizza, int drinks, int fries) {
        System.out.println("you ordered " + pizza + "pizza," + drinks + " drinks and" + fries + " fries.");
        int n1 = pizza_price * pizza;
        int n2 = drink_price * drinks;
        int n3 = fries_price * fries;
        int sum = n1 + n2 + n3;
        System.out.println("Total Bill: " + sum + "taka");
    }
}

class Order{
    public static void main(String[] args) {
        PizzaShop p = new PizzaShop();
        p.order(3,4);
        p.order(1,2,1);
        p.order(3);
    }
}
