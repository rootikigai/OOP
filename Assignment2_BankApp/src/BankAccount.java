public class BankAccount extends Bank {
    private String name;
    private String number;
    private double balance;

    public BankAccount(String name, String number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if(amt > 0){
            balance = balance + amt;
        }
    }

    public void withdraw(double amt) {
        if(amt <= balance){
            balance = balance - amt;
        }
    }
}
