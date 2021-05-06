import banking.Account;
import banking.Bank;
import banking.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.SortedSet;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void main() {

    }

    @Test
    void GetInsufficientFundsPenaltyTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        // when
        double result = test_bank.getInsufficientFundsPenalty();
        // then
        Assertions.assertEquals(10.00, result);
    }

    @Test
    void setInsufficientFundsPenaltyTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        // when
        test_bank.setInsufficientFundsPenalty(20.25);
        double result = test_bank.getInsufficientFundsPenalty();
        // then
        Assertions.assertEquals(20.25, result);
    }

    @Test
    void getNAMETest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        // when
        String result = test_bank.getNAME();
        // then
        Assertions.assertEquals("Bank of America", result);
    }

    @Test
    void addAccountWizardTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer = new Customer(test_bank, "Smith", "John");
        final Account account = new Account(customer, 15.55, "Savings") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        // when
        test_bank.addAccountWizard();
        boolean result = test_bank.getAllAccounts().contains(account);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void getAllAccountsTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer = new Customer(test_bank, "Smith", "John");
        final Account account1 = new Account(customer, 15.55, "Savings") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        final Account account2 = new Account(customer, 585.44, "Description of account") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        // when
        boolean result = test_bank.getAllAccounts().contains(account1) && test_bank.getAllAccounts().contains(account2);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void addCustomerWizardTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer = new Customer(test_bank, "Smith", "John");
        // when
        test_bank.addCustomerWizard();
        boolean result = test_bank.getAllCustomers().contains(customer);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void addCustomerTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer = new Customer(test_bank, "Smith", "John");
        final String test_last_name = "Smith";
        final String test_first_name = "John";
        // when
        test_bank.addCustomer(test_last_name, test_first_name);
        boolean result = test_bank.getAllCustomers().contains(customer);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void removeCustomerTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer = new Customer(test_bank, "Smith", "John");
        final String test_customer_id = "1234";
        // when
        test_bank.removeCustomer(test_customer_id);
        boolean result = test_bank.getAllCustomers().contains(customer);
        // then
        Assertions.assertEquals(false, result);
    }

    @Test
    void getAllCustomersTest() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer1 = new Customer(test_bank, "Smith", "John");
        final Customer customer2 = new Customer(test_bank, "Doe", "Jane");
        final SortedSet<Customer> test_set = null;
        test_set.add(customer1);
        test_set.add(customer2);
        // when
        test_bank.getAllCustomers();
        boolean result = test_bank.getAllCustomers().contains(customer1) && test_bank.getAllCustomers().contains(customer1);
        // then
        Assertions.assertEquals(true, result);
    }

    @Test
    void getCustomersAccounts() {
        // given
        final Bank test_bank = new Bank("Bank of America");
        final Customer customer1 = new Customer(test_bank, "Smith", "John");
        final SortedSet<Account> test_set = null;
        final Account account1 = new Account(customer1, 15.55, "Savings") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        final Account account2 = new Account(customer1, 33.33, "Hi there!") {
            @Override
            public void deposit(double amount) { }
            @Override
            public void withdraw(double amount) { }
        };
        test_set.add(account1);
        test_set.add(account2);
        // when
        test_bank.getAllAccounts();
        boolean result = test_bank.getAllAccounts().contains(account1) && test_bank.getAllCustomers().contains(account2);
        // then
        Assertions.assertEquals(true, result);
    }
}