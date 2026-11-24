package class9;

public class TryCatchExample {

    public static void main(String[] args) {
        int a = 42, b = 0;
        System.out.println("before Exception");

        try{
            int c = a/b;// Arithmetic

        }
        catch (NumberFormatException e){
            System.out.println("Inside catch block");
        }
        System.out.println("after Exception");
    }
}

