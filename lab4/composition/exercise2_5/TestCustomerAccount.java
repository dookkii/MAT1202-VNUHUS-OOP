package lab4.composition.exercise2_5;

public class TestCustomerAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Hawk Tuah", 'f');
        System.out.println(customer);
        System.out.println("Customer's ID is: " + customer.getID());
        System.out.println("Customer's name is: " + customer.getName());
        System.out.println("Customer's gender is: " + customer.getGender());

        Account account = new Account(1, customer, 100);
        System.out.println(account);

        account.setBalance(6969);
        System.out.println("Customer: " + account.getCustomer());
        System.out.println("Account's ID: " + account.getID());
        System.out.println("Account's balance: " + account.getBalance());

        account.deposit(10);
        System.out.println(account);
        account.withdraw(600);
        System.out.println(account);
        account.withdraw(69420);
        System.out.println(account);
    }
}
