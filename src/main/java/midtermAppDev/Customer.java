package midtermAppDev;

public class Customer {
final private String FIRSTNAME;
final private String LASTNAME;
final private Account ACCOUNT;

public Customer(String firstName, String lastName, Account account){
    this.FIRSTNAME = firstName;
    this.LASTNAME = lastName;
    this.ACCOUNT = account;
    Account.setCounter(+1);
}

    public String getFIRSTNAME() {
        return FIRSTNAME;
    }

    public String getLASTNAME() {
        return LASTNAME;
    }

    public Account getACCOUNT() {
        return ACCOUNT;
    }
}
