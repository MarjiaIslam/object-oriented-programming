package Class02;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount accountP = new BankAccount();
        accountP.name = "Rashid";
        accountP.id = "100200";
        accountP.balance = 200000;

        BankAccount accountS = new BankAccount();
        accountP.name = "Kamal";
        accountP.id = "200100";
        accountP.balance = 50000;

        accountP.deposit(100000);
        accountS.withdraw(50000);

        accountS = accountP;

        accountS.balance = 100;

        System.out.println(accountP.name);
        System.out.println(accountP.id);
        System.out.println(accountP.balance);

        System.out.println(accountS.name);
        System.out.println(accountS.id);
        System.out.println(accountS.balance);


    }
}