public class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String holder, double bal) { super(acc, holder, bal); }
    @Override public double calculateInterest() { return 0; } // no interest
}
