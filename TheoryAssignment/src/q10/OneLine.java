package q10;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class OneLine {
    public static void main(String[] args) {
        String line;
        try{
            File file = new File("e.txt");
            File file2 = new File("f.txt");
            if (!file.exists())
                file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
            BufferedReader br = new BufferedReader(new FileReader(file));

             Scanner sc = new Scanner(System.in);
            String[] texts = new String[5];
            System.out.println("Enter 5 strings as input: ");
            for(int i=0; i<5; i++){
               texts [i] = sc.nextLine();
               bw.write(texts[i]);
               bw.newLine();
            }
            bw.close();
            while((line= br.readLine())!=null){
                String[] parts = line.split(" ");
                bw2.write(parts[0]+parts[1] + " ");
            }
            br.close();
            bw2.close();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        }
    }

