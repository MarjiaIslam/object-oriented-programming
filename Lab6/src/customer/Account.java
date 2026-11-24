package customer;

public class Account {
    private String phoneNumber;
    private double balance;

    public Account(String phoneNumber, double balance) {
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public void withdraw(String phoneNumber, double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double balanceInquiry() {
        return balance;
    }
}
