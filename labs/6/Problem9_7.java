
import java.util.Date;
public class Account {
    private int id = 0; //variable that stores id number
    private double balance = 0; // variable that stores account balance
    private double annualInterestRate = 0; // variable that stores annual interest rate
    private Date dateCreated = new Date(); // date object that represents the date the account was created
    
    //no-arg constructor
    public Account() {
    }
    
    //constructor that takes the id number and account balance
    public Account (int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    //accessor method for the account id
    private int getId() {
        return id;
    }
    
    //mutator method for the account id
    private void setId(int newId) {
        id = newId;
    }
    
    //accessor method for the account balance
    private double getBalance() {
        return balance;
    }
    
    //mutator method for the account balance
    private void setBalance(double newBalance) {
        balance = newBalance;
    }
    
    //accessor method for the annual interest rate
    private double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    //mutator method for the annual interest rate
    private void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    
    //accessor method for the date the account was created
    private Date getDateCreated() {
        return dateCreated;
    }
    
    //method that calculates and returns the monthly interest rate
    private double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }
    
    //method that calculates and returns the monthly interes
    private double getMonthlyInterest() {
       return balance * getMonthlyInterestRate(); 
    }
    
    //method that withdraws an amount from the account balance
    private void withdraw(double subtract) {
        balance -= subtract;
    }
    
    //method that deposites and amount from the accoutn balance
    private void deposit(double add) {
        balance += add;
    }
    
    //tester method
    public static void main(String[] args) {
        //creates account object and sets an annual interes rate
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);
        
        //withdraws $2500 and prints balance
        a1.withdraw(2500);
        System.out.println("Balance after withdrawing $2500: " +a1.getBalance());
        
        //deposites $300 and prints the balance
        a1.deposit(3000);
        System.out.println("Balance after depositing $3000: "+ a1.getBalance());
        
        //prints monthly interest
        System.out.println("Monthly interest is: " + a1.getMonthlyInterest());
        
        //prints date account was created
        System.out.println("Date when account was created: " + a1.getDateCreated());
    }
}
