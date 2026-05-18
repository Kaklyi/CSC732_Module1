public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Set interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Get interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // not sure if i nned to add interest but just in case its required
    public void applyInterest() {
        double interestAmount = getBalance() * (interestRate / 100);
        deposit(interestAmount);
        System.out.println("Interest added: $" + interestAmount);
    }

    // Withdrawal *allows overdraft and adds $30 fee
    public void processWithdrawal(double amount) {
        withdrawal(amount);

        // If balance is negative, charge fee
        if (getBalance() < 0) {
            withdrawal(30);
            System.out.println("Overdraft! A $30 fee has been added.");
        }
    }

    // Show account info
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
