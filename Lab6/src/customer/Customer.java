package customer;

public class Customer extends Account{
    String customerName;
    String password;

    public Customer(String phoneNumber, double balance,
                    String customerName, String password) {
        super(phoneNumber, balance);
        this.customerName = customerName;
        this.password = password;
    }
}
