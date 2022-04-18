package baseball.controller;

import baseball.model.BallResult;
import baseball.model.Balls;
import baseball.model.BallsFactory;
import baseball.model.ComputerBallsFactory;
import baseball.view.InputView;
import baseball.view.ResultView;
import java.util.List;

public class BallGame {

    public BallGame() {
    }

    public void play() {

        boolean isEnd = false;
        Balls computerBalls = ComputerBallsFactory.makeBalls();

        while (!isEnd) {
            List<Integer> ballNumbers = InputView.inputBallsNumber();

            Balls userBalls = BallsFactory.makeBalls(ballNumbers);

            BallResult ballResult = computerBalls.match(userBalls);

            ResultView.printResult(ballResult);

            isEnd = isEnd(ballResult.isEnd());

            computerBalls = ComputerBallsFactory.retryMakeBalls(isEnd, ballResult.getStrike(), computerBalls);
        }

    }

    private boolean isEnd(boolean isEnd) {
        if (isEnd) {
            String inputRetryNumber = InputView.inputRetryNumber();
            return inputRetryNumber.equals("2");
        }

        return false;
    }

}
