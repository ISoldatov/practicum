package sprint07.junit.moneytransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoneyTransferTest {
    private final MoneyTransferService moneyTransferService = new MoneyTransferService();

    @Test
    public void shouldMakeTransfer() {
        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);

        moneyTransferService.transfer(7, accountOne, accountTwo);
        assertEquals(3, accountOne.balance);
        assertEquals(17, accountTwo.balance);
    }

    @Test
    public void shouldNotTransferMoneyOnSameAccount() {
        Account accountOne = new Account("1", 10);
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                moneyTransferService.transfer(5, accountOne, accountOne);
            }
        });

        assertEquals("Нельзя перевести деньги на тот же аккаунт. Id: 1", ex.getMessage());
    }

    @Test
    public void shouldNotTransferZero() {

        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                moneyTransferService.transfer(0, accountOne, accountTwo);
            }
        });

        assertEquals("Сумма перевода должна быть больше 0. Текущая сумма: 0", ex.getMessage());
    }

    @Test
    public void shouldNotMakeBalanceLessThanZero() {

        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", 10);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                moneyTransferService.transfer(15, accountOne, accountTwo);
            }
        });

        assertEquals("Недостаточно средств на счёте с id 1. Перевод суммы 15 невозможен.", ex.getMessage());
    }

    @Test
    public void shouldNotMakeOverflowOnTransfer() {

        Account accountOne = new Account("1", 10);
        Account accountTwo = new Account("2", Integer.MAX_VALUE);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() {
                moneyTransferService.transfer(1, accountOne, accountTwo);
            }
        });

        assertEquals("Перевод невозможен. Если транзакция выполнится, счёт с id 2 будет переполнен.", ex.getMessage());
    }
}
