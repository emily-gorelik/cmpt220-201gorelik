
public class Problem11_3 {
    public static void main(String[] args) {
        //creates account object
        Account account = new Account(111, 200);
        //creates checking account object
        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
        //creates savings account object
        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

        //prints result
        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }
}
