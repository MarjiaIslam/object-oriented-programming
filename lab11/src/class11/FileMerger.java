package class11;

import java.io.*;

public class FileMerger {
    public static void main(String[] args) {
        File inFile1 = new File("students.txt");
        File inFile2 = new File("results.txt");
        File outFile = new File("merged.txt");

        try{
            BufferedReader br1 = new BufferedReader(new FileReader(inFile1));
            BufferedReader br2 = new BufferedReader(new FileReader(inFile2));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
            String line1, line2;

            while ((line1 = br1.readLine())!=null && (line2 = br2.readLine())!=null){
                String[] tokens = line2.split(" ");
                bw.write(line1+" "+tokens[1]);
                bw.newLine();
            }

            br1.close();
            br2.close();
            bw.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
