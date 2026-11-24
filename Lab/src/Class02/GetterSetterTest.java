package Class02;

public class GetterSetterTest {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.setX(7);
        System.out.println(obj1.getX());
    }
}

class A{
    private int x = 6;

    public void setX(int a){ //write only access
        x = a;
    }
    public int getX(){ //read only access
        return x;
    }
}
