package midtermAppDev;

public class Main {

    public static void main(String[] args) {
        //Part one
Bank bank1 = new Bank();
Checking checkingAccount1 = new Checking();
Customer customer1 = new Customer("Mahogany","Gant",checkingAccount1);
bank1.addCustomer(customer1);
customer1.getACCOUNT().deposit(2000);
       // customer1.getACCOUNT().getBalance(); //checking to make sure balance is added and withdrawn properly
customer1.getACCOUNT().withdraw(100);
       // customer1.getACCOUNT().getBalance();
customer1.getACCOUNT().withdraw(50);
       // customer1.getACCOUNT().getBalance();
customer1.getACCOUNT().deposit(60);
       // customer1.getACCOUNT().getBalance();
customer1.getACCOUNT().deposit(-100);

        //bank1.printAllCustomersAccountInfo(); //checking to see if it would print account type

        //Part two
Savings savings = new Savings();
Customer customer2 = new Customer("Spongebob","Squarepants",savings);
bank1.addCustomer(customer2);
customer2.getACCOUNT().deposit(500);
        //customer2.getACCOUNT().getBalance();
 customer2.getACCOUNT().withdraw(1000000);
        customer2.getACCOUNT().withdraw(100);

    }
}
