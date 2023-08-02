public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        BankAccount account1 = new BankAccount(500, 500);
        BankAccount account2 = new BankAccount(750, 750);
        BankAccount account3 = new BankAccount(1000, 1000);

        System.out.println(BankAccount.getTotalMoney());
        System.out.println(BankAccount.getAccounts());
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney

        account1.deposit(50,0);
        account1.displayStatus();

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account2.withdrawl(0,250);
        account2.displayStatus();

        // Static Test (print the number of bank accounts and the totalMoney)


        System.out.println(BankAccount.getTotalMoney());
        System.out.println(BankAccount.getAccounts());

        System.out.println(account1.fullBalance());

    }
}
