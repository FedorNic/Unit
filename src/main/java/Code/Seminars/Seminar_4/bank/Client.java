package Code.Seminars.Seminar_4.bank;

public class Client {
    private String name;
    private String accountNumber;
    private double balance;

    public Client(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}