package q7;
import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        String input = "oop assignment";
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }
        if (list.size() >= 3) {
            list.set(2, 'z');
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
