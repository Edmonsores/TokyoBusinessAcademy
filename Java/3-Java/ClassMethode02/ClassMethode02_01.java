import java.util.Scanner;

public class ClassMethode02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold bank accounts (maximum 20 accounts)
        BankAccount[] accounts = new BankAccount[20];

        // Initializing 5 accounts with sample data
        accounts[0] = new BankAccount("Person A", 1234, 10000);
        accounts[1] = new BankAccount("Person B", 2345, 20000);
        accounts[2] = new BankAccount("Person C", 3456, 15000);
        accounts[3] = new BankAccount("Person D", 4567, 5000);
        accounts[4] = new BankAccount("Person E", 5678, 12000);

        // Tracking the number of registered accounts
        int registeredCount = 5;
        boolean running = true; // Control flag for the main loop

        // Main loop for selecting different operations
        while (running) {
            System.out.println("処理番号を入力してください（1:新規登録 2:入金 3:出金 4:残高表示 その他:終了）：");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // New account registration
                    if (registeredCount >= 20) {
                        System.out.println("これ以上登録できません。");
                        break;
                    }
                    System.out.print("名前：");
                    String name = scanner.next();
                    System.out.print("パスワード（4桁）：");
                    int password = scanner.nextInt();
                    System.out.print("初回預金額：");
                    int deposit = scanner.nextInt();

                    // Create a new account and store it in the array
                    accounts[registeredCount] = new BankAccount(name, password, deposit);
                    System.out.println("口座登録が完了しました。口座番号：" + accounts[registeredCount].getAccountNumber());
                    registeredCount++; // Increment the count of registered accounts
                    break;
                
                case 2: // Deposit operation
                    // Find the account and perform the deposit
                    BankAccount depositAccount = findAccount(scanner, accounts, registeredCount);
                    if (depositAccount != null) {
                        System.out.print("入金額：");
                        int amount = scanner.nextInt();
                        depositAccount.deposit(amount);
                    }
                    break;

                case 3: // Withdrawal operation
                    // Find the account and perform the withdrawal
                    BankAccount withdrawAccount = findAccount(scanner, accounts, registeredCount);
                    if (withdrawAccount != null) {
                        System.out.print("出金額：");
                        int amount = scanner.nextInt();
                        withdrawAccount.withdraw(amount);
                    }
                    break;

                case 4: // Show balance operation
                    // Find the account and show the balance
                    BankAccount balanceAccount = findAccount(scanner, accounts, registeredCount);
                    if (balanceAccount != null) {
                        balanceAccount.showBalance();
                    }
                    break;

                default: // Exit the program if input is not 1-4
                    running = false;
                    break;
            }
        }

        // Displaying all registered accounts
        System.out.println("\n全登録者情報：");
        for (int i = 0; i < registeredCount; i++) {
            accounts[i].showInfo();
        }

        scanner.close(); // Closing the scanner to free up resources
    }

    // Helper method to find and authenticate an account based on account number and password
    public static BankAccount findAccount(Scanner scanner, BankAccount[] accounts, int count) {
        System.out.print("口座番号を入力してください：");
        int inputNumber = scanner.nextInt();
        System.out.print("パスワードを入力してください：");
        int inputPassword = scanner.nextInt();

        // Searching for the account with matching account number and password
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == inputNumber && accounts[i].authenticate(inputPassword)) {
                return accounts[i]; // Return the matched account
            }
        }
        System.out.println("口座番号またはパスワードが正しくありません。"); // Error message if no match
        return null;
    }
}

