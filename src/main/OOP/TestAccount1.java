public class TestAccount1 {
    public static void main(String[] args) {
        // Test Customer1 class
        Customer1 c1 = new Customer1(88, "Tan Ah Teck", 'm');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());

        //Test Account1 class
        Account1 acc1 = new Account1(101, c1, 888.8);
        System.out.println(acc1);
        Account1 acc2 = new Account1(101, c1);
        System.out.println(acc2);
        System.out.println("id is: " + acc1.getId());
        System.out.println("customer is: " + acc1.getCustomer());
        System.out.println("balance is: " + acc1.getBalance());
        acc1.setBalance(100.2);
        System.out.println(acc1);
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println(acc1.deposit(11.2));
        System.out.println(acc1.withdraw(121.2));
        System.out.println(acc1.withdraw(90.2));

    }

}
