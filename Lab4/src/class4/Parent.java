package class4;


public class Parent {
    int pvar = 5;
    int x = 1;
    public void display(){
        System.out.println("The value of pvar is :"+ pvar);
    }

    public void pMethod(){
        System.out.println("Inside pMethod");
    }
}

class Child extends Parent{
    int cvar = 10;
    int x = 2;

    public void display(){
        System.out.println("The value of cvar is :"+ cvar);
        super.display();
        System.out.println("The Value of x is "+ this.x);
        System.out.println("The value of x in parent is "+ super.x);
    }

    public void cMethod(){
        System.out.println("Inside Cmethod");
    }

    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.cvar);
        System.out.println(c.pvar);
        System.out.println(c.x);

        c.cMethod();
        c.pMethod();
        c.display();
    }
}
