import javax.swing.JOptionPane;
import java.util.Random;

public class BankApp {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        if (name == null){
            JOptionPane.showMessageDialog(null, "Account creation cancelled.");
            return;
        }
        String balanceStr = JOptionPane.showInputDialog("How much do you want to open this account with?:");
        if (balanceStr == null) {
            JOptionPane.showMessageDialog(null, "Account creation cancelled.");
            return;
        }
        double balance = Double.parseDouble(balanceStr);
        String pin = JOptionPane.showInputDialog("Enter a 4-digit PIN:");
        if (pin == null) {
            JOptionPane.showMessageDialog(null, "Account creation cancelled.");
            return;
        }
        Random rand = new Random();
        long number = rand.nextLong(9000000000L) + 1000000000L;
        String accountNumber = String.valueOf(number);

        BankAccount account = new BankAccount(name, accountNumber, balance, pin);
        JOptionPane.showMessageDialog(null, "Account created successfully for " + name + "! Your account number is " + accountNumber);

        while (true) {
            String[] options = {"Deposit", "Withdraw", "View Balance", "Exit"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Account Name: " + account.getName() + "\nAccount Number: " + account.getNumber() + "\n Account Balance: NGN" + account.getBalance(),
                    "IKIGAI BANK",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice == 3 || choice == -1) {
                JOptionPane.showMessageDialog(null, "Thank you for banking with Ikigai Bank!");
                break;
            }

            if (choice == 0) {
                String pinInput = JOptionPane.showInputDialog("Enter PIN:");
                if (pinInput == null) continue;
                String amountStr = JOptionPane.showInputDialog("Enter amount to deposit:");
                if (amountStr == null) continue;
                double amount = Double.parseDouble(amountStr);
                account.deposit(amount, pinInput);
                JOptionPane.showMessageDialog(null, "Deposit successful! New balance: NGN" + account.getBalance());
            }
            if (choice == 1) {
                String pinInput = JOptionPane.showInputDialog("Enter PIN:");
                if (pinInput == null) continue;
                String amountStr = JOptionPane.showInputDialog("Enter amount to withdraw:");
                if (amountStr == null) continue;
                double amount = Double.parseDouble(amountStr);
                account.withdraw(amount, pinInput);
                JOptionPane.showMessageDialog(null, "Withdrawal successful! New balance: NGN" + account.getBalance());
            }
            if (choice == 2) {
                JOptionPane.showMessageDialog(null, "Balance: NGN" + account.getBalance());
            }
        }
    }
}