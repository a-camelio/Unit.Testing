import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest extends Account {


    @Test
    void deposit(double amount) {
        amount = Account.amount;
        double depositAmount = 200.00;
        if (depositAmount > amount)
        {
            System.out.println("Amount deposited:");
            amount = amount + depositAmount;
        }
        else
        {
            System.out.println("Deposit amount too low.");
        }
    }

    @Test
    void withdraw() {
        double mainAccount = this.amount;
        double fee = 3.00;
        double withdrawAmount = 400.00;

        if (withdrawAmount > mainAccount)
        {
            System.out.println("Insufficient funds. $3.00 fee...");
            mainAccount = mainAccount - fee;
            System.out.println("Your balance is now $" + "mainAccount" );
        }
        else
        {
            mainAccount = mainAccount - transferAmount;
            System.out.println("Withdrawal complete. Balance is $" + mainAccount);
        }
    }

    @Test
    void addInterestTransaction(double saveAccount, double goodInt, double calcInt) {
        saveAccount = testSavingsAccount.startBalance;
        goodInt = testSavingsAccount.intRate;

        if (saveAccount > 100)
        {
            calcInt = (intRate / 100) * saveAccount;
            saveAccount = saveAccount + calcInt;
            System.out.println("Interest earned is: $" + calcInt + "The current balance is: $" + saveAccount);
        }
        else
        {
            System.out.println("account must have over $50 to gain interest");
        }

    }