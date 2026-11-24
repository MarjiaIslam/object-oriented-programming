package p4.customer;


import p4.shop.Product;

public class Customer extends Account {
    String customerName;
    String password;

    public Customer(String phoneNumber, double balance,
                    String customerName, String password) {
        super(phoneNumber, balance);
        this.customerName = customerName;
        this.password = password;
    }

    public String customerINFO() {
        return "...[INFO] CUSTOMER...\n"
                + "Customer Name: " + this.customerName +"\n"
                + "Phone Number: " + this.getPhoneNumber()+"\n";
    }

    public double buy(Product p) {
        System.out.print(p.getProductDetails());
        double bill = p.getBill();
        return bill;
    }

    public void payment(String password, String phoneNumber, double bill) {
        if (!password.equals(this.password)) {
            System.out.println("...[ERROR] PASSWORD INCORRECT!...");
            return;
        }
        if (!phoneNumber.equals(getPhoneNumber())) {
            System.out.println("...[ERROR] PHONE NUMBER INCORRECT!...");
            return;
        }
        System.out.println("Total Bill: " + bill);
        if (bill > balanceInquiry()) {
            System.out.println("...[ERROR] INSUFFICIENT BALANCE!...");
        } else {
            withdraw(phoneNumber, bill);
            System.out.println("...[INFO] PAYMENT SUCCESSFUL...");
            System.out.println("...[INFO] CURRENT BALANCE: " + balanceInquiry() + "...");
        }

    }
}

