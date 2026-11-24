package p3;

public abstract class Shape {
    protected String name;
    protected double area;

    protected Shape(String name) {
        this.name = name;
    }
    void printArea(){
        System.out.println("object" +name+ " area " +area);
    }
    abstract double calculateArea();
}
class Rectangle extends Shape{
    protected double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        super.area=length*width;
        return area;
    }
}

class Circle extends Shape{
    protected double radius;
   final double PI = 3.1416;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        super.area=PI*radius*radius;
        return area;
    }
}
interface Movable{
    void open();
    void close();
}
class Door implements Movable{
    public void open(){
        System.out.println("Opening the door");
    }

    @Override
    public void close() {
        System.out.println("Closing the door");
    }
}
class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(20, 10);
        rectangle.calculateArea();
        rectangle.printArea();
        Shape circle = new Circle(10);
        circle.calculateArea();
        circle.printArea();
        Movable door = new Door();
        door.open();
        door.close();

    }
}