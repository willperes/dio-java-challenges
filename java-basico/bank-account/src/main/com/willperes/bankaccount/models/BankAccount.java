package main.com.willperes.bankaccount.models;

public class BankAccount {
    private int number;
    private String agency;
    private String clientName;
    private double balance;

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
