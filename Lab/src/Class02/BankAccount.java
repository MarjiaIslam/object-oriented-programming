package Class02;

public class BankAccount {
    String name;
    String id ;
    double balance;
    public void deposit(double amount){
        balance = balance + amount;
    }
    public double withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
}
