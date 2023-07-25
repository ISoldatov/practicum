package sprint07.junit.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(new Integer(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlock() {
        BankAccount account = new BankAccount("a", "b");
        account.block();
        assertTrue(account.isBlocked());
    }

    @Test
    public void shoulbBeNameAndSouname() {
        BankAccount account = new BankAccount("a", "b");
        String[] name = account.getFullName();
        assertEquals("a", name[0]);
        assertEquals("b", name[1]);
    }

    @Test
    public void activate() {
        BankAccount account = new BankAccount("a", "b");
        assertThrows(IllegalStateException.class, () -> account.getAmount());
        assertNull(account.getCurrency());
    }
}
