package class9;

public class Math {
    public int divide(int a, int b) throws DivByZero{
        if(b == 0) throw new DivByZero("0 diye divide korte pari na");
        return a/b;
    }
    public static void main(String[] args) {
        Math m = new Math();
        int n = 42, d = 0;
        try{
            m.divide(n,d);
        }catch (DivByZero e){
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Complete");
        }

    }
}
