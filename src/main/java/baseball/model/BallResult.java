package baseball.model;

import baseball.view.InputView;

public class BallResult {

    private int strike = 0;

    private int ball = 0;

    public BallResult() {
    }

    public void record(BallStatus ballStatus) {
        if (ballStatus.isStrike()) {
            this.strike += 1;
        }

        if (ballStatus.isBall()) {
            this.ball += 1;
        }
    }

    public boolean isNothing() {
        if (strike + ball == 0) {
            return true;
        }

        return false;
    }

    public boolean isBallAndStrike() {
        if (strike > 0 && ball > 0) {
            return true;
        }

        return false;
    }

    public boolean isStrike() {
        if (strike > 0 && ball == 0) {
            return true;
        }

        return false;
    }

    public boolean isBall() {
        if (strike == 0 && ball > 0) {
            return true;
        }

        return false;
    }

    public boolean isEnd() {
        if (strike == 3) {
            return true;
        }

        return false;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}
