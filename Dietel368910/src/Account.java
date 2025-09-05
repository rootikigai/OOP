public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public Account(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void deposit(double depositAmount) {
        if (depositAmount < 0.00) {
            System.out.println("deposit amount is negative");
        }
        else if (depositAmount > 0.00) {
            balance = balance + depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
