package midtermAppDev;

public class Savings extends Account{

    @Override
    public AccountType getAccountType() {
        return AccountType.Savings;
    }
}
