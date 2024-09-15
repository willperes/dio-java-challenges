package main.com.willperes.bankaccount;

import java.util.Scanner;

import main.com.willperes.bankaccount.models.BankAccount;

public class AccountTerminal {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("\n\nWelcome to DIO Bank.\n");

        System.out.println("To create a new account, please type the Agency code:");
        final String accountAgencyCode = sc.next();

        System.out.println("Now, insert the account number:");
        final int accountNumber = sc.nextInt();

        System.out.println("Now, insert the account owner name:");
        final String accountOwnerName = sc.next();

        final BankAccount bankAccount = BankAccount.create(accountNumber, accountAgencyCode, accountOwnerName);
        System.out.println("Thank you for trusting us and creating your account!");
        System.out.println("Agency: " + bankAccount.getAgency());
        System.out.println("Number: " + bankAccount.getNumber());
        System.out.println("Balance: " + bankAccount.getBalance());

        sc.close();
    }
}
