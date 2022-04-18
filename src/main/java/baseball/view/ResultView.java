package baseball.view;

import baseball.model.BallResult;

public class ResultView {

    private static final String BALL_STRIKE_MESSAGE = "%d볼 %d스트라이크";
    private static final String STRIKE_MESSAGE = "%d스트라이크";

    private static final String BALL_MESSAGE = "%d볼";

    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String WIN_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RETRY_END_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private ResultView() {
    }

    public static boolean printResult(BallResult ballResult) {
        if (ballResult.isEnd()) {
            printStrike(ballResult.getStrike());
            printWin();
            printRetryAndEnd();
            return true;
        }

        if (ballResult.isNothing()) {
            printNothing();
            return true;
        }

        if (ballResult.isBallAndStrike()) {
            printBallAndStrike(ballResult.getBall(), ballResult.getStrike());
            return true;
        }

        if (ballResult.isStrike()) {
            printStrike(ballResult.getStrike());
            return true;
        }

        if (ballResult.isBall()) {
            printBall(ballResult.getBall());
            return true;
        }

        return false;

    }

    public static void printStrike(int strike) {
        System.out.println(String.format(STRIKE_MESSAGE, strike));
    }

    public static void printBallAndStrike(int ball, int strike) {
        System.out.println(String.format(BALL_STRIKE_MESSAGE, ball, strike));
    }

    public static void printBall(int ball) {
        System.out.println(String.format(BALL_MESSAGE, ball));
    }

    public static void printNothing() {
        System.out.println(NOTHING_MESSAGE);
    }

    public static void printWin() {
        System.out.println(WIN_MESSAGE);
    }

    public static void printRetryAndEnd() {
        System.out.println(RETRY_END_MESSAGE);
    }

}
