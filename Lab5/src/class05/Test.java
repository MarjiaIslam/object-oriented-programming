package class05;

public class Test {
    public static void main(String[] args) {
        Object o;
        Parent p;
        Child c = new Child();
        Uncle u;
       o = c;
       // o.display();
        c.display();
        p = c;
        p.display();
        p = (Parent) o;
        p.display();
        c = (Child) o;
        c.display();

    }
}
