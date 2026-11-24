package q9;
import java.io.*;
public class SortingID {
    public static void main(String[] args) {

        try {
            File f1 = new File("id.txt");
            File f2 = new File("even.txt");
            File f3 = new File("odd.txt");

            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(f2));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(f3));
            String ID;
            while((ID = br.readLine())!= null) {
                if(Integer.parseInt(ID) %2==0)
                      bw1.write(ID);
                    bw1.newLine();
                if(Integer.parseInt(ID) %2!=0)
                   bw2.write(ID);
                bw2.newLine();
            }
           br.close();
            bw1.close();
            bw2.close();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
