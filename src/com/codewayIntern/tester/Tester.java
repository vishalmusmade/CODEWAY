package com.codewayIntern.tester;
import com.codewayIntern.atm.ATM;
import com.codewayIntern.atm.BankAccount;
import java.util.Scanner;

//Main class to demonstrate the ATM system
public class Tester {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Initialize user's bank account with an initial balance
     BankAccount userAccount = new BankAccount(1000.0);

     // Create an ATM instance connected to the user's bank account
     ATM atmMachine = new ATM(userAccount);

     while (true) {
         // Display ATM options
         System.out.println("\nATM Options:");
         System.out.println("1. Withdraw");
         System.out.println("2. Deposit");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");

         // Get user input
         System.out.print("Enter your choice (1-4): ");
         int choice = scanner.nextInt();

         // Process user choice
         switch (choice) {
             case 1:
                 System.out.print("Enter withdrawal amount: $");
                 double withdrawAmount = scanner.nextDouble();
                 atmMachine.withdraw(withdrawAmount);
                 break;
             case 2:
                 System.out.print("Enter deposit amount: $");
                 double depositAmount = scanner.nextDouble();
                 atmMachine.deposit(depositAmount);
                 break;
             case 3:
                 atmMachine.checkBalance();
                 break;
             case 4:
                 System.out.println("Exiting ATM. Thank you!");
                 scanner.close();
                 System.exit(0);
             default:
                 System.out.println("Invalid choice. Please enter a number between 1 and 4.");
         }
     }
 }
}


