import banking.Bank;
import banking.Transaction;
import banking.TransactionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void getId() {
        // given
        final Transaction test_transaction = new Transaction(TransactionType.DEPOSIT, 10.00, "Paycheck");
        // when
        double result = test_transaction.getId();
        // then
        Assertions.assertEquals(1, result);
    }

    @Test
    void getTimestamp() {
        // given
        final Transaction test_transaction = new Transaction(TransactionType.DEPOSIT, 10.00, "Paycheck");
        // when
        LocalDateTime result = test_transaction.getTimestamp();
        // then
        Assertions.assertEquals(LocalDateTime.now(), result);
    }

    @Test
    void getType() {
        // given
        final Transaction test_transaction = new Transaction(TransactionType.DEPOSIT, 10.00, "Paycheck");
        // when
        TransactionType result = test_transaction.getType();
        // then
        Assertions.assertEquals(TransactionType.DEPOSIT, result);
    }

    @Test
    void getAmount() {
        // given
        final Transaction test_transaction = new Transaction(TransactionType.DEPOSIT, 11.22, "Paycheck");
        // when
        double result = test_transaction.getAmount();
        // then
        Assertions.assertEquals(11.22, result);
    }

    @Test
    void getDescription() {
        // given
        final Transaction test_transaction = new Transaction(TransactionType.DEPOSIT, 10.00, "Paycheck");
        // when
        String result = test_transaction.getDescription();
        // then
        Assertions.assertEquals("Paycheck", result);
    }
}