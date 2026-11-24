package q8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Person {

    public String findMaxAgePersonId(String filename) {
        String maxAgePersonId = null;
        int maxAge = 0;

        try {
            File person = new File("person.txt");
            BufferedReader br = new BufferedReader(new FileReader(person));
            String p;
            while ((p = br.readLine()) != null) {
                String[] parts = p.split("/");
                for(int i=0; i< parts.length; i++){
                    int age = Integer.parseInt(parts[1]);
                    if (age > maxAge) {
                        maxAge = age;
                        maxAgePersonId = parts[0];
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return maxAgePersonId;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
       String s = p1.findMaxAgePersonId("person.txt");
        if (s != null) {
            System.out.println("ID of the person with maximum age: " + s);
        } else {
            System.out.println("No person found in the file.");
        }
    }
}
