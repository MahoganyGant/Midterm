package midtermAppDev;

public class Checking extends Account{

    @Override
    public AccountType getAccountType() {
        return AccountType.Checking;
    }
}
