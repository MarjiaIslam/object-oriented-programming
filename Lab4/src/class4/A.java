package class4;


public class A {
    A(){
        System.out.println("Inside A's Constructor");
    }
}
class  B extends A{
    B(){
        System.out.println("Inside B's Constructor");
    }
}
class C extends B{
    C(){
        System.out.println("Inside C's Constructor");
    }
}

class Test{
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.toString());
        System.out.println(c.hashCode());

        B b = new B();
        System.out.println(b.hashCode());

    }
}

