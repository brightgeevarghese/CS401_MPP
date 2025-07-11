package lesson4.open_closed_principle;

public class Main {
    public static void main(String[] args) {
        Object[] accounts = {
                new SavingsAccount(),
                new SavingsAccount(),
                new SavingsAccount(),
                new CheckingAccount(),
                //add retirement account
                new RetirementAccount()
        };
        //find total salary
        double totalBalance = 0;
        for (Object account: accounts) {//Object account = new SavingsAccount();
            if(account instanceof SavingsAccount savingsAccount) {
                totalBalance += savingsAccount.getBalance();
            }
            if(account instanceof CheckingAccount checkingAccount) {
                totalBalance += checkingAccount.getBalance();
            }
            if(account instanceof RetirementAccount retirementAccount) {
                totalBalance += retirementAccount.getBalance();
            }
        }
        System.out.println("Total balance: " + totalBalance);

        //For open-closed principle, use polymorphism
        Account[] myAccounts = {
                new SavingsAccount(),
                new SavingsAccount(),
                new SavingsAccount(),
                new CheckingAccount()
        };

        double totalBalance2 = 0;
        for (Account account: myAccounts) {
            totalBalance2 += account.getBalance();
        }
    }
}
