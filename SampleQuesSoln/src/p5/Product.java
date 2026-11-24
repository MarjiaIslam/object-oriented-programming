package p5;

public interface Product {
    String getProductName();
    void produce();
}
class CentralLocking implements Product{
    String productName;

    public CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking System");
    }
}

class Gearlocking implements Product{
    String productName;

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }

    public Gearlocking(String productName) {
        this.productName = productName;
    }
}

 abstract class Car{
    protected Product product;
    protected String carType;
    void  printDetails(){
        System.out.println("product: " + product.getProductName() + " Car: " +carType);
        }
     abstract void assemble();
     abstract void produceProduct();

     public Car(Product product, String carType) {
         this.product = product;
         this.carType = carType;
     }
 }

 class BMW extends Car {
     public BMW(Product product, String carType) {
         super(product, carType);
     }

     @Override
     void assemble() {
         System.out.println("Assembling [Central Locking System] for [BMW X5 Model]");
     }

     @Override
     void produceProduct() {
         product.produce();
         if (product instanceof CentralLocking) {
             System.out.println("Modifying product [Central Locking System] according to [BMW X5 Model]");
         }
         if (product instanceof Gearlocking) {
             System.out.println("Modifying product [Gear Locking System] according to [BMW X5 Model]");
         }
     }
 }

     class Mercedes extends Car {
         public Mercedes(Product product, String carType) {
             super(product, carType);
         }

         @Override
         void assemble() {
             System.out.println("Assembling [Central Locking System] for [Mercedes GLS Model] ");
         }

         @Override
         void produceProduct() {
             product.produce();
             if (product instanceof CentralLocking) {
                 System.out.println("Modifying product [Central Locking System] according to [BMW X5 Model]");
             }
             if (product instanceof Gearlocking) {
                 System.out.println("Modifying product [Gear Locking System] according to [BMW X5 Model]");
             }
         }
     }

     class Main {
         public static void main(String[] args) {
             Product product = new CentralLocking("Central Locking System");
             Product product2 = new Gearlocking("Gear Locking System");

             Car car = new BMW(product, "BMW X5 Model");
             car.produceProduct();
             car.assemble();
             car.printDetails();

             System.out.println();

             car = new BMW(product2, "BMW X5 Model");
             car.produceProduct();
             car.assemble();
             car.printDetails();

             System.out.println();

             car = new Mercedes (product, "Mercedes GLS Model");
             car.produceProduct();
             car.assemble();
             car.printDetails();

             System.out.println();

             car = new Mercedes (product2, "Mercedes GLS Model");
             car.produceProduct();
             car.assemble();
             car.printDetails();
         }
     }






