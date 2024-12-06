package BankAccountPackage;

import java.util.Scanner;

/**
 * Represents a bank account with basic operations such as deposit, withdrawal, and account details.
 */
public class BankAccount {
    private int accNo;
    private double accb;
    private String name;
    private String email;
    private long phone;

    // Method to deposit money into the account
    public double deposit(double accb) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit:");
        double depositAmount = Double.parseDouble(scanner.nextLine());
        accb += depositAmount;
        System.out.println("Balance after deposit: " + accb);
        return accb;
    }

    // Method to withdraw money from the account
    public double withdraw(double accb) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw:");
        double withdrawAmount = Double.parseDouble(scanner.nextLine());

        if (withdrawAmount > accb) {
            System.out.println("Insufficient funds.");
            return accb; // Balance remains unchanged
        }

        accb -= withdrawAmount;
        System.out.println("Balance after withdrawal: " + accb);
        return accb;
    }

    // Getter methods
    public int getAccNo() {
        return accNo;
    }

    public double getAccb() {
        return accb;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    // Setter methods
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccb(double accb) {
        this.accb = accb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
