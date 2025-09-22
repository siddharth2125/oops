public class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String holder, double bal) { super(acc, holder, bal); }
    @Override public double calculateInterest() { return getBalance() * 0.04; } // 4%
    @Override public boolean applyForLoan(double amount) { return calculateLoanEligibility() >= amount; }
    @Override public double calculateLoanEligibility() { return getBalance() * 2; }
}
