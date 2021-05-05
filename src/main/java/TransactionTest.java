import banking.Transaction;
import banking.TransactionType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    final Transaction t = new Transaction(TransactionType.DEPOSIT, 00.00, "Paycheck");

    @Test
    void getId() {
        Assertions.assertEquals(1, t.getId());
    }

    @Test
    void getTimestamp() {
        Assertions.assertEquals(LocalDateTime.now(), t.getTimestamp());
    }

    @Test
    void getType() {
        Assertions.assertEquals(TransactionType.DEPOSIT, t.getType());
    }

    @Test
    void getAmount() {
        Assertions.assertEquals(15.25, t.getAmount());
    }

    @Test
    void getDescription() {
        Assertions.assertEquals("Paycheck", t.getDescription());
    }
}