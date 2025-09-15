public class AccountService {
    @Loggable(message="Account created")
    public void createAccount() {
        System.out.println("Executing createAccount.");
    }

    @Loggable(message="Funds transferred")
    public void transferFunds() {
        System.out.println("Executing transferFunds.");
    }
}

