package baseball.view;

import baseball.utils.MessageUtil;
import baseball.validator.Validator;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    private InputView() {
    }

    public static List<Integer> inputBallsNumber() {
        System.out.print(MessageUtil.NUMBER_INPUT_MESSAGE);

        String inputValue = Console.readLine();

        Validator.validateEmpty(inputValue);
        Validator.validateLength(inputValue);
        Validator.validateNumber(inputValue);

        return parseBallNumbers(inputValue);
    }

    private static List<Integer> parseBallNumbers(String inputValue) {
        List<Integer> ballNumbers = new ArrayList<>();

        for (String value : inputValue.split("")) {
            ballNumbers.add(Integer.parseInt(value));
        }

        Validator.validateEqualNumbers(ballNumbers);

        return ballNumbers;
    }

}
