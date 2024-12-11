public class Account1 {
    private int id;
    private Customer1 customer;
    private double balance;
    public Account1(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account1(int id, Customer1 customer) {
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        balance = Math.ceil(balance*100);
        balance /= 100;
        return balance;
    }

    @Override
    public String toString() {
        //balance = Math.ceil(balance*100);
        return customer + " balance=$" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account1 deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account1 withdraw(double amount) {
        if(balance>=amount) {
            this.balance -= amount;
            return this;
        }
        else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
