public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String acc, String holder, double bal) {
        this.accountNumber = acc; this.holderName = holder; this.balance = bal;
    }

    public void deposit(double amount) { balance += amount; }
    public boolean withdraw(double amount) {
        if (amount <= balance) { balance -= amount; return true; }
        return false;
    }

    public abstract double calculateInterest();

    // Encapsulation
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    protected void setBalance(double b) { this.balance = b; }
}
