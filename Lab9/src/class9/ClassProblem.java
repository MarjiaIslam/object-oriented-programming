package class9;

import java.util.Scanner;

public class ClassProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abc";
        try {
            s = sc.nextLine();
            int x = Integer.parseInt(s);
            System.out.println(++x);
        }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(s);
        }
        System.out.println("Outside try catch");
    }
}
