//import java.util.Scanner;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Account myAccount1 = new Account("Kelvin Ifeanyi");
        Account myAccount2 = new Account("Glory Lawrence-Ifeanyi");

        System.out.printf("Name for Account1 is: %s\n", myAccount1.getName());
        System.out.printf("Name for Account2 is: %s\n", myAccount2.getName());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for Account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        myAccount1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

        System.out.println("Please enter deposit amount for Account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        myAccount2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());
    }
}
