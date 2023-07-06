package sprint06.exceptions.financialcalculatorexception;

public class LimitException extends RuntimeException {

    private final int attempts;

    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public String getAttemptMessage() {
        return getMessage() + ": " + attempts;
    }
}