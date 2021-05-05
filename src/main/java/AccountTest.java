import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Customer customer = "Hymie Piffl";
    string acctID = "1234";
    string description = "Account balance is low!";
    LocalDateTime openingDate = LocalDateTime.now();
    double amount = 300.00;

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

        if (withdrawAmount > mainAccount) {
            System.out.println("Insufficient funds. Please re-enter deposit amount. Accessing fee is $3.");
            mainAccount = mainAccount - fee;
            System.out.println("Your balance is $" + "mainAccount");
        } else {
            mainAccount = mainAccount - transferAmount;
            System.out.println("Withdrawal is complete. Your balance is now $" + mainAccount);
        }


        @Test
        void transfer () {
            double sendAcctBalance = 500;
            double receiveAcctBalance = 300;
            double xferAmount = 45;
            if (xferAmount < 60) {
                sendAcctBalance = sendAcctBalance - xferAmount;
                receiveAcctBalance = recieveAcctBalance + xferAmount;
                System.out.println("Transfer successful! Your account balance is now $" + xferAmount);
            } else
                System.out.println("Transfer amount must be at least $60");
        }


        @Test
        void getAccountDescription () {
            string acctDescription = this.description;
            string errorDescription = " This Account Is Closed";

            if (errorDescription.matches(acctDescription)) {
                System.out.println("Correct account description");
            } else
                System.out.println("Error, please re-enter.");
        }

        @Test
        void setAccountDescription () {
            string acctDescription = "Savings";
            string copyDescription = this.description;

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
            string transactionID = "123";
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
            string mainID = this.acctID;
            return mainID;
        }

        @Test
        void getCustomerId () {
            string mainID = this.customer;
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
        public Test( double test1, double test2){
                    test1 = this.account;
                    test2 = this.account;
                }
                Test A1 = new Test(20, 30);
                Test A2 = new Test(20, 31);
                if (A1.equals(A2)) {
                    println("Objects are equal");
                }
                else
                {
                    println("Objects are not equal");
                }
            }

        @Test
        void compareTo () {
            string b1 = this.acctID;
            string b2 = "01234";
            if (!(b1 == b2)) {
                string b3 = b1.compareTo(b2);
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
