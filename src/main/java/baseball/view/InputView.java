package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
    }

    public static int inputBallsNumber() {
        System.out.println("숫자를 입력해주세요");

        String ballsNumber = Console.readLine();


        return Integer.parseInt(ballsNumber);
    }

}
