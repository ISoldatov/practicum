package sprint06.exceptions.validator;

public class NameValidator implements Validator {
    @Override
    public void validate(final String value) throws ValidateException {
        if (value.isBlank()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }


}