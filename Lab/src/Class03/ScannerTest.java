package Class03;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        double  d = sc.nextDouble();

        // String  = nextLine() next()
        String str  = sc.nextLine();
        String str2 = sc.next();
        System.out.println("The value of str is : "+str);
        System.out.println("The value of str2 is : "+str2);

    }
}

