package models;

public class BankAccount {
    private final int number;
    private final String agency;
    private final String clientName;
    private final double balance;

    private BankAccount(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public static BankAccount create(int number, String agency, String clientName) {
        return new BankAccount(number, agency, clientName, 0);
    }

    // Getters

    public int getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public String getClientName() {
        return clientName;
    }

    public double getBalance() {
        return balance;
    }
}
