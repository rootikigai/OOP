import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    BankAccount account;
    @BeforeEach
    public void setUp(){
        account = new BankAccount("Kelvin", "0449352277", 5000.0);
    }
    @Test
    public void testThatAccountBalance_IsNotEmpty(){
        assertTrue(account.getBalance() > 0);
    }

    @Test
    public void tesThatUserCanDeposit_AndBalanceIncreases(){
        account.deposit(1000);
        assertEquals(6000, account.getBalance());
        account.deposit(2000);
        assertEquals(8000, account.getBalance());
    }

    @Test
    public void testThatUserCanWithdraw_AndBalanceDecreases(){
        account.withdraw(3000.0);
        assertEquals(2000.0, account.getBalance());
    }

    @Test
    public void testThatAccountBalance_IsEmpty_AfterCompleteWithdrawal(){
        account.withdraw(5000.0);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testThatUserCannotWithdrawAboveBalance(){
        account.withdraw(7000);
        assertEquals(5000.0, account.getBalance());
    }

    @Test
    public void testThatDepositMoneyReflectsInAccount(){
        account.deposit(1000);
        assertEquals(6000, account.getBalance());
    }

    @Test
    public void testThatUserCannotDepositNegativeAmount(){
        account.deposit(-5000);
        assertEquals(5000, account.getBalance());
    }
}
