// BankAccount class representing a bank account
public class BankAccount {
    
    // The next account number to be issued (common for all accounts)
    static int nextAccountNumber = 21000;

    // Fields (data for each account)
    int accountNumber;  // Account number (automatically increments starting from 21000)
    String name;        // Account holder's name
    int balance;        // Account balance
    int password;       // 4-digit password

    // Constructor (called when a new account is created)
    public BankAccount(String name, int password, int initialDeposit) {
        this.accountNumber = nextAccountNumber++;  // Assign account number sequentially
        this.name = name;                          // Set the name
        this.password = password;                  // Set the password
        this.balance = initialDeposit;             // Set the initial deposit amount
    }

    // Method to get the account number (getter)
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to authenticate the password (returns true if correct, false if incorrect)
    public boolean authenticate(int inputPassword) {
        return this.password == inputPassword;
    }

    // Deposit processing
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;  // Add the deposit amount to the balance
            System.out.println("Deposit successful. Current balance: " + balance + " yen");
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    // Withdrawal processing
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount > 0) {
            balance -= amount;  // Deduct the withdrawal amount from the balance
            System.out.println("Withdrawal successful. Current balance: " + balance + " yen");
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    // Show account balance
    public void showBalance() {
        System.out.println("Current balance: " + balance + " yen");
    }

    // Show account information (name, account number, balance)
    public void showInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance + " yen");
        System.out.println("-------------------------");
    }
}
