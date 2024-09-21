// Create a class BankAccount with attributes like account number, balance,
// account holder and name. Create an array of BankAccount objects to store
// bank accounts. Implement methods to deposit money, withdraw money and
// check balance.

import java.util.Scanner;

class BankAccount {
    int accountnumber;
    double balance;
    String accountholder;
    String name;

    public BankAccount(int accountnumber, double balance, String accountholder, String name) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.accountholder = accountholder;
        this.name = name;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        } else {
            System.out.println("Deposit is must in positive");
        }

    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
        } else {
            System.out.println("You can't withdraw money : ");
        }
    }

    double checkBalance() {
        return balance;
    }

    public String display() {
        return "Account Number : " + accountnumber +
                "\nBalance : " + balance +
                "\nAccount Holder : " + accountholder +
                "\nname : " + name;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number : ");
        int accountnumber = scanner.nextInt();

        System.out.println("Enter balance : ");
        double balance = scanner.nextDouble();

        System.out.println("Enter accountholder : ");
        scanner.nextLine();
        String accountholder = scanner.nextLine();

        System.out.println("Enter name : ");
        String name = scanner.nextLine();

        BankAccount b = new BankAccount(accountnumber, balance, accountholder, name);
        System.out.println(b.display());

        System.out.println("Enter amount of deposit : ");
        double dipositamount = scanner.nextDouble();
        b.deposit(dipositamount);

        System.out.println("Enter amount of withdraw : ");
        double withdrawamount = scanner.nextDouble();
        b.withdraw(withdrawamount);

        System.out.println("Balance : " + b.checkBalance());

    }
}
