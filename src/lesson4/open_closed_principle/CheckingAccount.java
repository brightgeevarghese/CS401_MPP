package lesson4.open_closed_principle;

public class CheckingAccount extends Account {
    private double overdraftLimit;
    private double monthlyFee;
    private String debitCardNumber;

    @Override
    public double getBalance() {
        return 1000;
    }
}
