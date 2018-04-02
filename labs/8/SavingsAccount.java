public class SavingsAccount extends Account {

    private double OVERDRAFT_LIMIT = 0;//sets overdraft limit

    //constructor
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    //withdraws from savings account
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    //toString method
    @Override
    public String toString() {
        return "SavingsAccount{" +
        "Balance=" + getBalance() +
        '}';
    }
}