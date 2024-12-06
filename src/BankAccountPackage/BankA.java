package BankAccountPackage;

/**
 * Main class to interact with the BankAccount class and simulate banking operations.
 */
public class BankA {
    public static void main(String[] args) {
        // Create an instance of BankAccount and set details
        BankAccount ba = new BankAccount();
        ba.setAccNo(12345);
        ba.setAccb(11000.75);
        ba.setName("Amna");
        ba.setEmail("amna@gmail.com");
        ba.setPhone(03004072002);

        // Display the balance and perform deposit and withdrawal
        System.out.println("Your balance is: " + ba.getAccb());
        ba.setAccb(ba.deposit(ba.getAccb())); // Update balance after deposit
        ba.setAccb(ba.withdraw(ba.getAccb())); // Update balance after withdrawal

        // Display account information
        System.out.println("Account Number: " + ba.getAccNo());
        System.out.println("Account Balance: " + ba.getAccb());
        System.out.println("Account Holder: " + ba.getName());
        System.out.println("Email: " + ba.getEmail());
        System.out.println("Phone Number: " + ba.getPhone());
    }
}
