public class BankAccount{
    private String name;
    private String number;
    private double balance;
    private String pin;

    public BankAccount(String name, String number, double balance,  String pin) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt, String pin){
        if(this.pin.equals(pin)) {
            if (amt > 0) {
                balance = balance + amt;
            }
        }
    }

    public void withdraw(double amt, String pin){
        if(this.pin.equals(pin)) {
            if (amt <= balance) {
                balance = balance - amt;
            }
        }
    }
}
