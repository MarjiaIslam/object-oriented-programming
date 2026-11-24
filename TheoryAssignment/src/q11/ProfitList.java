package q11;
import java.io.*;

public class    ProfitList {
    public static void main(String[] args) {
        try {
            File f1 = new File("AnnualSell.txt");
            File f2 = new File("Profit.txt");
            if(!f1.exists()) f1.createNewFile();
            if(!f2.exists()) f2.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

           String line;
           double n;
           double profit;
            String maxProfitItem = null;
            double totalProfit = 0;
            double maxProfit = 0;

           while((line=br.readLine())!=null){
               String[][] parts = new String[][]{line.split(" ")};
               for(int i=1, j=0;  i< parts.length; i++,j++){
                   if(Double.parseDouble(parts[i][2])<0){
                       throw new InvalidPriceException("Selling price can't be less than 0.");
                   } else {
                  n = Double.parseDouble(parts[i][2])-Double.parseDouble(parts[i][1]);}

                   if(Double.parseDouble(parts[i][3])<0){
                       throw new TotalUnitSoldMnimumBoundException("Sold unit less than 0.");
                   }
                   else if(Double.parseDouble(parts[i][3])>1000){
                       throw new TotalUnitSoldMaximumBoundException("Sold unit greater than 1000.");
                   }
                   else{
                   profit = n*Double.parseDouble(parts[i][3]);}
                   totalProfit += profit;
                   if(maxProfit < profit){
                       maxProfit = profit;
                       maxProfitItem = parts[i][0];
                   }
                  bw.write("Item" +" "+ "Profit");
                  bw.write(parts[i][0] +" "+ profit);
                  bw.newLine();
                  bw.write("Total profit: " + String.valueOf(totalProfit));
                  bw.write("Maximum profit item: " + maxProfitItem);

               }
           }

           br.close();
           bw.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (TotalUnitSoldMnimumBoundException e) {
            System.out.println(e.getMessage());
        } catch (TotalUnitSoldMaximumBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
class InvalidPriceException extends Exception{
    public InvalidPriceException(String msg){
        super(msg);
    }
}
class TotalUnitSoldMnimumBoundException extends Exception{
    public TotalUnitSoldMnimumBoundException(String msg){
        super(msg);
    }
}
class TotalUnitSoldMaximumBoundException extends Exception{
    public TotalUnitSoldMaximumBoundException(String msg){
        super(msg);
    }
}