import banking.Account;
import banking.Bank;
import banking.Customer;
import banking.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.script.ScriptContext;
import java.util.SortedSet;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getBankTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        // when
        Bank result = test_customer.getBank();
        // then
        Assertions.assertEquals(test_bank, result);
    }

    @Test
    void getCustomerIdTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        // when
        String result = test_customer.getCustomerId();
        // then
        Assertions.assertEquals("", result);
    }

    @Test
    void getLastNameTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        // when
        String result = test_customer.getLastName();
        // then
        Assertions.assertEquals("Smith", result);
    }

    @Test
    void getFirstNameTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        // when
        String result = test_customer.getFirstName();
        // then
        Assertions.assertEquals("John", result);
    }

    @Test
    void getCustomerAccountsTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        final Account test_account1 = new Account(test_customer, 25.43, "Checking") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        final Account test_account2 = new Account(test_customer, 11111.22, "Savings") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        // when
        boolean result = test_customer.getCustomerAccounts().contains(test_account1) && test_customer.getCustomerAccounts().contains(test_account2);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void ytdFeesTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        // when
        double result = test_customer.ytdFees();
        // then
        Assertions.assertEquals(0.0, result);
    }

    @Test
    void ytdInterestTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        // when
        double result = test_customer.ytdInterest();
        // then
        Assertions.assertEquals(0.0, result);
    }

    @Test
    void addSavingsAccountTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        final double test_value = 45.33;
        final String test_desc = "Account description";
        final SavingsAccount test_savings = new SavingsAccount(test_customer, test_value, test_desc);
        // when
        test_customer.addSavingsAccount(test_value, test_desc);
        boolean result = test_customer.getCustomerAccounts().contains(test_savings);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void removeAccount() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        final String test_account_id = "123";
        final Account test_account1 = new Account(test_customer, 25.43, "Checking") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        // when
        test_customer.removeAccount(test_account_id);
        Boolean result = test_customer.getCustomerAccounts().contains(test_account1);
        // then
        Assertions.assertEquals(false, result);
    }

    @Test
    void getAccount() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer test_customer = new Customer(test_bank, "Smith", "John");
        final String test_account_id = "123";
        final Account test_account1 = new Account(test_customer, 25.43, "Checking") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        // when
        Account result = test_customer.getAccount(test_account_id);
        // then
        Assertions.assertEquals(test_account1, result);
    }

    @Test
    void testToString() {
        fail("Not implemented yet");
    }

    @Test
    void testHashCode() {
        fail("Not implemented yet");
    }

    @Test
    void testEquals() {
        fail("Not implemented yet");
    }

    @Test
    void compareTo() {
        fail("Not implemented yet");
    }
}