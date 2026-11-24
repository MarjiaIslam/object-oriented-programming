package p4.shop;

public class Product extends Shopkeeper {
    private int ID;
    private String name;
    private int price;

    public Product(int quantity, int ID, String name, int price) {
        super(quantity);
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getProductDetails() {
        return "...[INFO] Product...\n" +
                "ID: " + ID + "\n" +
                "name: " + name + "\n" +
                "price: " + price + "\n";
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getBill() {
        return price * getQuantity();
    }
}
