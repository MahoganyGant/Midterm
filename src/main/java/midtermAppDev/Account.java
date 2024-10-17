package midtermAppDev;

public abstract class Account {
final private int ACCOUNTNUMBER;
private static int counter;
private double balance;

public Account(){
    this.ACCOUNTNUMBER = ++counter;
}

    public abstract AccountType getAccountType();

    public void withdraw(double amount){
    if(amount < balance){
        balance -= amount;
    } else{
        System.out.println("Insufficient Funds");
    }
    }

    public void deposit(double amount){
    if(amount > 0){
        balance += amount;
    }else{
        System.out.println("Invalid amount");
    }
    }

    public double getInterestRate(double balance, double amount){
        double interestRate;
if(balance > 1000){
    interestRate = amount * .1;
} else{
    interestRate = amount * .05;
}
    return interestRate;
    }

    public double getTransactionFee(AccountType accountType){
        if(accountType == accountType.Checking)
        {
            return 5.0;
        }else {
            return 10.0;
        }
    }

    @Override
    public String toString(){
        return "Account Number: " + ACCOUNTNUMBER + "\nBalance: " + balance + "\nAccount Type: " + getAccountType();
    }

    public String printAccountInfo(){
    return toString();
    }

    public static void printTotalNumberOfAccounts(){
        System.out.println(getCounter());
    }

    public int getACCOUNTNUMBER() {
        return ACCOUNTNUMBER;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    public double getBalance() {
        System.out.println("Balance is: " + balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
