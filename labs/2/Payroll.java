//problem 4.23
import java.util.Scanner;
import java.text.DecimalFormat;
public class Payroll {
    public static void main(String[] args) {
        //get name
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = inputName.next();
        
        //get hours worked
        Scanner inputHours = new Scanner(System.in);
        System.out.print("Enter number of hours worked in a week: ");
        double hours = inputHours.nextDouble();
        
        //get pay rate
        Scanner inputPayRate = new Scanner(System.in);
        System.out.print("Enter hourly pay rate: ");
        double payRate = inputPayRate.nextDouble();
        
        //get federal tax withholding rate
        Scanner inputFedTax = new Scanner(System.in);
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = inputFedTax.nextDouble();
        
        //get state tax withholding rate
        Scanner inputStateTax = new Scanner(System.in);
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = inputStateTax.nextDouble(); 
        
        //format doubles to have two decimal places
        DecimalFormat df1 = new DecimalFormat(".##");
        
        //store gross pay
        double grossPay = Payroll.calculateGrossPay(payRate, hours);
        //calculate federal withholding amount
        double fedWithholding = Double.parseDouble(df1.format(grossPay * fedTax)); 
        //calculate state withholding amount
        double stateWithholding = Double.parseDouble(df1.format(grossPay * stateTax)); 
        //store net pay amount
        double netPay = Payroll.calculateNetPay(grossPay, fedTax, stateTax);
        //calculate the total deduction
        double totalDeduction = fedWithholding + stateWithholding;
        
        //display results
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("   Federal Withholding (" + fedTax * 100 + "%): $" + 
            fedWithholding);
        System.out.println("   State Withholding (" + stateTax * 100 + "%): $" + 
            stateWithholding);
        System.out.println("   Total deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
    
    //method to calculate the gross pay
    private static double calculateGrossPay(double rate, double hours) {
        DecimalFormat df = new DecimalFormat(".##");
        double grossPay = rate * hours; 
        return Double.parseDouble(df.format(grossPay));
        
    }
    
    //method to calculate the net pay
    private static double calculateNetPay(double gross, double fed, double state) {
       DecimalFormat df = new DecimalFormat(".##");
       double netPay = gross - ((gross * fed) + (gross * state)); 
       return Double.parseDouble(df.format(netPay));  
    }
}
