package sprint06.exceptions.validator;

public interface Validator {
    void validate(String value) throws ValidateException;
}