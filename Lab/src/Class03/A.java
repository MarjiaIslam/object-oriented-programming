package Class03;

public class A {
    int  x = 5;

    A(){
        System.out.println("Inside base Constructor");
    }

    A(int x){
        this();//first line of the constructor

        this.x = x ;
        System.out.println("Inside second Constructor");
        this.display();
    }

    void display(){
        System.out.println(" The value of x is "+x);
    }

    public static void main(String[] args) {
        A b = new A();
        A a = new A(1);
    }
}
