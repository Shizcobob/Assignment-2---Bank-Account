import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    private String accountNumber;

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = accountNumberCreator();
        accounts++;
        BankAccount.totalMoney += checkingBalance + savingsBalance;
    }

// GETTERS --------------------------------
    // for checking, savings, accounts, and totalMoney

    // Checking Setter
    public void setCheckingBalance(double checkingBalance){
    BankAccount.totalMoney -= this.checkingBalance;
    BankAccount.totalMoney += checkingBalance;
    this.checkingBalance = checkingBalance;
    }
    // Checking Getter
    public double getCheckingBalance(){
        return this.checkingBalance;
    }


    // Savings Setter
    public void setSavingsBalance(double savingsBalance){
    BankAccount.totalMoney -= this.savingsBalance;
    BankAccount.totalMoney += savingsBalance;
    this.savingsBalance = savingsBalance;
    }
    // Savings Getter
    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    // Accounts Getter
    public static int getAccounts(){
        return accounts;
    }

    // totalMoney Getter
        public static double getTotalMoney(){
            return totalMoney;
    }


// METHODS --------------
    // Display
    public void displayStatus(){
        System.out.println(this.checkingBalance);
        System.out.println(this.savingsBalance);
        System.out.println(this.accountNumber);
    }

    // deposit
    // - users should be able to deposit money into their checking or savings account

    public void deposit(double depositChecking, double depositSavings){
        this.checkingBalance += depositChecking;
        this.savingsBalance += depositSavings;
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney

    public void withdrawl(double withdrawlChecking, double withdrawlSavings){
        this.checkingBalance -= withdrawlChecking;
        this.savingsBalance -= withdrawlSavings;
    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public double fullBalance(){
        return this.checkingBalance + this.savingsBalance;
    }

    private String accountNumberCreator(){
        Random randomizer = new Random();
        int integerSize = 10;
        StringBuilder newAccountNumber = new StringBuilder();

        for (int i = 0; i < integerSize; i++){
            int random = randomizer.nextInt(10);
            newAccountNumber.append(random);
        }
        return newAccountNumber.toString();
    }

}
