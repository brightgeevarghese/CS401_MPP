package lesson4.open_closed_principle;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    abstract public double getBalance();

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
