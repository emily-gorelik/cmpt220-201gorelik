public class CheckingAccount extends Account {

    private double OVERDRAFT_LIMIT = -100;//sets overdraft limit
    
    //constructs checkingAccount object
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    //withdraw from checking account
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    //toString method
    @Override
    public String toString() {
        return "CheckingAccount{"+
        "balance=" + getBalance() +
        '}';
    }
}