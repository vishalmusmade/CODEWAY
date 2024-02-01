package com.codewayIntern.atm;

//ATM class representing the ATM machine
public class ATM {
 private BankAccount bankAccount;

 public ATM(BankAccount bankAccount) {
     this.bankAccount = bankAccount;
 }

 public void withdraw(double amount) {
     if (bankAccount.withdraw(amount)) {
         System.out.println("Withdrawal successful. Remaining balance: $" + bankAccount.getBalance());
     }
 }

 public void deposit(double amount) {
     bankAccount.deposit(amount);
     System.out.println("Deposit successful. New balance: $" + bankAccount.getBalance());
 }

 public void checkBalance() {
     System.out.println("Current balance: $" + bankAccount.getBalance());
 }
}
