//import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Account myAccount1 = new Account("Kelvin Ifeanyi");
        Account myAccount2 = new Account("Glory Lawrence-Ifeanyi");

        System.out.printf("Name for Account1 is: %s\n", myAccount1.getName());
        System.out.printf("Name for Account2 is: %s\n", myAccount2.getName());
    }
}
