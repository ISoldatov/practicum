package sprint07.junit.moneytransfer;

public class MoneyTransferService {
    public void transfer(int amount, Account accountOne, Account accountTwo) {
        // переводить деньги можно только на другой счёт
        if (accountOne.id.equals(accountTwo.id))
            throw new IllegalArgumentException("Нельзя перевести деньги на тот же аккаунт. Id: " + accountOne.id);

        // сумма перевода должна быть больше 0
        if (amount <= 0)
            throw new IllegalArgumentException("Сумма перевода должна быть больше 0. Текущая сумма: " + amount);

        // баланс не может стать отрицательным
        if (amount > accountOne.balance)
            throw new IllegalArgumentException("Недостаточно средств на счёте с id " + accountOne.id + ". Перевод суммы " + amount + " невозможен.");

        // перевод не должен приводить к переполнению баланса
        if (accountTwo.balance + amount < 0)
            throw new IllegalArgumentException("Перевод невозможен. Если транзакция выполнится, счёт с " + accountTwo.id + " будет переполнен.");

        accountOne.balance -= amount;
        accountTwo.balance += amount;
    }
}

