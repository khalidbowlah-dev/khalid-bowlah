import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashPaymentTest {

    @Test
    void testCashProcess() {
        // 1. Create a payment: Cost $50, User gives $60
        CashPayment pay = new CashPayment(50.00, 60.00);

        // 2. Run the process (Just checking it doesn't crash)
        pay.processPayment();

        // 3. Confirm the object was created
        assertNotNull(pay);
    }
}
