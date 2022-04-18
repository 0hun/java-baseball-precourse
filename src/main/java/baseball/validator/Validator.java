package baseball.validator;

import baseball.utils.MessageUtil;

public class Validator {

    private static final int NUMBER_SIZE = 3;

    private Validator() {}

    public static void validateEmpty(String value) {
        if (value == null || value.equals("")) {
            throw new IllegalArgumentException(MessageUtil.VALIDATE_EMPTY_MESSAGE);
        }
    }

    public static void validateLength(String value) {
        if (value.length() != NUMBER_SIZE) {
            throw new IllegalArgumentException(MessageUtil.VALIDATE_LENGTH_MESSAGE);
        }
    }

    public static void validateNumber(String value) {
        boolean isNumeric =  value.matches("[+-]?\\d*(\\.\\d+)?");
        if (!isNumeric) {
            throw new IllegalArgumentException(MessageUtil.VALIDATE_NUMBER_MESSAGE);
        }
    }
}
