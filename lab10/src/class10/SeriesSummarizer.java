package class10;


import java.io.*;
import java.util.Arrays;

public class SeriesSummarizer {
    public static void main(String[] args) {
        File input = new File("input.txt");
        File outfile = new File("sum.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter((new FileWriter(outfile)));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                //split function
                String[] tokens = line.split(" ");
//                System.out.println(Arrays.toString(tokens));
                for (int i = 0; i < tokens.length; i++) {
                    int n = Integer.parseInt(tokens[i]);
                    sum += n;
                }
            }
            bw.write(String.valueOf(sum));
            br.close();
            bw.close();


        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
