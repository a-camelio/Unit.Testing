import banking.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;

class AccountTest {

    Customer = "Hymie Piffl";
    String acctID = "1234";
    String description = "Account balance is low";
    LocalDateTime openingDate = LocalDateTime.now();
    double amount = 300.00;
    private double account;

    @Test
    void deposit () {
        double testAmount = this.amount;
        if (testAmount > 20) {
            System.out.println(testAmount + " Has been deposited into your account. ");
        } else
            System.out.println("Enter an amount greater than 20 to continue transaction.");
    }

    @Test
    void withdraw () {
        double mainAccount = this.amount;
        double fee = 3.00;
        double withdrawAmount = 600.00;
        double transferAmount;

        if (withdrawAmount > mainAccount) {
            System.out.println("Insufficient funds. Please re-enter deposit amount. Accessing fee is $3.");
            mainAccount = mainAccount - fee;
            System.out.println("Your balance is $" + "mainAccount");
        } else {
            mainAccount = mainAccount - transferAmount;
            System.out.println("Withdrawal is complete. Your balance is now $" + mainAccount);
        }
    }


        @Test
        void transfer () {
            double sendAcctBalance = 500;
            double receiveAcctBalance = 300;
            double xferAmount = 45;
            double recieveAcctBalance;
            if (xferAmount < 60) {
                sendAcctBalance = sendAcctBalance - xferAmount;
                receiveAcctBalance = recieveAcctBalance + xferAmount;
                System.out.println("Transfer successful! Your account balance is now $" + xferAmount);
            } else
                System.out.println("Transfer amount must be at least $60");
        }


        @Test
        void getAccountDescription () {
            String acctDescription = this.description;
            String errorDescription = " This Account Is Closed";

            if (errorDescription.matches(acctDescription)) {
                System.out.println("Correct account description");
            } else
                System.out.println("Error, please re-enter.");
        }

        @Test
        void setAccountDescription () {
            String acctDescription = "Savings";
            String copyDescription = this.description;

            if (acctDescription.matches(copyDescription)) {
                System.out.println("Account description set");
            } else
                System.out.println("Error, please re-enter.");
        }

        @Test
        void getBalance () {
            double currentBalance = this.amount;
            System.out.println("Your current balance is: $" + currentBalance);
        }

        @Test
        void getTransactions () {
            return acctDescription;
        }

        @Test
        void getTransaction () {
            String transactionID = "123";
            try {
                if (transactionID.matches("321")) {
                    System.out.println("Transaction found");
                } else
                    System.out.println("Transaction not found.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Test
        void getAccountId () {
            String mainID = this.acctID;
            return mainID;
        }

        @Test
        void getCustomerId () {
            String mainID = this.customer;
            return mainID;
        }

        @Test
        void getAccountCreationDate () {
            LocalDateTime openDate = this.creationDate;
            return openDate;
        }

        @Test
        void testHashCode () {
            fail("Not yet implemented");
        }

        @Test
        void testEquals() {
            double test1;
            double test2;
            test1 = this.account;
            test2 = this.account;
                
                Test A1 = new Test(20, 30);
                Test A2 = new Test(20, 31);
                if (A1.equals(A2)) {
                    System.out.println("Objects are equal");
                }
                else
                {
                    System.out.println("Objects are not equal");
                }
            }

        @Test
        void compareTo () {
            String b1 = this.acctID;
            String b2 = "01234";
            if (!(b1 == b2)) {
                int b3 = b1.compareTo(b2);
                System.out.println("Results: " + b3);
            }
            else
            {
                System.out.println("Items are equal therefore no comparison can be generated.");
            }
        }

        @Test
        void testToString () {
            fail("Not yet implemented");
        }
    }
}
