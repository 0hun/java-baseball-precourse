package baseball.view;

import baseball.utils.MessageUtil;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
    }

    public static int inputBallsNumber() {
        System.out.print(MessageUtil.numberInputMessage);

        String ballsNumber = Console.readLine();

        return Integer.parseInt(ballsNumber);
    }

}
