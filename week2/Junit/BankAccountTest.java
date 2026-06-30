import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {


    BankAccount account;
    @Before
    public void setUp() {

        System.out.println("Setting up test environment");

        account = new BankAccount(1000);

    }
    @After
    public void tearDown() {

        System.out.println("Cleaning up test environment");

        account = null;

    }



    @Test
    public void testDeposit() {


        // ARRANGE
        double depositAmount = 500;


        // ACT
        account.deposit(depositAmount);


        // ASSERT
        assertEquals(1500, account.getBalance(),0);

    }



    @Test
    public void testWithdraw() {


        // ARRANGE
        double withdrawAmount = 300;


        // ACT
        account.withdraw(withdrawAmount);


        // ASSERT
        assertEquals(700, account.getBalance(),0);

    }

}
