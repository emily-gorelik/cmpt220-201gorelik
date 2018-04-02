import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(){
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12 * balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\n" + "Interest rate: " + annualInterestRate + "\n" + "Balance: " + balance;
    }
}