package q6;
import java.util.Scanner;
import java.io.*;

public class Employee {
    String name;
    String ID;
    double[] score = new double[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sum = new double[6];
        double[] avg = new double[6];
        System.out.println("Enter the employee number: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            System.out.println("Enter the " + (i+1) + "th employee's name: ");
            employees[i].name = sc.nextLine();

            System.out.println("Enter the " + (i+1) + "th employee's ID: ");
            employees[i].ID = sc.nextLine();

            System.out.println("Enter the " + (i+1) + "th employee's performance score of 6 months: ");
            for (int j = 0; j < 6; j++) {
                employees[i].score[j] = sc.nextDouble();
                sum[i] +=employees[i].score[j];
                avg[i] = sum[i]/6;
            }
            sc.nextLine();
        }

    try {
            File f1 = new File("Employee.txt");
            File f2 = new File("Increment.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(f2));
            if(!f1.exists()) f1.createNewFile();

            for(int i=0; i<n; i++) {
                bw.write("Employee"+(i+1) + "name:" + employees[i].name);
                bw.newLine();

                bw.write("Employee"+(i+1) + "ID:" + employees[i].ID);
                bw.newLine();

                bw.write("Employee"+(i+1) + "average score:" + avg[i]);
                bw.newLine();
            }
            String line;
            double average;
            String name = null;
            while ((line= br.readLine())!=null){
                String[] parts = line.split(":");

                for(int i=0; i<n; i++){
                    if(line.contains("average score")) {
                         average = Double.parseDouble(parts[1]);
                         if(average>75){
                             bw2.write("Average: " + average);
                             name = parts[1];
                             bw2.write(name);
                             bw2.newLine();
                    }
             }
                }
            }
            br.close();
            bw.close();
            bw2.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
    }
  }
}

