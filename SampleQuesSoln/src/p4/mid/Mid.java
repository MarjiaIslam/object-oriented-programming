package p4.mid;
import p4.customer.Customer;
import p4.shop.Product;

public class Mid {
    public static void main(String[] args) {
        Customer c = new Customer("01843707534", 1000, "Mahim", "OOP");
        Product[] products = new Product[3];
        products[0] = new Product(2, 505, "lux", 30);
        products[1] = new Product(5, 510, "surf excel", 10);
        products[2] = new Product(10, 515, "facewash", 100);

        System.out.println(c.customerINFO());
        double bill = c.buy(products[1]);
        c.payment("OOP", "01843707534", bill);
        bill = c.buy(products[0]);
        c.payment("OpP", "01843707534", bill);
        bill = c.buy(products[2]);
        c.payment("OOP", "01843707534", bill);

    }
}
