package Class03;

public class BankAccount {
    String name;
    String id ;
    double balance;

    public BankAccount(String name, String id , double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
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


    public static void main(String[] args) {
        BankAccount b = new BankAccount("Tanvir", "100200300",100000);
        System.out.println(b.id);
        System.out.println(b.name);
        System.out.println(b.balance);

        BankAccount a = new BankAccount("Zahid", "200200300",50000);


    }
}

