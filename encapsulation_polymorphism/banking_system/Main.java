public class Main {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[] {
            new SavingsAccount("SA100", "Ravi", 50000),
            new CurrentAccount("CA200", "Meera", 20000)
        };

        for (BankAccount a : accounts) {
            System.out.println(a.getHolderName() + " balance: " + a.getBalance() + ", interest: " + a.calculateInterest());
            if (a instanceof Loanable) {
                Loanable loan = (Loanable)a;
                System.out.println("  Loan eligibility: " + loan.calculateLoanEligibility());
            }
        }
    }
}
