import java.util.Scanner;
 class JavaExample {
    public static void main(String args[]){
// Initializing a Scanner object
        Scanner scan = new Scanner("OOPLab/First/Website");
//Initialize the delimiter in useDelimiter() method
        scan.useDelimiter("/");
//printing the strings separated by delimiter
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
    }
}