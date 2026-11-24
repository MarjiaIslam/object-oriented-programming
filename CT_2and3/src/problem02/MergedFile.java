package problem02;

import java.io.*;

public class MergedFile {

    public static void main(String[] args) {
        File input1 = new File("Students.txt");
        File input2 = new File("marks.txt");
        File output = new  File("merged.txt");

        try {
            BufferedReader bf1 = new BufferedReader(new FileReader("Students"));
            BufferedReader bf2 = new BufferedReader(new FileReader("marks"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("merged"));
            String str;
            int sum = 0;
            while ((str = bf1.readLine()) != null && (str = bf2.readLine()) != null) {
                String[] tokens = str.split("");
                for (int i = 0; i < tokens.length; i++) {
                    int n = Integer.parseInt(tokens[i]);
                    sum += n;
                }
            }
            bw.write(String.valueOf(sum));
            bf1.close();
            bf2.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
